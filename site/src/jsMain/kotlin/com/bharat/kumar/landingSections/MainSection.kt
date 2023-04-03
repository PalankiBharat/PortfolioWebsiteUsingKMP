package com.bharat.kumar.landingSections

import androidx.compose.runtime.Composable
import com.bharat.kumar.themes.Colors
import com.bharat.kumar.utils.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px

@Composable
fun MainSection() {
    Column (
        modifier = Modifier.fillMaxSize().backgroundColor(Colors.Primary.rgb),
    ){
        HeaderSection()
        AboutMeSection()
    }

}