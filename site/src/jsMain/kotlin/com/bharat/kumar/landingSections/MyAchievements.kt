package com.bharat.kumar.landingSections

import androidx.compose.runtime.Composable
import com.bharat.kumar.landingSections.styles.AchievementsBorderStyle
import com.bharat.kumar.models.Achievements
import com.bharat.kumar.themes.Color
import com.bharat.kumar.utils.Fonts.HELVETICA
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun MyAchievements() {

    Row(
        modifier = Modifier
            .fillMaxWidth().backgroundColor(Color.SecondaryVariant.rgb).padding(50.px),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Achievements.values().forEach { achievements ->
            AchievementsCard(achievements)
        }
    }
}

@Composable
fun AchievementsCard(achievements: Achievements) {
    Box(
        modifier = AchievementsBorderStyle.toModifier()
            .fillMaxWidth(percent = 16.percent)
            .height(200.px)
            .padding(30.px)
            .margin(10.px)
            .borderWidth(2.px)
            .borderColor(Color.Secondary.rgb)
            .borderRadius(topRight = 30.px, topLeft = 0.px, bottomLeft = 0.px, bottomRight = 0.px)


    )
    {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.Center)
        ) {
            SpanText(
                text = achievements.title,
                modifier = Modifier.fontSize(40.px).fontWeight(FontWeight.Bold).color(Colors.White)
                    .fontFamily(HELVETICA).textAlign(TextAlign.Center)
            )
            SpanText(
                text = achievements.subtitle,
                modifier = Modifier.fontSize(25.px).color(Colors.White).fontFamily(HELVETICA)
                    .textAlign(TextAlign.Center)
            )
        }
    }
}