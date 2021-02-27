package com.kotlin.project.dogAndCat.ui.detail.kittenDetail

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.kotlin.project.dogAndCat.R
import com.kotlin.project.dogAndCat.ui.common.DetailContent
import com.kotlin.project.dogAndCat.ui.common.DetailTopBar

@Composable
fun KittenDetailScreen(id: Int, navController: NavController) {
    val viewModelFactory = KittenDetailViewModel.Factory(id)
    val viewModel = viewModel(KittenDetailViewModel::class.java, factory = viewModelFactory)
    val kitten = viewModel.kitten.collectAsState()

    Scaffold(
        topBar = {
            DetailTopBar(
                title = stringResource(R.string.kittenDetail),
                navController = navController
            )
        }
    ) {
        DetailContent(
            id = kitten.value.id.toString(),
            imgUrl = kitten.value.imgUrl,
            name = kitten.value.name,
            age = kitten.value.age,
            gender = kitten.value.gender,
            description = kitten.value.description
        )
    }
}