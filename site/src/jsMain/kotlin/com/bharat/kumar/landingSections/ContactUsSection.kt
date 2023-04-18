package com.bharat.kumar.landingSections

import androidx.compose.runtime.Composable
import com.bharat.kumar.themes.Color
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.RowScope
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.TextArea
import org.jetbrains.compose.web.dom.TextInput

@Composable
fun ContactUsSection() {
    Row(modifier = Modifier.fillMaxWidth(70.percent).padding(topBottom = 20.px)) {
        ContactDetails()
        ContactForm()
    }
}

@Composable
fun ContactDetails() {
        Column(modifier = Modifier.fillMaxWidth(40.percent)) {
            SpanText(text = "Contact Us", modifier = Modifier.fontSize(36.px).color(Colors.White))
            SpanText(text = "Let's make something new, different and more meaningful or make things more visual or conceptual?",
                     modifier = Modifier.fontSize(16.px).color(Colors.White).margin(top = 20.px))
            ContactInnerCard("Call me","+9735137314"){
                FaPhoneVolume(modifier = Modifier.color(Color.White.rgb))
            }
            ContactInnerCard("Email","bk9735732777@gmail.com"){
                FaEnvelope(modifier = Modifier.color(Color.White.rgb))
            }
            ContactInnerCard("Address","Salt Lake, Sector 5, Kolkata"){
                FaMapLocation(modifier = Modifier.color(Color.White.rgb))
            }
        }
}

@Composable
fun ContactInnerCard(heading:String, number:String, iconComposable : @Composable RowScope.() -> Unit) {
    Row(modifier = Modifier.margin(top = 20.px).fillMaxWidth()) {
        Box(modifier = Modifier.padding(10.px).borderRadius(100.percent).backgroundColor(Color.Secondary.rgb) ) {
            iconComposable()
        }
        Column(modifier = Modifier.margin(left = 20.px)) {
            SpanText(text = heading, modifier = Modifier.fontSize(14.px).color(Color.GreyTextColor.rgb))
            SpanText(text = number, modifier = Modifier.fontSize(18.px).color(Colors.White).margin(top = 4.px))
        }
    }
}

@Composable
fun ContactForm() {
    Column {
        SpanText(text = "Drop A Line", modifier = Modifier.fontSize(36.px).color(Colors.White))
        Row (modifier = Modifier.fillMaxWidth()){
            Input(
                InputType.Text,
                attrs = {
                    onInput {  }
                }
            )
        }
    }
}