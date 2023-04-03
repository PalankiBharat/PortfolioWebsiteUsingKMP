package com.bharat.kumar.landingSections.styles

import com.bharat.kumar.themes.Colors
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.anyLink
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


val NavigationItemStyle by ComponentStyle {
    anyLink{
        Modifier
            .color(Colors.White.rgb)
            .fontSize(18.px)
            .fontFamily("Roboto")
            .transition(CSSTransition("color",500.ms))
            .transition(CSSTransition("font-size",500.ms))

    }
    hover{
        Modifier
            .color(Colors.Secondary.rgb)
            .fontSize(20.px)
    }
}

val MainLogoImageStyle by ComponentStyle {
    base{
        Modifier
            .transition(CSSTransition("scale",500.ms))

    }
    hover{
        Modifier
            .scale(1.2)
            .transition(CSSTransition("scale",500.ms))
    }
}