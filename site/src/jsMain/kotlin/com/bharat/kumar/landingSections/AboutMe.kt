package com.bharat.kumar.landingSections

import androidx.compose.runtime.*
import com.bharat.kumar.components.common.VerticalText
import com.bharat.kumar.themes.Colors
import com.bharat.kumar.utils.Fonts.HELVETICA
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.dom.ref
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.layout.Divider
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
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        AboutMeText()
        AboutMeImage()
        SocialLinksBar()
    }
}

@Composable
fun AboutMeText() {
    Column(
        modifier = Modifier.fillMaxWidth(40.percent)
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
                .fontFamily("Playfair Display")
                .fontWeight(FontWeight.Light)
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
                .fontSize(16.px)
                .lineHeight(28.px)
                .color(Colors.White.rgb)
                .toAttrs()
        ){
            Text("I am an experienced Android Developer with expertise in Kotlin, Jetpack Architecture components, Clean Architecture with MVVM, Compose UI, SOLID Principles, and Agile methodologies. I am dedicated to continuously learning and adopting new technologies to deliver high-quality work and innovative applications. My meticulous problem-solving skills and attention to detail, combined with my ability to work effectively in a team, make me a valuable addition to any development project. I also teach people Android App Development and help them to grow as a better developer.\n")
        }

    }
}

@Composable
fun SocialLinksBar() {
    var heightOfText by remember { mutableStateOf(0) }
    var text by remember { mutableStateOf("0") }

    Column(modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
    /*    VerticalText(
            textModifier = Modifier
                .color(Colors.Secondary.rgb)
                .margin(0.px)
                .fontFamily(HELVETICA)
                .fontWeight(FontWeight.SemiBold),
            text = "FOLLOW ME ON:"
        )*/
        Box(
            ref = ref{
              heightOfText  = it.offsetWidth
            }
        ) {
            SpanText(
                text = "FOLLOW ME ON : ",
                modifier = Modifier
                    .rotate(90.deg)
                    .margin(top = heightOfText.px/2)
                    .color(Colors.Secondary.rgb)
                    .fontFamily(HELVETICA)
                    .fontWeight(FontWeight.SemiBold)
            )
        }

        Divider(
            modifier = Modifier
                .height(40.px)
                .margin(top = heightOfText.px/2, bottom = 20.px)
                .backgroundColor(Colors.White.rgb)
                .borderColor(Colors.Secondary.rgb)
                .width(2.px)

        )

        FaLinkedinIn(
            modifier = Modifier.color(Colors.Secondary.rgb).margin(bottom = 20.px),
            size = IconSize.XL
        )
        FaGithubAlt(
            modifier = Modifier.color(Colors.Secondary.rgb).margin(topBottom = 20.px),
            size = IconSize.XL
        )
        FaInstagram(
            modifier = Modifier.color(Colors.Secondary.rgb).margin(topBottom = 20.px),
            size = IconSize.XL
        )
    }
}

@Composable
fun AboutMeImage() {
    Image(
        modifier = Modifier.fillMaxHeight().fillMaxWidth(40.percent),
        src = "myImage_test.png"
    )
}


