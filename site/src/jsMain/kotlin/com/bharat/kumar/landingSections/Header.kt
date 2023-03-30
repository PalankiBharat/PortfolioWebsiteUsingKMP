package com.bharat.kumar.landingSections

import androidx.compose.runtime.Composable
import com.bharat.kumar.models.Section
import com.bharat.kumar.themes.Colors
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.keywords.CSSAutoKeyword
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Composable
fun HeaderSection() {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(
            modifier = Modifier.fillMaxWidth(15.percent).objectFit(ObjectFit.Fill),
            src = "myWebsiteIcon.svg"
        )
        HeaderMenu()
        Button(
            modifier = Modifier.backgroundColor(Colors.Secondary.rgb),
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
                modifier = Modifier.margin(right = 20.px)
            )
        }
    }
}
