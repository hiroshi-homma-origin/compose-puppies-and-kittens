package com.kotlin.project.dogAndCat.ui.common

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun ListTopBar(screenName: String) {
    TopAppBar(
        title = { Text(screenName) }
    )
}