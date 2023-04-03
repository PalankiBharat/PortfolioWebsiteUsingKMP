package com.bharat.kumar

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.init.registerBaseStyle

import org.jetbrains.compose.web.css.*

@InitSilk
fun updateTheme(ctx: InitSilkContext) {
    // Configure silk here
    ctx.stylesheet.registerBaseStyle("@font-face"){
        Modifier.fontFamily("poppins")
            .styleModifier {
                property("src","url(pop.ttf)")
            }
    }
    ctx.stylesheet.registerBaseStyle("@font-face"){
        Modifier.fontFamily("poppins")
            .styleModifier {
                property("src","url(pop.ttf)")
            }
    }
}

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}
