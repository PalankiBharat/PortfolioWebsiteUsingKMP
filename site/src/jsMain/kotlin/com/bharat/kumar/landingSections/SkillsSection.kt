package com.bharat.kumar.landingSections

import androidx.compose.runtime.*
import com.bharat.kumar.models.Skills
import com.bharat.kumar.utils.ObserveViewportEntered
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.JustifyContent
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import kotlinx.coroutines.delay
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

@Composable
fun SkillsSection() {
    Column(
        modifier = Modifier.fillMaxWidth()
            .id("skills")
            .backgroundColor(com.bharat.kumar.themes.Color.SecondaryVariant.rgb)
            .padding(50.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SkillsHeading()
        SkillsSubHeading()
        SkillsList()

    }


}

@Composable
fun SkillsHeading(){
    SpanText(
        text = "My Skills",
        modifier = Modifier.fillMaxWidth().textAlign(TextAlign.Center).fontSize(36.px).color(Colors.White)
    )
}

@Composable
fun SkillsSubHeading(){
    SpanText(
        text = "Explore My Versatile Skills and Expertise in Android App Development to Achieve Your Goals. With years of experience in developing Android Apps, I have developed a diverse set of skills and expertise that can help you succeed in your endeavors.",
        modifier = Modifier.fillMaxWidth(70.percent).textAlign(TextAlign.Center).fontSize(22.px).color(Colors.White).margin(25.px)
    )
}

@Composable
fun SkillsList() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        Skills.values().forEach {
            CircularProgressBar(
                stop = it.percentIn100,
                text = it.title
            )
        }
    }
}

@Composable
fun CircularProgressBar(
    start: Int = 0,
    stop: Int = 100,
    delay: Duration = 25.milliseconds,
    text :String = ""
) {
    var viewPortEntered by remember { mutableStateOf(false) }

    ObserveViewportEntered(
        "skills",
        1000.0
    ){
        viewPortEntered = true
    }

    var current by remember { mutableStateOf(start) }
    if (viewPortEntered)
    {
        LaunchedEffect(Unit) {
            while (current < stop) {
                current++
                delay(delay)
            }
        }
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            Modifier
                .display(DisplayStyle.Flex)
                .justifyContent(JustifyContent.Center)
                .alignItems(AlignItems.Center)
                .size(100.px)
                .borderRadius(50.percent)

                .styleModifier {
                    property(
                        propertyName = "background",
                        value = "radial-gradient(closest-side, ${com.bharat.kumar.themes.Color.SecondaryVariant.hex} 79%, transparent 80% 100%),conic-gradient(${com.bharat.kumar.themes.Color.Secondary.hex} $current%, ${com.bharat.kumar.themes.Color.SecondaryVariant.hex} 0)"
                    )
                }
        ) {
            SpanText(
                text = "$current%",
                modifier = Modifier
                    .fontSize(18.px)
                    .fontWeight(600)
                    .color(Color.white)
            )
        }

        SpanText(
            text = text,
            modifier = Modifier
                .fontSize(18.px)
                .margin(top = 30.px)
                .color(Color.white)
        )
    }


}

