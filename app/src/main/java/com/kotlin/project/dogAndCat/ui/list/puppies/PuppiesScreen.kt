package com.kotlin.project.dogAndCat.ui.list.puppies

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
fun PuppiesScreen(navController: NavController) {
    val viewModel: PuppiesViewModel = viewModel()
    val puppies = viewModel.puppies.collectAsState()
    Scaffold(
        topBar = { ListTopBar(stringResource(R.string.puppies)) }
    ) {
        PuppiesGridView(puppies, navController)
        ListSelectTab(navController)
    }
}