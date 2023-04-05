package com.bharat.kumar.landingSections

import androidx.compose.runtime.Composable
import com.bharat.kumar.models.Experience
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.*
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.keywords.CSSAutoKeyword
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.unaryMinus

@Composable
fun ExperienceSection() {
    Row {
        Experience.values().forEach {
            ExperienceCard(it)
        }
    }
}

@Composable
fun ExperienceCard(experience: Experience)
{
    SpanText(
        text = "ASDasd",
        modifier = TextBorder.toModifier()
    )
}



val TextBorder by ComponentStyle {
    before{
        Modifier.content("").position(Position.Absolute).bottom((-6).px).left(0.px).height(10.px).width(10.px).borderRadius(5.px)
    }
    after{
        Modifier.right(0.px).left(auto)
    }


}