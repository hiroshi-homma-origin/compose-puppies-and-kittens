package com.kotlin.project.dogAndCat.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.navigate
import com.kotlin.project.dogAndCat.R
import com.kotlin.project.dogAndCat.ui.theme.Purple200
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun DetailContent(
    id: String,
    imgUrl: String,
    name: String,
    age: String,
    gender: String,
    description: String
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple200)
    ) {
        Column {
            GlideImage(
                data = imgUrl,
                contentDescription = null
            )
            Text(
                id,
                textAlign = TextAlign.Center
            )
            Text(
                name,
                textAlign = TextAlign.Center
            )
            Text(
                gender,
                textAlign = TextAlign.Center
            )
            Text(
                age,
                textAlign = TextAlign.Center
            )
            Text(
                description,
                textAlign = TextAlign.Center
            )
            TextButton(
                onClick = {},
                modifier = Modifier
                    .padding(4.dp)
                    .background(Color.White, shape = RoundedCornerShape(8.dp))
            ) {
                Text(stringResource(R.string.adapt), textAlign = TextAlign.Center)
            }
        }
    }
}