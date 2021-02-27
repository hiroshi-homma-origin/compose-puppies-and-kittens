package com.kotlin.project.dogAndCat.ui.list.kittens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.kotlin.project.dogAndCat.R
import com.kotlin.project.dogAndCat.ui.common.ListSelectTab
import com.kotlin.project.dogAndCat.ui.common.ListTopBar

@ExperimentalFoundationApi
@Composable
fun KittensScreen(navController: NavController) {
    val viewModel: KittensViewModel = viewModel()
    val kittens = viewModel.kittens.collectAsState()
    Scaffold(
        topBar = { ListTopBar(stringResource(R.string.kittens)) }
    ) {
        KittensGridView(kittens, navController)
        ListSelectTab(navController)
    }
}