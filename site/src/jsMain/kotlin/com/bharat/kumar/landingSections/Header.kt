package com.bharat.kumar.landingSections

import androidx.compose.runtime.*
import com.bharat.kumar.landingSections.styles.ButtonStyle
import com.bharat.kumar.landingSections.styles.MainLogoImageStyle
import com.bharat.kumar.landingSections.styles.NavHeaderStyle
import com.bharat.kumar.landingSections.styles.NavigationItemStyle
import com.bharat.kumar.models.Section
import com.bharat.kumar.themes.Color
import com.bharat.kumar.utils.Resources.WEBSITE_LOGO
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*
import org.w3c.dom.Window
import org.w3c.dom.events.EventListener

@Composable
fun HeaderSection() {
    val breakPoint by rememberBreakpoint()
    var scrollState by remember { mutableStateOf(window.scrollY) }
    DisposableEffect(Unit) {
        val scrollListener = EventListener { scrollState = window.scrollY }
        window.addEventListener("scroll", scrollListener )
        onDispose {
            window.removeEventListener("scroll", scrollListener )
        }
    }
    Row(
        modifier = NavHeaderStyle.toModifier().transition(CSSTransition("height",300.ms)).run {
            if (scrollState > 0) {
                this.height(60.px)

            } else {
                this.height(70.px)
            }
        },
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        LeftSide(breakPoint)
        if (breakPoint > Breakpoint.MD) {
            HeaderMenu()
            Button(
                modifier = ButtonStyle.toModifier().backgroundColor(Color.Secondary.rgb),
                onClick = {

                }
            ) {
                SpanText(text = "Download CV", modifier = Modifier.color(Color.White.rgb).width(Width.MaxContext))
            }
        }

    }

}

@Composable
fun HeaderMenu() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ) {
        Section.values().forEach {
            Link(
                path = it.path,
                text = it.title,
                modifier = NavigationItemStyle
                    .toModifier()
                    .margin(right = 50.px)
                    .textDecorationLine(TextDecorationLine.None)
            )
        }
    }
}

@Composable
fun LeftSide(breakpoint: Breakpoint) {
    if (breakpoint < Breakpoint.MD) {
        FaBars(modifier = Modifier.margin(right = 20.px).color(Color.White.rgb))
    }
    Image(
        modifier = MainLogoImageStyle.toModifier()
            .run {
                if (breakpoint < Breakpoint.MD) {
                    fillMaxWidth(40.percent)
                } else {
                    fillMaxWidth(15.percent)
                }
            }
            .objectFit(ObjectFit.Fill),
        src = WEBSITE_LOGO
    )

}
