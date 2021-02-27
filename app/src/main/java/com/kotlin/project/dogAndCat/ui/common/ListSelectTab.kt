package com.kotlin.project.dogAndCat.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.kotlin.project.dogAndCat.R
import com.kotlin.project.dogAndCat.ui.theme.Purple500

@Composable
fun ListSelectTab(navController: NavController) {
    val puttiesName = stringResource(R.string.puppies)
    val kittensName = stringResource(R.string.kittens)
    Row(
        modifier = Modifier.fillMaxWidth()
            .height(46.dp)
            .padding(4.dp, 2.dp, 4.dp, 2.dp)
            .background(Purple500, shape = RoundedCornerShape(8.dp)),
        horizontalArrangement = Arrangement.Center
    ) {
        TextButton(
            onClick = {
                navController.navigateUp()
            },
            modifier = Modifier
                .padding(4.dp)
                .background(Color.White, shape = RoundedCornerShape(8.dp))
        ) {
            Text(puttiesName, textAlign = TextAlign.Center)
        }
        TextButton(
            onClick = {
                navController.navigate(kittensName)
            },
            modifier = Modifier
                .padding(4.dp)
                .background(Color.White, shape = RoundedCornerShape(8.dp))
        ) {
            Text(kittensName, textAlign = TextAlign.Center)
        }
    }
}