package com.bharat.kumar.pages

import androidx.compose.runtime.*
import com.bharat.kumar.landingSections.MainSection
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.scrollBehavior
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns

@Page
@Composable
fun HomePage() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //MainSection()
       DataPage()
    }
}

@Composable
fun DataPage()
{
    Column (
        modifier = Modifier.fillMaxWidth().scrollBehavior(ScrollBehavior.Smooth)
    ){
            SimpleGrid(numColumns = numColumns(base = 2)){
                dataList.forEach {
                    Image(src = it.image)
                }
            }
    }
}

data class Data(
    val image:String,
    val title:String,
    val subHeading:String,
    val desc:String
)

val dataList = arrayListOf(
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=1aTL4B8Xef5hLK22Ql72cCO9HVrlNt140",
        subHeading = "",
        desc = ""
    ),
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=1kXmFdJkQZHqDMWCOAOMhxbDy0CCnJR_l",
        subHeading = "",
        desc = ""
    ),
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=1kXmFdJkQZHqDMWCOAOMhxbDy0CCnJR_l",
        subHeading = "",
        desc = ""
    ),
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=1kXmFdJkQZHqDMWCOAOMhxbDy0CCnJR_l",
        subHeading = "",
        desc = ""
    ),

    )
