package com.bharat.kumar.components.common

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.rotate
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.px
import org.w3c.dom.Text

@Composable
fun VerticalText(textModifier: Modifier = Modifier, text: String, columnModifier: Modifier = Modifier) {
    Column(
        modifier = columnModifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        text.forEach {
            SpanText(
                text = it.toString(),
                modifier = textModifier.rotate(90.deg).margin(0.px).padding(0.px).lineHeight(13.px)
            )
        }
    }

}