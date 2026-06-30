package com.marvelpedia.data

import android.content.Context
import android.content.SharedPreferences

data class ScoreEntry(
    val difficulty: Difficulty,
    val score: Int,
    val total: Int,
    val timestamp: Long
)

class ScoreManager(context: Context) {

    private val prefs: SharedPreferences =
        context.applicationContext.getSharedPreferences("marvelpedia_scores", Context.MODE_PRIVATE)

    companion object {
        private const val KEY_HIGH_SCORE_PREFIX = "high_score_"
        private const val KEY_HISTORY = "history"
        private const val MAX_HISTORY = 50
    }

    fun getHighScore(difficulty: Difficulty): Int =
        prefs.getInt(KEY_HIGH_SCORE_PREFIX + difficulty.name, 0)

    fun submitScore(difficulty: Difficulty, score: Int, total: Int) {
        val editor = prefs.edit()

        val currentHigh = getHighScore(difficulty)
        if (score > currentHigh) {
            editor.putInt(KEY_HIGH_SCORE_PREFIX + difficulty.name, score)
        }

        val history = getHistoryRaw().toMutableList()
        history.add(0, "${difficulty.name}|$score|$total|${System.currentTimeMillis()}")
        val trimmed = history.take(MAX_HISTORY)
        editor.putStringSet(KEY_HISTORY, trimmed.toSet())
        // StringSet loses order, so also store an ordered, delimited string
        editor.putString(KEY_HISTORY + "_ordered", trimmed.joinToString("¤"))

        editor.apply()
    }

    private fun getHistoryRaw(): List<String> {
        val ordered = prefs.getString(KEY_HISTORY + "_ordered", null)
        return if (ordered != null && ordered.isNotEmpty()) {
            ordered.split("¤")
        } else {
            emptyList()
        }
    }

    fun getHistory(): List<ScoreEntry> {
        return getHistoryRaw().mapNotNull { line ->
            val parts = line.split("|")
            if (parts.size != 4) return@mapNotNull null
            try {
                ScoreEntry(
                    difficulty = Difficulty.valueOf(parts[0]),
                    score = parts[1].toInt(),
                    total = parts[2].toInt(),
                    timestamp = parts[3].toLong()
                )
            } catch (e: Exception) {
                null
            }
        }
    }

    fun clearAll() {
        prefs.edit().clear().apply()
    }
}
