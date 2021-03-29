
package com.example.mysubmission1jetpack.utils


import com.example.mysubmission1jetpack.R
import com.example.mysubmission1jetpack.data.source.local.entity.Entity
import com.example.mysubmission1jetpack.data.source.remote.response.Response


object DataDummy {

    fun generateDummyMovie(): List<Entity>{
        val movies = ArrayList<Entity>()

        movies.add(
            Entity(
                "m1",
                "Raya and the Last Dragon",
                "Maret 3, 2021",
                "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
                false,
                "${R.drawable.poster_raya}"
            )
        )

        movies.add(
            Entity(
                "m2",
                "Arrow",
                "October 10, 2012",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                false,
                "${R.drawable.poster_arrow}"
            )
        )

        movies.add(
            Entity(
                "m3",
                "Bohemian Rhapsody",
                "October 24, 2018",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                false,
                "${R.drawable.poster_bohemian}"
            )
        )

        movies.add(
            Entity(
                "m4",
                "Doom Patrol",
                "February 15, 2019",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                false,
                "${R.drawable.poster_doom_patrol}"
            )
        )

        movies.add(
            Entity(
                "m5",
                "Hanna",
                "April 7, 2011",
                "Raised by her father, an ex-CIA agent, in the wilds of Finland, Hanna's upbringing has been geared to making her the perfect assassin. Sent into the world by her father on a mission, Hanna journeys across Europe, eluding agents dispatched after her by a ruthless intelligence operative. As she nears her ultimate target, Hanna faces startling revelations about her existence.",
                false,
                "${R.drawable.poster_hanna}"
            )
        )

        movies.add(
            Entity(
                "m6",
                "Marvel's Iron Fist",
                "March 17, 2017",
                "",
                false,
                "${R.drawable.poster_iron_fist}"
            )
        )

        movies.add(
            Entity(
                "m7",
                "Naruto Shippuden the Movie",
                "August 4, 2007",
                "Demons that once almost destroyed the world, are revived by someone. To prevent the world from being destroyed, the demon has to be sealed and the only one who can do it is the shrine maiden Shion from the country of demons, who has two powers; one is sealing demons and the other is predicting the deaths of humans. This time Naruto's mission is to guard Shion, but she predicts Naruto's death. The only way to escape it, is to get away from Shion, which would leave her unguarded, then the demon, whose only goal is to kill Shion will do so, thus meaning the end of the world. Naruto decides to challenge this prediction of death.",
                false,
                "${R.drawable.poster_naruto_shipudden}"
            )
        )

        movies.add(
            Entity(
                "m8",
                "Serenity",
                "January 24, 2019",
                "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                false,
                "${R.drawable.poster_serenity}"
            )
        )

        movies.add(
            Entity(
                "m9",
                "Spider-Man",
                "November 19, 1994",
                "Bitten by a radioactive spider, Peter Parker develops spider-like superpowers. He uses these to fight crime while trying to balance it with the struggles of his personal life.",
                false,
                "${R.drawable.poster_spiderman}"
            )
        )

        movies.add(
            Entity(
                "m10",
                "T-34",
                "December 27, 2018",
                "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                false,
                "${R.drawable.poster_t34}"
            )
        )

        return movies
    }

    fun generateDummyTvshow(): ArrayList<Entity>{
        val tvshow = ArrayList<Entity>()

        tvshow.add(
            Entity(
                "t1",
                "WandaVision",
                "Januari 15, 2021",
                "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                false,
                "${R.drawable.poster_wandavision}"
            )
        )

        tvshow.add(
            Entity(
                "t2",
                "Gotham",
                "September 22, 2014",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                false,
                "${R.drawable.poster_gotham}"
            )
        )

        tvshow.add(
            Entity(
                "t3",
                "NCIS",
                "September 23, 2003",
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                false,
                "${R.drawable.poster_ncis}"
            )
        )

        tvshow.add(
            Entity(
                "t4",
                "Riverdale",
                "January 26, 2017",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                false,
                "${R.drawable.poster_riverdale}"
            )
        )

        tvshow.add(
            Entity(
                "t5",
                "Shameless",
                "January 13, 2004",
                "The story of a young group of siblings pretty much abandoned by their parents, surviving by their wits - and humor - on a rough Manchester council estate. Whilst they won't admit it, they need help and find it in Steve, a young middle class lad who falls for Fiona, the oldest sibling, and increasingly finds himself drawn to this unconventional and unique family. Anarchic family life seen through the eyes of an exceptionally bright fifteen year old, who struggles to come of age in the context of his belligerent father, closeted brother, psychotic sister and internet porn star neighbors.",
                false,
                "${R.drawable.poster_shameless}"
            )
        )

        tvshow.add(
            Entity(
                "t6",
                "Supergirl",
                "October 26, 2015",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                false,
                "${R.drawable.poster_supergirl}"
            )
        )

        tvshow.add(
            Entity(
                "t7",
                "Supernatural",
                "September 13, 2005",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                false,
                "${R.drawable.poster_supernatural}"
            )
        )

        tvshow.add(
            Entity(
                "t8",
                "The Simpsons",
                "December 17, 1989",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                false,
                "${R.drawable.poster_the_simpson}"
            )
        )

        tvshow.add(
            Entity(
                "t9",
                "The Umbrella Academy",
                "February 15, 2019",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                false,
                "${R.drawable.poster_the_umbrella}"
            )
        )

        tvshow.add(
            Entity(
                "t10",
                "The Walking Dead",
                "October 31, 2010",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                false,
                "${R.drawable.poster_the_walking_dead}"
            )
        )

        return tvshow
    }

    // REMOTE DATA  `//

    fun generateRemoteDummyMovie(): List<Response>{
        val movies = ArrayList<Response>()

        movies.add(
                Response(
                        "m1",
                        "Raya and the Last Dragon",
                        "Maret 3, 2021",
                        "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
                        false,
                        "${R.drawable.poster_raya}"
                )
        )

        movies.add(
                Response(
                        "m2",
                        "Arrow",
                        "October 10, 2012",
                        "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                        false,
                        "${R.drawable.poster_arrow}"
                )
        )

        movies.add(
                Response(
                        "m3",
                        "Bohemian Rhapsody",
                        "October 24, 2018",
                        "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                        false,
                        "${R.drawable.poster_bohemian}"
                )
        )

        movies.add(
                Response(
                        "m4",
                        "Doom Patrol",
                        "February 15, 2019",
                        "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                        false,
                        "${R.drawable.poster_doom_patrol}"
                )
        )

        movies.add(
                Response(
                        "m5",
                        "Hanna",
                        "April 7, 2011",
                        "Raised by her father, an ex-CIA agent, in the wilds of Finland, Hanna's upbringing has been geared to making her the perfect assassin. Sent into the world by her father on a mission, Hanna journeys across Europe, eluding agents dispatched after her by a ruthless intelligence operative. As she nears her ultimate target, Hanna faces startling revelations about her existence.",
                        false,
                        "${R.drawable.poster_hanna}"
                )
        )

        movies.add(
                Response(
                        "m6",
                        "Marvel's Iron Fist",
                        "March 17, 2017",
                        "",
                        false,
                        "${R.drawable.poster_iron_fist}"
                )
        )

        movies.add(
                Response(
                        "m7",
                        "Naruto Shippuden the Movie",
                        "August 4, 2007",
                        "Demons that once almost destroyed the world, are revived by someone. To prevent the world from being destroyed, the demon has to be sealed and the only one who can do it is the shrine maiden Shion from the country of demons, who has two powers; one is sealing demons and the other is predicting the deaths of humans. This time Naruto's mission is to guard Shion, but she predicts Naruto's death. The only way to escape it, is to get away from Shion, which would leave her unguarded, then the demon, whose only goal is to kill Shion will do so, thus meaning the end of the world. Naruto decides to challenge this prediction of death.",
                        false,
                        "${R.drawable.poster_naruto_shipudden}"
                )
        )

        movies.add(
                Response(
                        "m8",
                        "Serenity",
                        "January 24, 2019",
                        "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                        false,
                        "${R.drawable.poster_serenity}"
                )
        )

        movies.add(
                Response(
                        "m9",
                        "Spider-Man",
                        "November 19, 1994",
                        "Bitten by a radioactive spider, Peter Parker develops spider-like superpowers. He uses these to fight crime while trying to balance it with the struggles of his personal life.",
                        false,
                        "${R.drawable.poster_spiderman}"
                )
        )

        movies.add(
                Response(
                        "m10",
                        "T-34",
                        "December 27, 2018",
                        "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                        false,
                        "${R.drawable.poster_t34}"
                )
        )

        return movies
    }

    fun generateRemoteDummyTvshow(): List<Response>{
        val tvshow = ArrayList<Response>()

        tvshow.add(
                Response(
                        "t1",
                        "WandaVision",
                        "Januari 15, 2021",
                        "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                        false,
                        "${R.drawable.poster_wandavision}"
                )
        )

        tvshow.add(
                Response(
                        "t2",
                        "Gotham",
                        "September 22, 2014",
                        "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                        false,
                        "${R.drawable.poster_gotham}"
                )
        )

        tvshow.add(
                Response(
                        "t3",
                        "NCIS",
                        "September 23, 2003",
                        "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                        false,
                        "${R.drawable.poster_ncis}"
                )
        )

        tvshow.add(
                Response(
                        "t4",
                        "Riverdale",
                        "January 26, 2017",
                        "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                        false,
                        "${R.drawable.poster_riverdale}"
                )
        )

        tvshow.add(
                Response(
                        "t5",
                        "Shameless",
                        "January 13, 2004",
                        "The story of a young group of siblings pretty much abandoned by their parents, surviving by their wits - and humor - on a rough Manchester council estate. Whilst they won't admit it, they need help and find it in Steve, a young middle class lad who falls for Fiona, the oldest sibling, and increasingly finds himself drawn to this unconventional and unique family. Anarchic family life seen through the eyes of an exceptionally bright fifteen year old, who struggles to come of age in the context of his belligerent father, closeted brother, psychotic sister and internet porn star neighbors.",
                        false,
                        "${R.drawable.poster_shameless}"
                )
        )

        tvshow.add(
                Response(
                        "t6",
                        "Supergirl",
                        "October 26, 2015",
                        "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                        false,
                        "${R.drawable.poster_supergirl}"
                )
        )

        tvshow.add(
                Response(
                        "t7",
                        "Supernatural",
                        "September 13, 2005",
                        "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                        false,
                        "${R.drawable.poster_supernatural}"
                )
        )

        tvshow.add(
                Response(
                        "t8",
                        "The Simpsons",
                        "December 17, 1989",
                        "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                        false,
                        "${R.drawable.poster_the_simpson}"
                )
        )

        tvshow.add(
                Response(
                        "t9",
                        "The Umbrella Academy",
                        "February 15, 2019",
                        "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                        false,
                        "${R.drawable.poster_the_umbrella}"
                )
        )

        tvshow.add(
                Response(
                        "t10",
                        "The Walking Dead",
                        "October 31, 2010",
                        "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                        false,
                        "${R.drawable.poster_the_walking_dead}"
                )
        )

        return tvshow
    }
}
