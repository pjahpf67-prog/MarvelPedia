package com.marvelpedia.data

data class Character(
    val id: Int,
    val heroName: String,
    val realName: String,
    val actor: String,
    val team: String,           // "Original", "Expanded", "New Avengers"
    val status: String,         // "Active", "Deceased", "Retired"
    val bio: String,
    val powers: List<String>,
    val allies: List<String>,
    val enemies: List<String>,
    val movieAppearances: List<String>,
    val quote: String,
    val quoteSource: String,    // which film the quote is from
    val firstAppearance: String
)
