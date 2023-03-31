package com.bharat.kumar.landingSections

import androidx.compose.runtime.Composable
import com.bharat.kumar.landingSections.styles.MainLogoImageStyle
import com.bharat.kumar.landingSections.styles.NavigationItemStyle
import com.bharat.kumar.models.Section
import com.bharat.kumar.themes.Colors
import com.bharat.kumar.utils.Constants.SECTION_WIDTH
import com.bharat.kumar.utils.Resources.WEBSITE_LOGO
import com.varabyte.kobweb.compose.css.FontStyle
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
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.CSSKeywordValue
import org.jetbrains.compose.web.css.keywords.CSSAutoKeyword
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Composable
fun HeaderSection() {
    Row (
        modifier = Modifier.width(SECTION_WIDTH.px)
            .padding(leftRight = 50.px),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(
            modifier = MainLogoImageStyle.toModifier()
                .fillMaxWidth(15.percent)
                .objectFit(ObjectFit.Fill),
            src = WEBSITE_LOGO
        )
        HeaderMenu()
        Button(
            modifier = Modifier.width(10.percent).backgroundColor(Colors.Secondary.rgb),
          onClick = {

          }
        ){
            Text("Download CV")
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
                    .margin(right = 20.px)
                    .textDecorationLine(TextDecorationLine.None)
            )
        }
    }
}
