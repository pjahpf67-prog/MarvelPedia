package com.marvelpedia.data

enum class Difficulty { EASY, MEDIUM, HARD }
enum class QuestionType { MULTIPLE_CHOICE, TRUE_FALSE }

data class TriviaQuestion(
    val id: Int,
    val question: String,
    val type: QuestionType,
    val difficulty: Difficulty,
    // For MULTIPLE_CHOICE: options[0] is always the correct answer (shuffled at display time)
    // For TRUE_FALSE: options = ["True", "False"], options[0] = correct answer
    val options: List<String>,
    val explanation: String  // shown after answer
)

object TriviaRepository {

    val questions: List<TriviaQuestion> = listOf(

        // ══════════════════ EASY ══════════════════

        TriviaQuestion(
            id = 1, difficulty = Difficulty.EASY, type = QuestionType.MULTIPLE_CHOICE,
            question = "What is Tony Stark's superhero name?",
            options = listOf("Iron Man", "War Machine", "Rescue", "Iron Patriot"),
            explanation = "Tony Stark publicly revealed himself as Iron Man at the end of the first Iron Man (2008) film."
        ),
        TriviaQuestion(
            id = 2, difficulty = Difficulty.EASY, type = QuestionType.MULTIPLE_CHOICE,
            question = "Which metal is Captain America's shield made from?",
            options = listOf("Vibranium", "Adamantium", "Titanium", "Steel"),
            explanation = "Cap's shield was forged by Howard Stark from vibranium — a rare metal found in Wakanda."
        ),
        TriviaQuestion(
            id = 3, difficulty = Difficulty.EASY, type = QuestionType.TRUE_FALSE,
            question = "Thor is a founding member of the Avengers in the MCU.",
            options = listOf("True", "False"),
            explanation = "True. Thor was one of the original six Avengers assembled by Nick Fury in The Avengers (2012)."
        ),
        TriviaQuestion(
            id = 4, difficulty = Difficulty.EASY, type = QuestionType.MULTIPLE_CHOICE,
            question = "Who plays Bruce Banner / Hulk in the MCU?",
            options = listOf("Mark Ruffalo", "Edward Norton", "Eric Bana", "Benedict Cumberbatch"),
            explanation = "Mark Ruffalo took over the role from Edward Norton starting with The Avengers (2012)."
        ),
        TriviaQuestion(
            id = 5, difficulty = Difficulty.EASY, type = QuestionType.MULTIPLE_CHOICE,
            question = "What is Black Widow's real name?",
            options = listOf("Natasha Romanoff", "Yelena Belova", "Melina Vostokoff", "Maria Hill"),
            explanation = "Natasha Romanoff is the Black Widow played by Scarlett Johansson."
        ),
        TriviaQuestion(
            id = 6, difficulty = Difficulty.EASY, type = QuestionType.TRUE_FALSE,
            question = "Hawkeye has no superhuman powers — he is a normal human with exceptional skill.",
            options = listOf("True", "False"),
            explanation = "True. Clint Barton is the only founding Avenger with no powers, gadgets, or serum — just extraordinary skill."
        ),
        TriviaQuestion(
            id = 7, difficulty = Difficulty.EASY, type = QuestionType.MULTIPLE_CHOICE,
            question = "What is the name of Tony Stark's AI assistant in the early MCU films?",
            options = listOf("J.A.R.V.I.S.", "F.R.I.D.A.Y.", "E.D.I.T.H.", "Ultron"),
            explanation = "J.A.R.V.I.S. (Just A Rather Very Intelligent System) was Stark's AI until its mind became Vision."
        ),
        TriviaQuestion(
            id = 8, difficulty = Difficulty.EASY, type = QuestionType.MULTIPLE_CHOICE,
            question = "What country is Wakanda located in the MCU?",
            options = listOf("Africa (fictional country)", "South America", "Asia", "Europe"),
            explanation = "Wakanda is a fictional African nation — the most technologically advanced country on Earth, home of vibranium."
        ),
        TriviaQuestion(
            id = 9, difficulty = Difficulty.EASY, type = QuestionType.TRUE_FALSE,
            question = "Doctor Strange's full name is Stephen Vincent Strange.",
            options = listOf("True", "False"),
            explanation = "True. Dr. Stephen Vincent Strange is a neurosurgeon-turned-Sorcerer Supreme."
        ),
        TriviaQuestion(
            id = 10, difficulty = Difficulty.EASY, type = QuestionType.MULTIPLE_CHOICE,
            question = "Who is Peter Parker's mentor in the MCU?",
            options = listOf("Tony Stark / Iron Man", "Steve Rogers / Captain America", "Nick Fury", "Doctor Strange"),
            explanation = "Tony Stark recruited Peter Parker and mentored him, giving him advanced Spider-Man suits."
        ),
        TriviaQuestion(
            id = 11, difficulty = Difficulty.EASY, type = QuestionType.MULTIPLE_CHOICE,
            question = "What weapon does Thor primarily wield in his early MCU appearances?",
            options = listOf("Mjolnir", "Stormbreaker", "A sword", "A spear"),
            explanation = "Mjolnir is Thor's enchanted hammer, only liftable by those deemed worthy."
        ),
        TriviaQuestion(
            id = 12, difficulty = Difficulty.EASY, type = QuestionType.TRUE_FALSE,
            question = "Sam Wilson was the first person to hold the Captain America title after Steve Rogers.",
            options = listOf("False", "True"),
            explanation = "False. John Walker was publicly named as the new Captain America by the U.S. government before Sam Wilson took on the mantle."
        ),
        TriviaQuestion(
            id = 13, difficulty = Difficulty.EASY, type = QuestionType.MULTIPLE_CHOICE,
            question = "What does Scott Lang use to shrink down in Ant-Man?",
            options = listOf("Pym Particles", "Quantum energy", "Arc reactor technology", "The Tesseract"),
            explanation = "Pym Particles were discovered by Dr. Hank Pym and are the basis of all size-changing technology in the MCU."
        ),
        TriviaQuestion(
            id = 14, difficulty = Difficulty.EASY, type = QuestionType.MULTIPLE_CHOICE,
            question = "What film first introduced Steve Rogers / Captain America?",
            options = listOf("Captain America: The First Avenger (2011)", "The Avengers (2012)", "Iron Man 2 (2010)", "Captain America: Civil War (2016)"),
            explanation = "Captain America: The First Avenger (2011) introduced Steve Rogers and his World War II origin."
        ),
        TriviaQuestion(
            id = 15, difficulty = Difficulty.EASY, type = QuestionType.TRUE_FALSE,
            question = "Tony Stark died at the end of Avengers: Endgame.",
            options = listOf("True", "False"),
            explanation = "True. Tony Stark used the Infinity Stones to eliminate Thanos and his army, sacrificing his own life."
        ),

        // ══════════════════ MEDIUM ══════════════════

        TriviaQuestion(
            id = 16, difficulty = Difficulty.MEDIUM, type = QuestionType.MULTIPLE_CHOICE,
            question = "On which planet did Tony Stark sacrifice himself at the end of Avengers: Endgame?",
            options = listOf("Earth — the Battle of Earth", "Titan", "Vormir", "Xandar"),
            explanation = "The Battle of Earth took place at the ruins of the Avengers Compound in upstate New York."
        ),
        TriviaQuestion(
            id = 17, difficulty = Difficulty.MEDIUM, type = QuestionType.MULTIPLE_CHOICE,
            question = "What was Steve Rogers's famous catchphrase, first said while standing up to a bully before getting his powers?",
            options = listOf("I can do this all day.", "Whatever it takes.", "Avengers, assemble.", "I don't like bullies."),
            explanation = "\"I can do this all day\" was first said in Captain America: The First Avenger and repeated in Civil War and Endgame."
        ),
        TriviaQuestion(
            id = 18, difficulty = Difficulty.MEDIUM, type = QuestionType.TRUE_FALSE,
            question = "Natasha Romanoff sacrificed her life on Vormir to obtain the Soul Stone.",
            options = listOf("True", "False"),
            explanation = "True. In Avengers: Endgame, Natasha gave her life on Vormir so that Clint Barton could retrieve the Soul Stone."
        ),
        TriviaQuestion(
            id = 19, difficulty = Difficulty.MEDIUM, type = QuestionType.MULTIPLE_CHOICE,
            question = "What was the name of the HYDRA program that turned Bucky Barnes into the Winter Soldier?",
            options = listOf("HYDRA's Winter Soldier program", "Project Sentry", "Project Rebirth", "Operation: Paperclip"),
            explanation = "Bucky was captured by HYDRA, brainwashed, and turned into their elite assassin, the Winter Soldier."
        ),
        TriviaQuestion(
            id = 20, difficulty = Difficulty.MEDIUM, type = QuestionType.MULTIPLE_CHOICE,
            question = "How many possible futures did Doctor Strange see in Avengers: Infinity War?",
            options = listOf("14,000,605", "1,000,000", "600,000", "3,000"),
            explanation = "Strange used the Time Stone to view 14,000,605 futures, finding only one in which the Avengers won."
        ),
        TriviaQuestion(
            id = 21, difficulty = Difficulty.MEDIUM, type = QuestionType.TRUE_FALSE,
            question = "Vision was created using the Mind Stone as his power source.",
            options = listOf("True", "False"),
            explanation = "True. The Mind Stone (originally in Loki's scepter) was embedded in Vision's forehead, powering him."
        ),
        TriviaQuestion(
            id = 22, difficulty = Difficulty.MEDIUM, type = QuestionType.MULTIPLE_CHOICE,
            question = "What was the name of the Thunderbolts' dark alter ego / enemy in Thunderbolts* (2025)?",
            options = listOf("The Void", "The Sentry", "Project Zero", "The Overshadow"),
            explanation = "The Void is Bob Reynolds's destructive dark side that emerged when he couldn't control his Sentry powers."
        ),
        TriviaQuestion(
            id = 23, difficulty = Difficulty.MEDIUM, type = QuestionType.MULTIPLE_CHOICE,
            question = "What was the former name of the New Avengers before Valentina revealed them publicly?",
            options = listOf("The Thunderbolts", "The Dark Avengers", "Task Force X", "The Rogues"),
            explanation = "Walker named the group the Thunderbolts, inspired by Yelena's childhood soccer team, before they were outed."
        ),
        TriviaQuestion(
            id = 24, difficulty = Difficulty.MEDIUM, type = QuestionType.TRUE_FALSE,
            question = "Steve Rogers was able to lift Thor's hammer Mjolnir in Avengers: Endgame.",
            options = listOf("True", "False"),
            explanation = "True. Steve Rogers — deemed worthy — fully lifted and wielded Mjolnir during the Battle of Earth."
        ),
        TriviaQuestion(
            id = 25, difficulty = Difficulty.MEDIUM, type = QuestionType.MULTIPLE_CHOICE,
            question = "Which character trained Yelena Belova in the Red Room?",
            options = listOf("General Dreykov", "Melina Vostokoff", "Natasha Romanoff", "The Ancient One"),
            explanation = "General Dreykov ran the Red Room program. Both Natasha and Yelena were trained there."
        ),
        TriviaQuestion(
            id = 26, difficulty = Difficulty.MEDIUM, type = QuestionType.MULTIPLE_CHOICE,
            question = "What caused Ava Starr (Ghost) to become molecularly unstable?",
            options = listOf("A Quantum Realm experiment accident that killed her parents", "Exposure to Pym Particles", "A HYDRA experiment", "An encounter with the Mind Stone"),
            explanation = "An accident with her father Elihas Starr's Quantum Realm experiment killed both parents and left Ava permanently phasing."
        ),
        TriviaQuestion(
            id = 27, difficulty = Difficulty.MEDIUM, type = QuestionType.TRUE_FALSE,
            question = "Quicksilver survived the Battle of Sokovia in Avengers: Age of Ultron.",
            options = listOf("False", "True"),
            explanation = "False. Pietro Maximoff died shielding Clint Barton and a child from Ultron's gunfire, saying \"You didn't see that coming?\""
        ),
        TriviaQuestion(
            id = 28, difficulty = Difficulty.MEDIUM, type = QuestionType.MULTIPLE_CHOICE,
            question = "What is the name of Hawkeye's secret family location?",
            options = listOf("A farm in Iowa", "A house in Queens", "The Avengers Compound", "A cabin in Norway"),
            explanation = "Clint's wife Laura and three children live on a farm in Iowa, kept secret from most of the world."
        ),
        TriviaQuestion(
            id = 29, difficulty = Difficulty.MEDIUM, type = QuestionType.MULTIPLE_CHOICE,
            question = "What new weapon did Thor get forged in Avengers: Infinity War?",
            options = listOf("Stormbreaker", "Gungnir", "Jarnbjorn", "The Odinsword"),
            explanation = "Stormbreaker is a Dwarf-forged axe made at Nidavellir that can summon the Bifrost and was powerful enough to injure Thanos."
        ),
        TriviaQuestion(
            id = 30, difficulty = Difficulty.MEDIUM, type = QuestionType.TRUE_FALSE,
            question = "Captain Marvel was one of the original six founding Avengers.",
            options = listOf("False", "True"),
            explanation = "False. Carol Danvers first appeared in her solo 2019 film set in 1995. She joined the Avengers during Endgame."
        ),

        // ══════════════════ HARD ══════════════════

        TriviaQuestion(
            id = 31, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "What date is Steve Rogers's birthday, as established in the MCU?",
            options = listOf("July 4, 1918", "July 4, 1920", "March 10, 1918", "June 6, 1918"),
            explanation = "Steve Rogers was born on July 4, 1918 — Independence Day — in Brooklyn, New York."
        ),
        TriviaQuestion(
            id = 32, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "What is Tony Stark's exact date of birth according to MCU canon?",
            options = listOf("May 29, 1970", "May 29, 1968", "October 1, 1970", "April 4, 1970"),
            explanation = "Anthony Edward Stark was born on May 29, 1970, in Manhattan, New York City."
        ),
        TriviaQuestion(
            id = 33, difficulty = Difficulty.HARD, type = QuestionType.TRUE_FALSE,
            question = "Nebula's past self is killed by her present self in Avengers: Endgame.",
            options = listOf("True", "False"),
            explanation = "True. 2023 Nebula kills 2014 Nebula after the alternate past Nebula is turned by Thanos and exposes the Time Heist."
        ),
        TriviaQuestion(
            id = 34, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "Which Star-Lord (2014 alternate timeline) action nearly cost the Avengers the Time Heist?",
            options = listOf("Nebula's neural network synced with her past self", "Star-Lord punched Thanos on Titan", "Thor went for the head too early", "Loki escaped with the Tesseract"),
            explanation = "Nebula's cybernetic network synced with 2014-Nebula, revealing the future to Thanos and triggering his invasion of 2023."
        ),
        TriviaQuestion(
            id = 35, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "What was the name of the Soviet Super-Soldier program that created Red Guardian?",
            options = listOf("The Black Widow / Red Room program produced him separately; he was the USSR's only super soldier", "Project Leviathan", "Project Zephyr", "Operation Vanguard"),
            explanation = "Alexei Shostakov was the Soviet Union's first and only super soldier — a direct counterpart to Captain America."
        ),
        TriviaQuestion(
            id = 36, difficulty = Difficulty.HARD, type = QuestionType.TRUE_FALSE,
            question = "Vision was considered worthy of lifting Mjolnir in Avengers: Age of Ultron.",
            options = listOf("True", "False"),
            explanation = "True. Vision casually hands Thor his hammer in Age of Ultron, confirming he is worthy. This stuns the other Avengers."
        ),
        TriviaQuestion(
            id = 37, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "What injury did War Machine sustain during the airport battle in Captain America: Civil War?",
            options = listOf("He was accidentally shot by Vision's beam and crashed from high altitude, causing partial paralysis", "He was struck by Captain America's shield", "He was hit by Scarlet Witch's energy", "He was tackled by Bucky Barnes"),
            explanation = "Vision accidentally hit Rhodey with his beam while aiming at Falcon, causing Rhodey to crash from high altitude."
        ),
        TriviaQuestion(
            id = 38, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "Before becoming the Sorcerer Supreme, what was Doctor Strange's medical specialty?",
            options = listOf("Neurosurgery", "Cardiothoracic surgery", "Orthopedic surgery", "Oncology"),
            explanation = "Dr. Stephen Strange was a brilliant (and arrogant) neurosurgeon before the car accident that destroyed his hands."
        ),
        TriviaQuestion(
            id = 39, difficulty = Difficulty.HARD, type = QuestionType.TRUE_FALSE,
            question = "John Walker (U.S. Agent) received the Super-Soldier Serum voluntarily during The Falcon and the Winter Soldier.",
            options = listOf("True", "False"),
            explanation = "True. Walker obtained the Serum from Battlestar's contact and took it himself after Lemar's death drove him into a rage."
        ),
        TriviaQuestion(
            id = 40, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "What is the name of Okoye's role in Wakanda?",
            options = listOf("General of the Dora Milaje and head of Wakandan armed forces", "Personal bodyguard to T'Challa only", "Queen's Counsel", "War Chief"),
            explanation = "Okoye is the General of the Dora Milaje — Wakanda's elite all-female special forces — and overall head of the military."
        ),
        TriviaQuestion(
            id = 41, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "In what year (in-universe) did Tony Stark and Steve Rogers travel back to during the 1970s leg of the Time Heist?",
            options = listOf("1970 — to retrieve the Space Stone and Pym Particles from Camp Lehigh", "1943", "1969", "1977"),
            explanation = "They went to 1970 to get the Tesseract (Space Stone) from a S.H.I.E.L.D. facility and steal extra Pym Particles from Hank Pym."
        ),
        TriviaQuestion(
            id = 42, difficulty = Difficulty.HARD, type = QuestionType.TRUE_FALSE,
            question = "Rocket Raccoon's real designation (number) assigned by the High Evolutionary was 89P13.",
            options = listOf("True", "False"),
            explanation = "True. Rocket was designation 89P13 — a raccoon-based creature subjected to painful genetic and cybernetic experiments."
        ),
        TriviaQuestion(
            id = 43, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "Which MCU character was elected to the United States House of Representatives?",
            options = listOf("Bucky Barnes / Winter Soldier", "Sam Wilson / Captain America", "John Walker / U.S. Agent", "Steve Rogers / Captain America"),
            explanation = "Bucky Barnes was elected as a U.S. Congressman, which is revealed in Thunderbolts* (2025)."
        ),
        TriviaQuestion(
            id = 44, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "What is the name of the program that experimented on Bob Reynolds to create Sentry?",
            options = listOf("Project Sentry", "Project Rebirth", "Project Insight", "Operation: Leviathan"),
            explanation = "Project Sentry was a secret S.H.I.E.L.D./Valentina program attempting to enhance the Super-Soldier Serum."
        ),
        TriviaQuestion(
            id = 45, difficulty = Difficulty.HARD, type = QuestionType.TRUE_FALSE,
            question = "Wanda Maximoff and Pietro Maximoff are twins who were both exposed to the Mind Stone.",
            options = listOf("True", "False"),
            explanation = "True. Both volunteered for HYDRA experiments using Loki's scepter (Mind Stone) after their parents were killed by a Stark Industries shell."
        ),
        TriviaQuestion(
            id = 46, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "What is the name of the new Avengers headquarters established in Thunderbolts* (2025)?",
            options = listOf("The Watchtower (former Avengers Tower, renamed)", "The Compound", "Avengers Tower", "The Citadel"),
            explanation = "Valentina rebranded the former Avengers Tower in Manhattan as the Watchtower — headquarters of the New Avengers."
        ),
        TriviaQuestion(
            id = 47, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "What film showed Steve Rogers choosing to stay in the past and live a full life with Peggy Carter?",
            options = listOf("Avengers: Endgame (2019)", "Captain America: Civil War (2016)", "Avengers: Infinity War (2018)", "Captain America: The Winter Soldier (2014)"),
            explanation = "At the end of Endgame, Rogers traveled back in time to return the Stones and stayed in the 1940s, appearing as an old man to pass his shield to Sam."
        ),
        TriviaQuestion(
            id = 48, difficulty = Difficulty.HARD, type = QuestionType.TRUE_FALSE,
            question = "Hope van Dyne's Wasp suit was more advanced than Scott Lang's Ant-Man suit, including wings that his lacked.",
            options = listOf("True", "False"),
            explanation = "True. Hope's suit had flight wings built in. Scott's suit did not have wings initially — he had to rely on ants."
        ),
        TriviaQuestion(
            id = 49, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "What was the name of the Sokovia Accords — and which film introduced them?",
            options = listOf("A UN framework to regulate superheroes — Captain America: Civil War (2016)", "A SHIELD protocol — The Avengers (2012)", "A Stark-designed treaty — Avengers: Age of Ultron (2015)", "An international weapons ban — Iron Man 2 (2010)"),
            explanation = "The Sokovia Accords were a UN-ratified treaty requiring superheroes to operate under governmental oversight, introduced in Civil War."
        ),
        TriviaQuestion(
            id = 50, difficulty = Difficulty.HARD, type = QuestionType.MULTIPLE_CHOICE,
            question = "What was Tony Stark's last words to Morgan in his recorded hologram message shown at his funeral?",
            options = listOf("\"I love you three thousand.\"", "\"I am Iron Man.\"", "\"Part of the journey is the end.\"", "\"Whatever it takes.\""),
            explanation = "Tony's message to Morgan ends with \"I love you three thousand\" — a callback to the bedtime exchange between them."
        )
    )

    fun getByDifficulty(difficulty: Difficulty): List<TriviaQuestion> =
        questions.filter { it.difficulty == difficulty }

    fun getRandomSet(difficulty: Difficulty, count: Int = 10): List<TriviaQuestion> =
        getByDifficulty(difficulty).shuffled().take(count)
}
