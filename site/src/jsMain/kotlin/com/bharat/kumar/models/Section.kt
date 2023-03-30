package com.bharat.kumar.models;

enum class Section(
        val id:String,
        val title:String,
        val subtitle:String,
        val path:String
){
        Home(
                id = "home",
                title = "Home",
                subtitle = "Home Page",
                path = "#home"
        ),
        AboutMe(
                id = "aboutMe",
                title = "About Me",
                subtitle = "Why Hire Me?",
                path = "#aboutMe"
        ),
        Skills(
                id = "skills",
                title = "My Skills",
                subtitle = "What am I good at?",
                path = "#skills"
        ),
        Blogs(
        id = "blogs",
        title = "Blogs",
        subtitle = "My Blogs",
        path = "#blogs"
        ),
        Experience(
                id = "experience",
                title = "Experience",
                subtitle = "My Experience",
                path = "#experience"
        ),
        ContactMe(
                id = "contactMe",
                title = "Contact",
                subtitle = "Let's have a talk",
                path = "#contactMe"
        )


}