package com.bharat.kumar.landingSections

import androidx.compose.runtime.Composable
import com.bharat.kumar.models.Experience
import com.bharat.kumar.themes.Color
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.functions.RadialGradient
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.shapes.Polygon
import com.varabyte.kobweb.silk.theme.shapes.Shape
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
fun ExperienceSection() {
    var i = 1
    Column (modifier = Modifier.fillMaxWidth().padding(50.px)){
        ExperienceHeading()

        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight().margin(50.px).scrollBehavior(ScrollBehavior.Smooth),
            horizontalArrangement = Arrangement.Center,

            ) {
            Experience.values().forEach {
                val isLast = i == Experience.values().size
                if (i%2 == 0)
                {
                    ExperienceCard(it, true, isLast)
                }
                else
                {
                    ExperienceCard(it, false, isLast)
                }
                i++
            }

        }

    }
}



@Composable
fun ExperienceHeading(){
    SpanText(
        text = "My Experiences",
        modifier = Modifier.fillMaxWidth().textAlign(TextAlign.Center).fontSize(36.px).color(Colors.White)
    )

}

@Composable
fun ExperienceCard(experience: Experience,isDownWards:Boolean, isLast: Boolean)
{
    Column (modifier = Modifier.width(300.px),
        horizontalAlignment = Alignment.Start
    ){
        if (isDownWards)
        {
            Div (
                attrs = Modifier.height(150.px).toAttrs()
            ){
            }
            ExperiencePeriod(experience,isLast)
            ExperienceCardTitleAndDescription(experience)
        }
        else{

            ExperienceCardTitleAndDescription(experience)
            ExperiencePeriod(experience,isLast)
        }

    }

}


@Composable
fun ExperienceCardTitleAndDescription(experience: Experience) {
    Row (modifier = Modifier.height(150.px)){
        Div (
            attrs = TextBorder.toAttrs()
        ){
        }
        Column(modifier = Modifier.margin(left = 30.px)) {
            SpanText(
                text = experience.company,
                modifier = Modifier.fillMaxWidth().textAlign(TextAlign.Start).fontSize(35.px).color(Colors.White)
            )
            SpanText(
                text = experience.description,
                modifier = Modifier.fillMaxWidth().textAlign(TextAlign.Start).fontSize(20.px).color(Colors.White)
            )
        }
    }
}

@Composable
fun ExperiencePeriod(experience: Experience, isLast:Boolean) {
    Row (modifier = Modifier.fillMaxWidth().height(50.px).margin(top = 20.px, bottom = 20.px), verticalAlignment = Alignment.CenterVertically){
        SpanText(
            text = "2000- 2004",
            modifier = Modifier.backgroundColor(Color.Secondary.rgb)
                .fillMaxWidth(80.percent)
                .textAlign(TextAlign.Center)
                .color(Colors.White)
                .borderRadius(topRight = 20.px, bottomRight = 20.px, bottomLeft = 0.px, topLeft = 0.px)
                .clip(Polygon(Pair(0,0),Pair(80,0), Pair(100,50),Pair(80,100),Pair(0,100) ))
                .padding(right = 40.px, left = 12.px, top = 12.px, bottom = 12.px)
        )
        if (!isLast)
        {
            Div(
                attrs = Modifier.height(5.px).backgroundColor(Color.Secondary.rgb).fillMaxWidth(30.percent).margin(left = (-14).px, right = (-14).px).toAttrs()
            ) {  }
        }

    }


}



val commonModifierOfLine = Modifier.content("")
    .width(10.px)
    .height(10.px)
    .position(Position.Absolute)
    .borderRadius(5.px)
    .backgroundColor(Color.Secondary.rgb)
    .left((-5).px)

val TextBorder by ComponentStyle {
    base {
        Modifier.borderLeft(1.px, color = Color.Secondary.rgb, style = LineStyle.Solid)
            .fillMaxHeight()
            .position(Position.Relative)
    }

    before{
        commonModifierOfLine
    }
    after{
        commonModifierOfLine.bottom(0.px)
    }
}