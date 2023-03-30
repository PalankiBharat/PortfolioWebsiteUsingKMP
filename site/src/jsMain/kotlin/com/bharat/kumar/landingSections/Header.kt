package com.bharat.kumar.landingSections

import androidx.compose.runtime.Composable
import com.bharat.kumar.themes.Colors
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.percent

@Composable
fun HeaderSection() {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ){
        Image(
            modifier = Modifier.fillMaxWidth(15.percent).objectFit(ObjectFit.Fill),
            src = "myWebsiteIcon.svg"
        )
    }

}

@Composable
fun HeaderMenu() {
    Row {

    }
}
