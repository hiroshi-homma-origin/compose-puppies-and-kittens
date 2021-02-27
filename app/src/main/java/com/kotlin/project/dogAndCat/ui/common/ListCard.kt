package com.kotlin.project.dogAndCat.ui.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun ListCard(
    route: String,
    imgUrl: String,
    name: String,
    navController: NavController
) {
    Card(
        modifier = Modifier
            .clickable { navController.navigate(route) }
            .padding(4.dp)
            .height(150.dp)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            GlideImage(
                data = imgUrl,
                contentDescription = null
            )
            Text(
                name,
                textAlign = TextAlign.Center
            )
        }
    }
}