package com.bharat.kumar.landingSections.styles

import com.bharat.kumar.themes.Color
import com.varabyte.kobweb.compose.css.CSSFloat
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.*
import org.jetbrains.compose.web.css.*


val NavigationItemStyle by ComponentStyle {
    anyLink{
        Modifier
            .color(Color.White.rgb)
            .fontSize(18.px)
            .fontFamily("Roboto")
            .transition(CSSTransition("color",500.ms))
            .transition(CSSTransition("font-size",500.ms))

    }
    hover{
        Modifier
            .color(Color.Secondary.rgb)
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

val AchievementsBorderStyle by ComponentStyle {
    base{
        Modifier
            .borderStyle(LineStyle.Dashed)
            .transition(CSSTransition("border-style",500.ms))
    }
    hover{
        Modifier
            .borderStyle(LineStyle.Solid)
            .transition(CSSTransition("border-style",500.ms))
    }
}

val  ButtonStyle by ComponentStyle {
    base{
        Modifier
            .width(150.px)
            .transition(CSSTransition("width",300.ms))
    }
    hover{
        Modifier
            .width(180.px)
            .transition(CSSTransition("width",300.ms))
    }
}

val  NavHeaderStyle by ComponentStyle {
    base{
        Modifier.fillMaxWidth()
            .padding(leftRight = 50.px)
            .position(Position.Fixed)
            .backgroundColor(Color.Primary.rgb)
            .opacity(0.8)
            .transition(CSSTransition("ease-in-out", 0.32.s))
            .height(70.px)
            //.transition(CSSTransition("height",100.ms))
            .transition(CSSTransition("opacity",300.ms))

    }
    hover{
        Modifier
            .opacity(1)
            //.height(60.px)
            .transition(CSSTransition("opacity",300.ms))
    }
}
