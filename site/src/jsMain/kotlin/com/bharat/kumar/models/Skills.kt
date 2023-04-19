package com.bharat.kumar.models;

enum class Skills(
    val id: String,
    val title: String,
    val percentIn100: Int,
    val path: String
) {
    Android(
        id = "android",
        title = "Android",
        percentIn100 = 90,
        path = "#android"
    ),
    Kotlin(
        id = "aboutMe",
        title = "About Me",
        percentIn100 = 80,
        path = "#kotlin"
    ),
    Java(
        id = "skills",
        title = "My Skills",
        percentIn100 = 70,
        path = "#java"
    ),
    Compose(
        id = "compose",
        title = "Compose",
        percentIn100 = 60,
        path = "#compose"
    ),
    SpringBoot(
        id = "blogs",
        title = "Blogs",
        percentIn100 = 40,
        path = "#spring"
    ),
    Kobweb(
        id = "kobweb",
        title = "Kobweb",
        percentIn100 = 60,
        path = "#kobweb"
    )
}