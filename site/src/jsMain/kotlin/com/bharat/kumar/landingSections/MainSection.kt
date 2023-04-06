package com.bharat.kumar.landingSections

import androidx.compose.runtime.Composable
import com.bharat.kumar.themes.Color
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.scrollBehavior
import org.jetbrains.compose.web.dom.Progress

@Composable
fun MainSection() {
    Column (
        modifier = Modifier.fillMaxSize().backgroundColor(Color.Primary.rgb).scrollBehavior(ScrollBehavior.Smooth),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        HeaderSection()
        AboutMeSection()
        MyAchievements()
        ExperienceSection()


    }

}