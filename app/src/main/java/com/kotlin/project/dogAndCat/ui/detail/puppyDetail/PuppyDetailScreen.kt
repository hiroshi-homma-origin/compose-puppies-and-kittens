package com.kotlin.project.dogAndCat.ui.detail.puppyDetail

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
fun PuppyDetailScreen(id: Int, navController: NavController) {
    val viewModelFactory = PuppyDetailViewModel.Factory(id)
    val viewModel = viewModel(PuppyDetailViewModel::class.java, factory = viewModelFactory)
    val puppy = viewModel.puppy.collectAsState()

    Scaffold(
        topBar = {
            DetailTopBar(
                title = stringResource(R.string.puppyDetail),
                navController = navController
            )
        }
    ) {
        DetailContent(
            id = puppy.value.id.toString(),
            imgUrl = puppy.value.imgUrl,
            name = puppy.value.name,
            age = puppy.value.age,
            gender = puppy.value.gender,
            description = puppy.value.description
        )
    }
}