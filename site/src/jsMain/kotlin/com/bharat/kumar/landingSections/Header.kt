package com.bharat.kumar.landingSections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.bharat.kumar.landingSections.styles.MainLogoImageStyle
import com.bharat.kumar.landingSections.styles.NavigationItemStyle
import com.bharat.kumar.models.Section
import com.bharat.kumar.themes.Colors
import com.bharat.kumar.utils.Resources.WEBSITE_LOGO
import com.varabyte.kobweb.compose.css.MaxWidth
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Width
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
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun HeaderSection() {
    val breakPoint by rememberBreakpoint()
    Row (
        modifier = Modifier.fillMaxWidth()
            .padding(leftRight = 50.px),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ){
        LeftSide(breakPoint)
        if (breakPoint > Breakpoint.MD) {
            HeaderMenu()
            Button(
                modifier = Modifier.maxWidth(MaxWidth.MaxContext).backgroundColor(Colors.Secondary.rgb),
                onClick = {

                }
            ){
                SpanText(text = "Download CV" , modifier = Modifier.color(Colors.White.rgb).width(Width.MaxContext))
            }
        }

    }

}

@Composable
fun HeaderMenu() {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ){
        Section.values().forEach {
            Link(path = it.path,
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
    if (breakpoint < Breakpoint.MD)
    {
       FaBars(modifier = Modifier.margin(right = 20.px).color(Colors.White.rgb))
    }
    Image(
        modifier = MainLogoImageStyle.toModifier()
            .run {
                if (breakpoint < Breakpoint.MD)
                {
                    fillMaxWidth(40.percent)
                }
                else{
                    fillMaxWidth(15.percent)
                }
            }
            .objectFit(ObjectFit.Fill),
        src = WEBSITE_LOGO
    )

}
