package com.bharat.kumar.landingSections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.bharat.kumar.themes.Colors
import com.varabyte.kobweb.compose.css.MaxWidth
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.style.ComponentVariant
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutMeSection() {
    val breakPoint by rememberBreakpoint()
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(leftRight = 50.px),
        verticalAlignment = Alignment.CenterVertically
    ){
        AboutMeText()
        SocialLinksBar()
    }
}

@Composable
fun AboutMeText() {
    Column(
        modifier = Modifier.fillMaxWidth(50.percent)
    ){
        SpanText(
            modifier = Modifier
                .padding(10.px)
                .backgroundColor(Colors.WelcomeTextBackground.rgb)
                .color(Colors.White.rgb)
                .margin(0.px)
                .borderRadius(6.px),
            text = "Welcome I'M"
        )

        P (
            attrs = Modifier
                .fontSize(46.px)
                .margin(topBottom = 10.px)
                .color(Colors.White.rgb)
                .toAttrs()
        ){
            Text("P N Bharat Kumar")
        }

        P (
            attrs = Modifier
                .fontSize(18.px)
                .margin(topBottom = 10.px)
                .color(Colors.White.rgb)
                .toAttrs()
        ){
            Text("Android App Developer")
        }

        P (
            attrs = Modifier
                .fontSize(18.px)
                .lineHeight(26.px)
                .color(Colors.White.rgb)
                .toAttrs()
        ){
            Text("I am an experienced Android Developer with expertise in Kotlin, Jetpack Architecture components, Clean Architecture with MVVM, Compose UI, SOLID Principles, and Agile methodologies. I am dedicated to continuously learning and adopting new technologies to deliver high-quality work and innovative applications. My meticulous problem-solving skills and attention to detail, combined with my ability to work effectively in a team, make me a valuable addition to any development project. I also teach people Android App Development and help them to grow as a better developer.\n")
        }

    }
}

@Composable
fun SocialLinksBar() {
    Column {
        P (
            attrs = Modifier
                .color(Colors.Secondary.rgb)
                .rotate(90.deg)
                .toAttrs()
        ){
            Text("FOLLOW ME ON: ----")
        }
    }
}


