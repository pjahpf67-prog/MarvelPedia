package com.marvelpedia.data

object CharacterRepository {

    val characters: List<Character> = listOf(

        // ── ORIGINAL SIX ────────────────────────────────────────────────────────

        Character(
            id = 1,
            heroName = "Iron Man",
            realName = "Anthony Edward \"Tony\" Stark",
            actor = "Robert Downey Jr.",
            team = "Original Avengers",
            status = "Deceased",
            bio = "Born May 29, 1970, Tony Stark was a genius inventor, billionaire, and former CEO of Stark Industries — the son of Howard and Maria Stark. After being kidnapped by the Ten Rings in Afghanistan and forced to build a weapon, he instead built a powered armor suit and escaped. He publicly revealed his identity as Iron Man, making him the first self-declared superhero of the modern era. A founding member of the Avengers, Stark battled his own arc-reactor poisoning, PTSD after the Battle of New York, and his role in accidentally creating Ultron. He retired with Pepper Potts and had a daughter, Morgan. Recalled to active duty for the Time Heist, he ultimately sacrificed his life at the Battle of Earth in 2023, using the Infinity Stones to eliminate Thanos and his army. His final words were \"I am Iron Man.\"",
            powers = listOf(
                "Genius-level intellect and engineering",
                "Powered Iron Man armor (repulsor blasts, flight, unibeam, missiles)",
                "Advanced AI tactical interface (J.A.R.V.I.S. / F.R.I.D.A.Y.)",
                "Nanotech armor (Mark L onward) — stores in arc reactor chest piece",
                "Master tactician and businessman"
            ),
            allies = listOf("Pepper Potts", "James Rhodes / War Machine", "Happy Hogan", "Steve Rogers", "Peter Parker / Spider-Man", "Nick Fury", "Bruce Banner"),
            enemies = listOf("Thanos", "Obadiah Stane / Iron Monger", "Aldrich Killian / Mandarin", "Justin Hammer", "Ivan Vanko / Whiplash", "Ultron", "Loki"),
            movieAppearances = listOf(
                "Iron Man (2008)",
                "The Incredible Hulk (2008) — cameo",
                "Iron Man 2 (2010)",
                "The Avengers (2012)",
                "Iron Man 3 (2013)",
                "Avengers: Age of Ultron (2015)",
                "Captain America: Civil War (2016)",
                "Spider-Man: Homecoming (2017)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)"
            ),
            quote = "Part of the journey is the end.",
            quoteSource = "Avengers: Endgame (2019)",
            firstAppearance = "Iron Man (2008)"
        ),

        Character(
            id = 2,
            heroName = "Captain America",
            realName = "Steven Grant Rogers",
            actor = "Chris Evans",
            team = "Original Avengers",
            status = "Retired",
            bio = "Born July 4, 1918 in Brooklyn, New York, Steve Rogers was a frail young man with an unwavering moral compass who desperately wanted to serve his country in World War II. Selected by Dr. Abraham Erskine for the Super-Soldier program, he was transformed into a peak-human specimen. After defeating Red Skull and crashing a Hydra plane into the Arctic to save millions, he was frozen for nearly 70 years before being revived by S.H.I.E.L.D. A founding member of the Avengers, he led the team through the Battle of New York, exposed Hydra's infiltration of S.H.I.E.L.D., opposed the Sokovia Accords, and helped undo Thanos's Blip. After the Time Heist, he traveled back in time to return the Infinity Stones and chose to live out a full life in the 1940s with Peggy Carter. He passed his shield to Sam Wilson.",
            powers = listOf(
                "Super-Soldier Serum — peak human strength, speed, agility, and endurance",
                "Accelerated healing factor",
                "Virtually indestructible vibranium shield (offensive and defensive)",
                "Master martial artist and tactician",
                "Worthy of lifting Mjolnir (demonstrated in Endgame)"
            ),
            allies = listOf("Bucky Barnes / Winter Soldier", "Sam Wilson / Falcon", "Natasha Romanoff / Black Widow", "Tony Stark / Iron Man", "Peggy Carter", "Nick Fury", "Thor"),
            enemies = listOf("Red Skull / Johann Schmidt", "Hydra", "Thanos", "Helmut Zemo", "Ultron", "Crossbones / Brock Rumlow", "Arnim Zola"),
            movieAppearances = listOf(
                "Captain America: The First Avenger (2011)",
                "The Avengers (2012)",
                "Captain America: The Winter Soldier (2014)",
                "Avengers: Age of Ultron (2015)",
                "Ant-Man (2015) — cameo",
                "Captain America: Civil War (2016)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)"
            ),
            quote = "I can do this all day.",
            quoteSource = "Captain America: The First Avenger (2011)",
            firstAppearance = "Captain America: The First Avenger (2011)"
        ),

        Character(
            id = 3,
            heroName = "Thor",
            realName = "Thor Odinson",
            actor = "Chris Hemsworth",
            team = "Original Avengers",
            status = "Active",
            bio = "Thor Odinson is the Asgardian God of Thunder, son of Odin and Gaea, and the heir to the throne of Asgard. Exiled to Earth by Odin for his arrogance, he was stripped of his powers and Mjolnir until he proved himself worthy. After defeating the Destroyer sent by his adoptive brother Loki, he regained his power and became an ally of S.H.I.E.L.D. He later became a founding member of the Avengers. Thor has faced the loss of his mother Frigga, the destruction of Asgard, the death of his father Odin, and witnessed Thanos kill half his people before escaping. After Thanos's defeat, he joined the Guardians of the Galaxy. He has ruled Asgard (now New Asgard in Tønsberg, Norway) and passed the mantle to Valkyrie.",
            powers = listOf(
                "Superhuman strength, speed, and durability (Asgardian physiology)",
                "God of Thunder — controls lightning and storms",
                "Mjolnir — enchanted hammer (only wieldable by the worthy); can be recalled and used for flight",
                "Stormbreaker — Dwarf-forged axe, can summon the Bifrost",
                "Near-immortality and accelerated healing"
            ),
            allies = listOf("Steve Rogers / Captain America", "Tony Stark / Iron Man", "Valkyrie", "Hulk", "Loki (complicated)", "Guardians of the Galaxy", "Heimdall"),
            enemies = listOf("Loki", "Thanos", "Hela", "Malekith", "Surtur", "Ultron", "Gorr the God Butcher"),
            movieAppearances = listOf(
                "Thor (2011)",
                "The Avengers (2012)",
                "Thor: The Dark World (2013)",
                "Avengers: Age of Ultron (2015)",
                "Doctor Strange (2016) — post-credits cameo",
                "Thor: Ragnarok (2017)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)",
                "Thor: Love and Thunder (2022)"
            ),
            quote = "I choose to run towards my problems, and not away from them. Because that's what heroes do.",
            quoteSource = "Thor: Ragnarok (2017)",
            firstAppearance = "Thor (2011)"
        ),

        Character(
            id = 4,
            heroName = "Hulk",
            realName = "Dr. Robert Bruce Banner",
            actor = "Mark Ruffalo",
            team = "Original Avengers",
            status = "Active",
            bio = "Dr. Bruce Banner is a brilliant physicist who was exposed to an experimental gamma-radiation recreation of the Super-Soldier serum. The radiation caused him to transform into the massive green Hulk whenever his heart rate elevates from anger or stress. For years he lived as a fugitive, hiding from the military led by General Thaddeus Ross. He joined the Avengers as one of their most powerful members. After the Battle of Sokovia he disappeared to Sakaar (the planet of the Grandmaster). In 2018, following traumatic encounters with Thanos that left the Hulk unwilling to emerge, Banner merged his intellect with the Hulk's body — becoming \"Professor Hulk\" or \"Smart Hulk.\" He used the Nano Gauntlet to reverse the Blip in 2023, though it permanently damaged his right arm.",
            powers = listOf(
                "Genius-level intellect in Banner form (physics, biology, engineering)",
                "Hulk form: virtually unlimited strength (increases with anger)",
                "Extreme durability — nearly indestructible",
                "Rapid regeneration / healing factor",
                "Thunderclap (shockwave from clapping hands)"
            ),
            allies = listOf("Tony Stark / Iron Man", "Steve Rogers / Captain America", "Natasha Romanoff / Black Widow", "Thor", "Doctor Strange", "Valkyrie"),
            enemies = listOf("Thanos", "Abomination / Emil Blonsky", "General Thaddeus Ross", "Ultron", "Leader / Samuel Sterns"),
            movieAppearances = listOf(
                "The Incredible Hulk (2008)",
                "The Avengers (2012)",
                "Iron Man 3 (2013) — post-credits scene",
                "Avengers: Age of Ultron (2015)",
                "Thor: Ragnarok (2017)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)",
                "Shang-Chi and the Legend of the Ten Rings (2021) — cameo"
            ),
            quote = "That's my secret, Cap. I'm always angry.",
            quoteSource = "The Avengers (2012)",
            firstAppearance = "The Incredible Hulk (2008)"
        ),

        Character(
            id = 5,
            heroName = "Black Widow",
            realName = "Natasha Romanoff",
            actor = "Scarlett Johansson",
            team = "Original Avengers",
            status = "Deceased",
            bio = "Natasha Romanoff was born in Stalingrad (now Volgograd), Russia, around 1984. Recruited as a child into the Soviet Red Room program, she was subjected to intense espionage and combat training and sterilized against her will. She became one of the world's greatest spies and assassins before defecting to S.H.I.E.L.D., where Clint Barton was sent to eliminate her but instead recruited her. A founding Avenger, she played crucial roles in the Battle of New York, exposing Hydra within S.H.I.E.L.D., the Sokovia Accords conflict, and leading the remaining Avengers after the Blip. In 2023 on Vormir, she sacrificed her life so that Clint Barton could live, offering her life for the Soul Stone.",
            powers = listOf(
                "Expert martial artist (multiple fighting styles)",
                "Master spy, infiltrator, and interrogator",
                "Widow's Bite — electroshock wrist gauntlets",
                "Peak human athleticism and acrobatics",
                "Master marksman and weapons expert"
            ),
            allies = listOf("Clint Barton / Hawkeye", "Steve Rogers / Captain America", "Tony Stark / Iron Man", "Yelena Belova (younger sister figure)", "Nick Fury", "Sam Wilson / Falcon"),
            enemies = listOf("Thanos", "Hydra", "Red Guardian / Dreykov (Black Widow)", "Taskmaster (Antonia Dreykov)", "Ultron", "Loki"),
            movieAppearances = listOf(
                "Iron Man 2 (2010)",
                "The Avengers (2012)",
                "Captain America: The Winter Soldier (2014)",
                "Avengers: Age of Ultron (2015)",
                "Captain America: Civil War (2016)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)",
                "Black Widow (2021) — set before Endgame"
            ),
            quote = "Whatever it takes.",
            quoteSource = "Avengers: Endgame (2019)",
            firstAppearance = "Iron Man 2 (2010)"
        ),

        Character(
            id = 6,
            heroName = "Hawkeye",
            realName = "Clinton Francis Barton",
            actor = "Jeremy Renner",
            team = "Original Avengers",
            status = "Active",
            bio = "Clint Barton is a S.H.I.E.L.D. master archer and agent — the only founding Avenger with no superhuman powers or advanced technology beyond his skills. He was briefly mind-controlled by Loki during the Battle of New York. He has a secret family — wife Laura and three children — who live on a farm in Iowa. After Thanos's Snap killed his entire family, Clint spent five years as a ruthless vigilante called Ronin before rejoining the Avengers for the Time Heist. On Vormir, Natasha Romanoff sacrificed herself so that he could live and retrieve the Soul Stone. He later trained Kate Bishop as his successor.",
            powers = listOf(
                "Master archer — virtually perfect accuracy with a bow",
                "Expert acrobat and martial artist",
                "Specialist in trick arrows (explosive, grappling, EMP, etc.)",
                "Expert marksman with firearms",
                "Master hand-to-hand combatant"
            ),
            allies = listOf("Natasha Romanoff / Black Widow", "Steve Rogers / Captain America", "Tony Stark / Iron Man", "Laura Barton", "Kate Bishop", "Nick Fury"),
            enemies = listOf("Thanos", "Loki", "Ultron", "Helmut Zemo", "Tracksuit Mafia"),
            movieAppearances = listOf(
                "Thor (2011) — cameo",
                "The Avengers (2012)",
                "Avengers: Age of Ultron (2015)",
                "Captain America: Civil War (2016)",
                "Avengers: Endgame (2019)"
            ),
            quote = "I retire for, what, five minutes, and it all goes to hell.",
            quoteSource = "Avengers: Age of Ultron (2015)",
            firstAppearance = "Thor (2011)"
        ),

        // ── EXPANDED AVENGERS ────────────────────────────────────────────────────

        Character(
            id = 7,
            heroName = "War Machine",
            realName = "Colonel James Rupert \"Rhodey\" Rhodes",
            actor = "Don Cheadle",
            team = "Expanded Avengers",
            status = "Active",
            bio = "James Rhodes is a decorated U.S. Air Force Colonel and Tony Stark's best friend since their MIT days. He initially opposed Stark's reckless behavior as Iron Man but eventually donned the Iron Man Mark II armor himself, later upgraded by the government into War Machine. He served as the liaison between the U.S. military and the Avengers. Severely injured by Vision (accidentally) during the Civil War airport battle, he was partially paralyzed and required an exoskeleton to walk, later recovered with Stark technology. He fought in Avengers: Endgame. In 2023 he was captured by Kang the Conqueror variants in the Quantum Realm before being rescued.",
            powers = listOf(
                "War Machine armor — repulsors, flight, heavy military weaponry",
                "Gatling gun and missile systems mounted on armor",
                "U.S. Air Force pilot (military training)",
                "Expert combatant and tactician"
            ),
            allies = listOf("Tony Stark / Iron Man", "Steve Rogers / Captain America", "Nick Fury", "Sam Wilson / Falcon", "Pepper Potts"),
            enemies = listOf("Thanos", "Ultron", "Ivan Vanko / Whiplash", "Hydra", "Justin Hammer"),
            movieAppearances = listOf(
                "Iron Man (2008)",
                "Iron Man 2 (2010)",
                "Iron Man 3 (2013)",
                "Avengers: Age of Ultron (2015)",
                "Captain America: Civil War (2016)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)",
                "Ant-Man and the Wasp: Quantumania (2023)"
            ),
            quote = "I'm not the sidekick.",
            quoteSource = "Iron Man 2 (2010)",
            firstAppearance = "Iron Man (2008)"
        ),

        Character(
            id = 8,
            heroName = "Falcon / Captain America",
            realName = "Samuel Thomas Wilson",
            actor = "Anthony Mackie",
            team = "Expanded Avengers",
            status = "Active",
            bio = "Sam Wilson is a former U.S. Air Force pararescueman and veteran who met Steve Rogers while both were jogging around the National Mall. He uses a specialized EXO-7 Falcon military wingsuit with retractable wings and a bird drone named Redwing. He helped Rogers expose Hydra within S.H.I.E.L.D., joined the Avengers, and fought in the Sokovia Accords conflict on Rogers's side. Snapped by Thanos but returned. After Endgame, Steve Rogers chose Sam to be his successor — passing him the vibranium shield. Sam became the new Captain America, confronting the Flag Smashers and a Red Hulk-powered Thaddeus Ross. He is now the world's Captain America and reportedly forming a new Avengers roster.",
            powers = listOf(
                "EXO-7 Falcon wingsuit — high-speed flight and aerial combat",
                "Redwing — combat drone for recon and attacks",
                "Expert hand-to-hand combatant (military training)",
                "Vibranium Captain America shield (inherited from Steve Rogers)",
                "Skilled paratrooper and tactician"
            ),
            allies = listOf("Steve Rogers / Captain America", "Bucky Barnes / Winter Soldier", "Natasha Romanoff / Black Widow", "Joaquin Torres / Falcon II", "Sharon Carter"),
            enemies = listOf("Thanos", "Hydra", "Flag Smashers", "Helmut Zemo", "Crossbones", "Thaddeus Ross / Red Hulk"),
            movieAppearances = listOf(
                "Captain America: The Winter Soldier (2014)",
                "Avengers: Age of Ultron (2015)",
                "Ant-Man (2015)",
                "Captain America: Civil War (2016)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)",
                "Captain America: Brave New World (2025)"
            ),
            quote = "I'm thinking... A guy with wings. Named Falcon. How's that?",
            quoteSource = "The Falcon and the Winter Soldier (Disney+, 2021)",
            firstAppearance = "Captain America: The Winter Soldier (2014)"
        ),

        Character(
            id = 9,
            heroName = "Scarlet Witch",
            realName = "Wanda Maximoff",
            actor = "Elizabeth Olsen",
            team = "Expanded Avengers",
            status = "Deceased (presumed)",
            bio = "Wanda Maximoff was born in Sokovia and, along with her twin brother Pietro, volunteered for HYDRA's experiments using Loki's scepter (powered by the Mind Stone). She gained powerful chaos magic abilities. Initially an enemy of the Avengers seeking revenge against Tony Stark, she switched sides during the Battle of Sokovia. She became a full Avenger, developing a relationship with the android Vision. After Vision's death at the hands of Thanos, she was snapped but returned. She tortured a town of innocents in Westview (WandaVision), eventually freeing them. Corrupted by the Darkhold, she became a villain hunting for a universe where her children existed, until she destroyed herself — and Mount Wundagore — to prevent further harm.",
            powers = listOf(
                "Chaos magic — among the most powerful in the MCU",
                "Telekinesis (red energy constructs)",
                "Mental manipulation / hex bolts",
                "Flight (via magic)",
                "Scarlet Witch form: vastly amplified power from studying the Darkhold"
            ),
            allies = listOf("Vision", "Pietro Maximoff / Quicksilver (deceased)", "Steve Rogers / Captain America", "Clint Barton / Hawkeye", "Monica Rambeau"),
            enemies = listOf("Thanos", "Ultron (originally)", "Agatha Harkness", "Doctor Strange (briefly)", "HYDRA"),
            movieAppearances = listOf(
                "Avengers: Age of Ultron (2015)",
                "Captain America: Civil War (2016)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)",
                "Doctor Strange in the Multiverse of Madness (2022)"
            ),
            quote = "You break the rules and become the hero. I do it and I become the enemy. That doesn't seem fair.",
            quoteSource = "Doctor Strange in the Multiverse of Madness (2022)",
            firstAppearance = "Captain America: The Winter Soldier (2014) — post-credits"
        ),

        Character(
            id = 10,
            heroName = "Vision",
            realName = "Vision",
            actor = "Paul Bettany",
            team = "Expanded Avengers",
            status = "Deceased",
            bio = "Vision is a synthetic android whose body was created by Ultron using Vibranium and the biological tissue-generation technology of Helen Cho's Cradle. His mind was uploaded from J.A.R.V.I.S. by Tony Stark and Bruce Banner, and he was brought to life by a lightning bolt from Thor. The Mind Stone was embedded in his forehead. He could phase through solid matter, fly, and project an energy beam from the stone. He was worthy of lifting Mjolnir. He was killed twice by Thanos — first by Wanda destroying the Mind Stone, then reversed by the Time Stone and killed again as Thanos ripped the stone from his head. A copy of his consciousness was used in S.W.O.R.D.'s White Vision project; that Vision regained his memories and departed.",
            powers = listOf(
                "Density control — can phase through solid matter or become nearly indestructible",
                "Flight",
                "Mind Stone energy beam (\"Vision Beam\") from forehead",
                "Superhuman strength and intelligence",
                "Can lift Mjolnir (proven worthy)"
            ),
            allies = listOf("Wanda Maximoff / Scarlet Witch", "Tony Stark / Iron Man", "Steve Rogers / Captain America", "Thor", "Clint Barton / Hawkeye"),
            enemies = listOf("Thanos", "Ultron (creator)", "HYDRA", "Corvus Glaive", "S.W.O.R.D. (partially)"),
            movieAppearances = listOf(
                "Avengers: Age of Ultron (2015)",
                "Captain America: Civil War (2016)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019) — briefly"
            ),
            quote = "I am not Ultron. I am not J.A.R.V.I.S. I am… I am.",
            quoteSource = "Avengers: Age of Ultron (2015)",
            firstAppearance = "Avengers: Age of Ultron (2015)"
        ),

        Character(
            id = 11,
            heroName = "Ant-Man",
            realName = "Scott Edward Harris Lang",
            actor = "Paul Rudd",
            team = "Expanded Avengers",
            status = "Active",
            bio = "Scott Lang is an electrical engineer and former thief who was recruited by Dr. Hank Pym to wear the original Ant-Man suit and pull off a heist to prevent Darren Cross from selling the Yellowjacket technology to HYDRA. He can shrink to the size of an ant while retaining full human strength, communicate with ants, and go sub-atomic into the Quantum Realm. He joined Captain America's side in Civil War, was placed under house arrest, and accidentally became trapped in the Quantum Realm during the Snap. His accidental return — five years later — gave the Avengers the idea for Time Travel via the Quantum Realm. Without Scott, the Time Heist would never have happened.",
            powers = listOf(
                "Pym Particle suit — shrinks to ant-size while retaining full strength",
                "Can also grow to giant / Giant-Man size",
                "Quantum Realm access via suit",
                "Ant communication via helmet",
                "Engineering and hacking expertise"
            ),
            allies = listOf("Hope van Dyne / Wasp", "Hank Pym", "Janet van Dyne", "Steve Rogers / Captain America", "Cassie Lang"),
            enemies = listOf("Thanos", "Darren Cross / Yellowjacket", "Ghost / Ava Starr (formerly)", "Kang the Conqueror", "M.O.D.O.K."),
            movieAppearances = listOf(
                "Ant-Man (2015)",
                "Captain America: Civil War (2016)",
                "Ant-Man and the Wasp (2018)",
                "Avengers: Endgame (2019)",
                "Ant-Man and the Wasp: Quantumania (2023)"
            ),
            quote = "I do some dumb things and the people I love most pay the price.",
            quoteSource = "Ant-Man and the Wasp (2018)",
            firstAppearance = "Ant-Man (2015)"
        ),

        Character(
            id = 12,
            heroName = "Wasp",
            realName = "Hope van Dyne",
            actor = "Evangeline Lilly",
            team = "Expanded Avengers",
            status = "Active",
            bio = "Hope van Dyne is the daughter of original Ant-Man/Wasp founders Dr. Hank Pym and Janet van Dyne. She is a highly skilled fighter who trained Scott Lang for his first mission. She eventually received her own Wasp suit — more advanced than Scott's Ant-Man suit, equipped with wings for flight and bio-electric Wasp's Sting blasters on the wrists. She aided in rescuing her mother Janet from the Quantum Realm. Snapped by Thanos, she returned for the Battle of Earth. She entered the Quantum Realm with her family and Scott to stop Kang the Conqueror.",
            powers = listOf(
                "Pym Particle Wasp suit — shrinks and grows",
                "Retractable wings for flight",
                "Bio-electric Wasp's Sting blasters",
                "Master martial artist (trained by Hank Pym)",
                "Expert scientist and engineer"
            ),
            allies = listOf("Scott Lang / Ant-Man", "Hank Pym", "Janet van Dyne", "Steve Rogers / Captain America"),
            enemies = listOf("Thanos", "Ghost / Ava Starr (formerly)", "Kang the Conqueror", "Darren Cross / Yellowjacket", "Bill Foster / Goliath (briefly)"),
            movieAppearances = listOf(
                "Ant-Man (2015)",
                "Ant-Man and the Wasp (2018)",
                "Avengers: Endgame (2019)",
                "Ant-Man and the Wasp: Quantumania (2023)"
            ),
            quote = "I was trained to be a spy and an assassin. You were a thief who got lucky once.",
            quoteSource = "Ant-Man (2015)",
            firstAppearance = "Ant-Man (2015)"
        ),

        Character(
            id = 13,
            heroName = "Spider-Man",
            realName = "Peter Benjamin Parker",
            actor = "Tom Holland",
            team = "Expanded Avengers",
            status = "Active",
            bio = "Peter Parker is a teenage orphan from Queens, New York, raised by his Aunt May. Bitten by a radioactive spider on a school trip to Oscorp (in this universe, implied to be during a science event), he developed superhuman abilities. He began operating as the Friendly Neighborhood Spider-Man before being recruited by Tony Stark for the Civil War airport battle. Stark mentored him, providing advanced spider-suits. He was snapped by Thanos, returning five years later (though still the same age). After Tony Stark's death, he faced Mysterio and was publicly unmasked, leading to a Doctor Strange spell that erased the world's memory of his identity. He remains active as Spider-Man.",
            powers = listOf(
                "Wall-crawling (microscopic hairs on hands and feet)",
                "Spider-Sense — precognitive danger awareness",
                "Superhuman strength, speed, agility, and reflexes",
                "Web-shooters (mechanical; Tony upgraded to nanotechnology in later suits)",
                "Genius-level intellect in science and engineering"
            ),
            allies = listOf("Tony Stark / Iron Man", "Ned Leeds", "MJ / Michelle Jones-Watson", "Happy Hogan", "Doctor Strange", "Aunt May"),
            enemies = listOf("Thanos", "Vulture / Adrian Toomes", "Mysterio / Quentin Beck", "Electro (Fogarty)", "Doctor Octopus (Earth-96283)"),
            movieAppearances = listOf(
                "Captain America: Civil War (2016)",
                "Spider-Man: Homecoming (2017)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)",
                "Spider-Man: Far From Home (2019)",
                "Spider-Man: No Way Home (2021)"
            ),
            quote = "With great power comes great responsibility.",
            quoteSource = "Spider-Man: Homecoming (2017) — Aunt May paraphrase",
            firstAppearance = "Captain America: Civil War (2016)"
        ),

        Character(
            id = 14,
            heroName = "Doctor Strange",
            realName = "Dr. Stephen Vincent Strange",
            actor = "Benedict Cumberbatch",
            team = "Expanded Avengers",
            status = "Active",
            bio = "Dr. Stephen Strange was a brilliant but arrogant neurosurgeon whose hands were destroyed in a car accident, ending his medical career. Seeking a cure, he traveled to Kamar-Taj in Nepal and studied under the Ancient One, eventually becoming Earth's Sorcerer Supreme. He wields the Eye of Agamotto (formerly containing the Time Stone) and the Cloak of Levitation. He joined the fight against Thanos, studying 14,000,605 possible futures and finding only one where the Avengers won — allowing Thanos to take the Time Stone. He was snapped but returned. He cast a global memory-erasure spell for Peter Parker that went wrong, opening the multiverse.",
            powers = listOf(
                "Master of the Mystic Arts — sorcery and spells",
                "Time manipulation via Time Stone (Eye of Agamotto)",
                "Inter-dimensional portals (Sling Ring)",
                "Astral projection",
                "Mirror Dimension and energy constructs"
            ),
            allies = listOf("Wong", "Tony Stark / Iron Man", "Peter Parker / Spider-Man", "Thor", "Wanda Maximoff / Scarlet Witch (complicated)", "Ancient One"),
            enemies = listOf("Thanos", "Dormammu", "Kaecilius", "Mordo", "Nightmare", "Wanda Maximoff (Doctor Strange 2)"),
            movieAppearances = listOf(
                "Doctor Strange (2016)",
                "Thor: Ragnarok (2017)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)",
                "Spider-Man: No Way Home (2021)",
                "Doctor Strange in the Multiverse of Madness (2022)"
            ),
            quote = "Dormammu, I've come to bargain.",
            quoteSource = "Doctor Strange (2016)",
            firstAppearance = "Doctor Strange (2016)"
        ),

        Character(
            id = 15,
            heroName = "Black Panther",
            realName = "T'Challa",
            actor = "Chadwick Boseman",
            team = "Expanded Avengers",
            status = "Deceased",
            bio = "T'Challa was the King of Wakanda and the Black Panther — a title passed down through generations to the ruler of the most technologically advanced nation on Earth. After his father King T'Chaka was killed in a bombing framed on Bucky Barnes, T'Challa pursued Barnes before learning Helmut Zemo was the true culprit. He opened Wakanda to the world, sharing its vibranium technology and hosting the Battle of Wakanda. He was snapped by Thanos but returned for the Battle of Earth. T'Challa died of illness; his sister Shuri took up the mantle as the new Black Panther.",
            powers = listOf(
                "Heart-Shaped Herb — enhanced strength, speed, senses, and endurance",
                "Vibranium Panther Habit — absorbs kinetic energy and redirects it",
                "Master of Wakandan martial arts (Zulu fighting styles)",
                "Genius-level intellect and king-level leadership",
                "Vibranium claws and retractable blades"
            ),
            allies = listOf("Shuri", "Okoye", "M'Baku", "Nakia", "Steve Rogers / Captain America", "Bucky Barnes"),
            enemies = listOf("Thanos", "Killmonger / N'Jadaka", "Ulysses Klaue", "Helmut Zemo"),
            movieAppearances = listOf(
                "Captain America: Civil War (2016)",
                "Black Panther (2018)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)"
            ),
            quote = "Wakanda forever.",
            quoteSource = "Black Panther (2018)",
            firstAppearance = "Captain America: Civil War (2016)"
        ),

        Character(
            id = 16,
            heroName = "Captain Marvel",
            realName = "Carol Danvers",
            actor = "Brie Larson",
            team = "Expanded Avengers",
            status = "Active",
            bio = "Carol Danvers was a U.S. Air Force pilot who was exposed to an experimental light-speed engine designed by the Kree scientist Mar-Vell, powered by the Tesseract (Space Stone). She absorbed the energy from the explosion, gaining extraordinary powers. The Kree wiped her memory and she lived as a Kree warrior named Vers for years before rediscovering her human identity on Earth in 1995. She is one of the most powerful beings in the MCU. She answered Nick Fury's pager after Thanos's Snap and aided the Avengers in Endgame. She has spent most of her time off-world protecting the universe. She later worked with Monica Rambeau and Kamala Khan / Ms. Marvel.",
            powers = listOf(
                "Binary Form — photon energy absorption and projection",
                "Superhuman strength, speed, and durability",
                "Near-invulnerability",
                "Unaided space flight at near-lightspeed",
                "Energy blasts from hands"
            ),
            allies = listOf("Nick Fury", "Monica Rambeau", "Kamala Khan / Ms. Marvel", "Maria Rambeau", "Talos (Skrull)"),
            enemies = listOf("Thanos", "Yon-Rogg", "Supreme Intelligence", "Dar-Benn", "Ronan the Accuser"),
            movieAppearances = listOf(
                "Captain Marvel (2019) — set in 1995",
                "Avengers: Endgame (2019)",
                "The Marvels (2023)"
            ),
            quote = "I've been fighting with one hand tied behind my back. What happens when I'm finally set free?",
            quoteSource = "Captain Marvel (2019)",
            firstAppearance = "Captain Marvel (2019)"
        ),

        Character(
            id = 17,
            heroName = "Okoye",
            realName = "Okoye",
            actor = "Danai Gurira",
            team = "Expanded Avengers",
            status = "Active",
            bio = "Okoye is the General of the Dora Milaje, Wakanda's elite all-female special forces, and the head of Wakandan armed forces. Fiercely loyal to Wakanda above all else, she clashed with T'Challa during the Erik Killmonger crisis but remained loyal to the throne. She fought in the Battle of Wakanda against Thanos's army. After the Blip, she joined the global Avengers team under Black Widow. After T'Challa's death she served as a key military advisor under Queen Ramonda and Princess Shuri.",
            powers = listOf(
                "Vibranium spear — expert weapon mastery",
                "Elite Wakandan hand-to-hand combat training",
                "Master tactician and military general",
                "Dora Milaje armor (vibranium-enhanced)"
            ),
            allies = listOf("T'Challa / Black Panther", "Shuri", "M'Baku", "Nakia", "Natasha Romanoff / Black Widow"),
            enemies = listOf("Thanos", "Killmonger / N'Jadaka", "Ulysses Klaue", "Attuma", "Namor"),
            movieAppearances = listOf(
                "Black Panther (2018)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)",
                "Black Panther: Wakanda Forever (2022)"
            ),
            quote = "Guns. So primitive.",
            quoteSource = "Black Panther (2018)",
            firstAppearance = "Black Panther (2018)"
        ),

        Character(
            id = 18,
            heroName = "Nebula",
            realName = "Nebula",
            actor = "Karen Gillan",
            team = "Expanded Avengers",
            status = "Active",
            bio = "Nebula is a cybernetically-enhanced Luphomoid assassin and the adopted daughter of Thanos. She and Gamora were raised as rivals — whenever Nebula lost a sparring match against Gamora, Thanos would replace part of her body with a cybernetic upgrade as punishment. Initially an enemy of the Guardians of the Galaxy and the Avengers, she eventually turned against Thanos. She aided Tony Stark to survive stranded in space after Infinity War, returned to Earth, and played a crucial role in the Time Heist. Her past self was killed by the present Nebula when the alternate-timeline Thanos's plans were exposed.",
            powers = listOf(
                "Extensive cybernetic enhancements (replace most of her body)",
                "Enhanced strength and durability",
                "Built-in taser and weaponry",
                "Expert combatant and assassin",
                "Can interface with computer systems directly"
            ),
            allies = listOf("Gamora (deceased/alternate)", "Tony Stark / Iron Man", "Steve Rogers / Captain America", "Rocket Raccoon", "Guardians of the Galaxy"),
            enemies = listOf("Thanos (reformed enemy)", "Ronan the Accuser", "Ego"),
            movieAppearances = listOf(
                "Guardians of the Galaxy (2014)",
                "Guardians of the Galaxy Vol. 2 (2017)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)",
                "Guardians of the Galaxy Vol. 3 (2023)"
            ),
            quote = "You said you wanted me to be your greatest weapon. I've become something else now.",
            quoteSource = "Avengers: Endgame (2019)",
            firstAppearance = "Guardians of the Galaxy (2014)"
        ),

        Character(
            id = 19,
            heroName = "Rocket Raccoon",
            realName = "Rocket (designation: 89P13)",
            actor = "Bradley Cooper (voice)",
            team = "Expanded Avengers",
            status = "Active",
            bio = "Rocket is a genetically and cybernetically modified raccoon-like creature created through painful scientific experiments by the High Evolutionary. He has no memory of where he came from. Brash, sarcastic, and deeply guarded, he formed an unlikely family with the Guardians of the Galaxy. He joined the Avengers' remaining forces after Thanos's Snap (he was one of the survivors). He fought in the Battle of Earth. After Endgame, he continued with the Guardians and eventually reunited with a variant of his original creator's test subjects.",
            powers = listOf(
                "Cybernetic enhancements — enhanced reactions and strength",
                "Genius-level engineering and weapons expertise",
                "Expert marksman with any firearm",
                "Master thief and tactician",
                "Tactical genius in combat"
            ),
            allies = listOf("Groot", "Star-Lord / Peter Quill", "Gamora", "Nebula", "Drax", "Mantis", "Natasha Romanoff / Black Widow"),
            enemies = listOf("Thanos", "Ronan the Accuser", "High Evolutionary", "Ego the Living Planet"),
            movieAppearances = listOf(
                "Guardians of the Galaxy (2014)",
                "Guardians of the Galaxy Vol. 2 (2017)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)",
                "Thor: Love and Thunder (2022) — briefly",
                "Guardians of the Galaxy Vol. 3 (2023)"
            ),
            quote = "Laugh it up fuzzball... oh wait, that's me.",
            quoteSource = "Guardians of the Galaxy (2014)",
            firstAppearance = "Guardians of the Galaxy (2014)"
        ),

        Character(
            id = 20,
            heroName = "Winter Soldier / Bucky Barnes",
            realName = "James Buchanan \"Bucky\" Barnes",
            actor = "Sebastian Stan",
            team = "Expanded Avengers",
            status = "Active",
            bio = "Bucky Barnes was Steve Rogers's childhood best friend from Brooklyn. A decorated World War II soldier and member of the Howling Commandos, he was presumed dead after falling from a Hydra train in the Alps. He was secretly recovered by Hydra, had his left arm replaced with a vibranium cybernetic prosthetic, and was brainwashed and cryogenically frozen over decades as the assassin \"the Winter Soldier.\" He killed Howard and Maria Stark in 1991 under Hydra control. Freed from his programming by Steve Rogers, he struggled with his violent past. He sought redemption, made amends, and was elected to the U.S. House of Representatives. He is now a key member of the New Avengers.",
            powers = listOf(
                "Vibranium cybernetic left arm — enhanced strength",
                "Super-Soldier Serum (same formula as Captain America)",
                "Master assassin and hand-to-hand combatant",
                "Expert marksman and sniper",
                "Combat experience spanning eight decades"
            ),
            allies = listOf("Steve Rogers / Captain America", "Sam Wilson / Falcon", "Natasha Romanoff / Black Widow", "Yelena Belova", "Shuri (vibranium arm upgrade)"),
            enemies = listOf("Thanos", "Hydra", "Helmut Zemo", "Valentina Allegra de Fontaine", "HYDRA"),
            movieAppearances = listOf(
                "Captain America: The First Avenger (2011)",
                "Captain America: The Winter Soldier (2014)",
                "Captain America: Civil War (2016)",
                "Avengers: Infinity War (2018)",
                "Avengers: Endgame (2019)",
                "Thunderbolts* / The New Avengers (2025)"
            ),
            quote = "I'm not going to stop fighting until I've made amends. Every name on my list.",
            quoteSource = "The Falcon and the Winter Soldier (Disney+, 2021)",
            firstAppearance = "Captain America: The First Avenger (2011)"
        ),

        Character(
            id = 21,
            heroName = "Quicksilver",
            realName = "Pietro Django Maximoff",
            actor = "Aaron Taylor-Johnson",
            team = "Expanded Avengers",
            status = "Deceased",
            bio = "Pietro Maximoff was Wanda's twin brother from Sokovia. Like Wanda, he volunteered for HYDRA's Mind Stone experiments and gained superhuman speed. Initially opposing the Avengers alongside his sister — driven by revenge against Tony Stark for Stark Industries missiles that killed their parents — he later turned against Ultron to fight alongside the Avengers at the Battle of Sokovia. He died shielding Clint Barton and a child from Ultron's gunfire, becoming the only Avenger to permanently die in Age of Ultron.",
            powers = listOf(
                "Superhuman speed — fastest human-level speedster in the MCU",
                "Rapid reflexes at superhuman speeds",
                "Can run on water and up buildings",
                "Enhanced momentum-based strike attacks"
            ),
            allies = listOf("Wanda Maximoff / Scarlet Witch", "Clint Barton / Hawkeye", "Steve Rogers / Captain America"),
            enemies = listOf("Ultron", "Tony Stark / Iron Man (formerly)", "HYDRA (later)"),
            movieAppearances = listOf(
                "Captain America: The Winter Soldier (2014) — post-credits cameo",
                "Avengers: Age of Ultron (2015)"
            ),
            quote = "You didn't see that coming?",
            quoteSource = "Avengers: Age of Ultron (2015)",
            firstAppearance = "Captain America: The Winter Soldier (2014) — post-credits"
        ),

        // ── NEW AVENGERS (THUNDERBOLTS*) ─────────────────────────────────────────

        Character(
            id = 22,
            heroName = "Yelena Belova",
            realName = "Yelena Belova",
            actor = "Florence Pugh",
            team = "New Avengers",
            status = "Active",
            bio = "Yelena Belova is a Black Widow — a graduate of the Soviet Red Room program. She grew up believing the cover family she shared with Natasha, Alexei, and Melina was real, and was deeply affected when the truth was revealed. She worked to free other Widows from their mind control. After Natasha's death, Yelena was manipulated by Valentina Allegra de Fontaine into believing Clint Barton was responsible, but relented at the last moment. Drifting aimlessly, she was reluctantly drawn into Valentina's trap mission, which led to her forming a new family unit with the Thunderbolts. When Valentina co-opted their victory to announce them as the New Avengers, Yelena chose to embrace it. She is the de facto heart of the New Avengers.",
            powers = listOf(
                "Expert hand-to-hand combatant (Red Room trained)",
                "Master spy and infiltrator",
                "Expert markswoman",
                "Acrobat and parkour specialist",
                "Chemical weaponry expertise"
            ),
            allies = listOf("Natasha Romanoff / Black Widow (deceased)", "Alexei Shostakov / Red Guardian", "Bucky Barnes / Winter Soldier", "Ghost", "U.S. Agent"),
            enemies = listOf("Valentina Allegra de Fontaine (complicated)", "Red Room / General Dreykov", "The Void"),
            movieAppearances = listOf(
                "Black Widow (2021)",
                "Thunderbolts* / The New Avengers (2025)"
            ),
            quote = "We're not a team. We're a group of people who got tricked into the same room.",
            quoteSource = "Thunderbolts* (2025)",
            firstAppearance = "Black Widow (2021)"
        ),

        Character(
            id = 23,
            heroName = "Red Guardian",
            realName = "Alexei Alanovich Shostakov",
            actor = "David Harbour",
            team = "New Avengers",
            status = "Active",
            bio = "Alexei Shostakov is the Soviet Union's only Super Soldier — the Red Guardian — a counterpart to Captain America. Injected with the Soviet recreation of the Super-Soldier Serum, he served the USSR as a decorated hero before being decommissioned and imprisoned. He posed as a family man with Melina in Ohio as a cover mission, taking Natasha and Yelena as surrogate daughters. Deeply proud of his Red Guardian legacy (and prone to exaggerating it), he helped Natasha and Yelena liberate the Red Room and destroy Dreykov. He later worked as a freelance limo driver before being roped into the Thunderbolts' mission. He is the emotional anchor of the New Avengers — despite being oblivious to much of what's happening.",
            powers = listOf(
                "Soviet Super-Soldier Serum — enhanced strength, speed, and endurance",
                "Master hand-to-hand combatant",
                "Red Guardian armor and shield",
                "Military combat veteran (decades of experience)"
            ),
            allies = listOf("Yelena Belova", "Natasha Romanoff / Black Widow (deceased)", "Melina Vostokoff", "Bucky Barnes / Winter Soldier"),
            enemies = listOf("Red Room / Dreykov", "The Void", "Valentina Allegra de Fontaine (complicated)"),
            movieAppearances = listOf(
                "Black Widow (2021)",
                "Thunderbolts* / The New Avengers (2025)"
            ),
            quote = "I have been waiting my whole life for a rematch with Captain America. And now I will never get it.",
            quoteSource = "Black Widow (2021)",
            firstAppearance = "Black Widow (2021)"
        ),

        Character(
            id = 24,
            heroName = "Ghost",
            realName = "Ava Starr",
            actor = "Hannah John-Kamen",
            team = "New Avengers",
            status = "Active",
            bio = "Ava Starr is the daughter of scientist Elihas Starr, who worked with Hank Pym. After a Quantum Realm experiment killed her parents, she was caught in the explosion and became molecularly unstable — permanently phasing in and out of the physical world. S.H.I.E.L.D. exploited her condition, training her as a covert assassin called Ghost. She clashed with Ant-Man and the Wasp while seeking a cure, but was eventually stabilized with quantum energy by Janet van Dyne. She later joined Valentina de Fontaine's operation before becoming part of the Thunderbolts and ultimately the New Avengers.",
            powers = listOf(
                "Molecular phasing — can pass through solid matter",
                "Intangibility makes her nearly impossible to physically harm",
                "Trained S.H.I.E.L.D. assassin and stealth operative",
                "Expert hand-to-hand combatant",
                "Ghost suit amplifies her phasing abilities"
            ),
            allies = listOf("Yelena Belova", "Bucky Barnes / Winter Soldier", "Scott Lang / Ant-Man (formerly adversarial)", "Hope van Dyne / Wasp (formerly adversarial)"),
            enemies = listOf("The Void", "Valentina Allegra de Fontaine (complicated)", "Hank Pym (formerly)"),
            movieAppearances = listOf(
                "Ant-Man and the Wasp (2018)",
                "Thunderbolts* / The New Avengers (2025)"
            ),
            quote = "I spent my whole life being used. I'm done with that.",
            quoteSource = "Ant-Man and the Wasp (2018)",
            firstAppearance = "Ant-Man and the Wasp (2018)"
        ),

        Character(
            id = 25,
            heroName = "U.S. Agent",
            realName = "John Fitzgerald Walker",
            actor = "Wyatt Russell",
            team = "New Avengers",
            status = "Active",
            bio = "John Walker was a decorated U.S. Army captain — the most highly commended soldier in modern American history, with three Medals of Honor. He was selected by the U.S. government as Steve Rogers's replacement and publicly named the new Captain America, carrying the original shield. However, after his partner Lemar Hoskins was killed by a Flag Smasher, Walker took the Super-Soldier Serum he had obtained and publicly and brutally beat a Flag Smasher to death with the shield — captured on video. He was stripped of the Captain America title. Recruited by Valentina as U.S. Agent, he joined the Thunderbolts and, despite his flaws, proved himself a genuine hero during the Void crisis.",
            powers = listOf(
                "Super-Soldier Serum (self-administered) — enhanced strength and durability",
                "Expert military combatant and soldier",
                "U.S. Agent shield and armor",
                "High pain tolerance and battlefield experience"
            ),
            allies = listOf("Bucky Barnes / Winter Soldier", "Yelena Belova", "Lemar Hoskins (deceased)", "Valentina Allegra de Fontaine (complicated)"),
            enemies = listOf("Flag Smashers", "The Void", "Helmut Zemo (brief)"),
            movieAppearances = listOf(
                "Thunderbolts* / The New Avengers (2025)"
            ),
            quote = "I am Captain America. I'm the one who's doing this the right way.",
            quoteSource = "The Falcon and the Winter Soldier (Disney+, 2021)",
            firstAppearance = "The Falcon and the Winter Soldier (Disney+, 2021)"
        ),

        Character(
            id = 26,
            heroName = "Sentry",
            realName = "Robert \"Bob\" Reynolds",
            actor = "Lewis Pullman",
            team = "New Avengers",
            status = "Active",
            bio = "Bob Reynolds is a deeply troubled young man who was an unwitting volunteer in Project Sentry — a secret S.H.I.E.L.D. program attempting to recreate and enhance the Super-Soldier Serum. The experiment gave him nearly godlike power, but also created a dark alter ego called the Void — a being of pure destruction that took over Bob's body. Bob lived in obscurity, terrified of his own power. Valentina Allegra de Fontaine intended to use him as a PR weapon, but the Void broke free and nearly destroyed New York City before the Thunderbolts helped pull Bob back. He now lives with the New Avengers at the Watchtower, avoiding using his powers for fear of releasing the Void again.",
            powers = listOf(
                "The Power of a Million Exploding Suns — virtually unlimited physical power",
                "Superhuman strength, speed, flight, and invulnerability",
                "Light and energy projection",
                "The Void — dark alter ego with equal destructive power",
                "Near-instant regeneration"
            ),
            allies = listOf("Yelena Belova", "Bucky Barnes / Winter Soldier", "Red Guardian", "Ghost", "U.S. Agent"),
            enemies = listOf("The Void (his own dark half)", "Valentina Allegra de Fontaine (complicated)", "Project Sentry creators"),
            movieAppearances = listOf(
                "Thunderbolts* / The New Avengers (2025)"
            ),
            quote = "I can't control it. I've never been able to control it.",
            quoteSource = "Thunderbolts* (2025)",
            firstAppearance = "Thunderbolts* (2025)"
        )
    )

    fun getById(id: Int): Character? = characters.find { it.id == id }
    fun getByTeam(team: String): List<Character> = characters.filter { it.team == team }
    fun search(query: String): List<Character> = characters.filter {
        it.heroName.contains(query, ignoreCase = true) ||
        it.realName.contains(query, ignoreCase = true) ||
        it.actor.contains(query, ignoreCase = true)
    }
}
