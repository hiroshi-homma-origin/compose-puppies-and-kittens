package com.kotlin.project.dogAndCat.ui.list.kittens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kotlin.project.dogAndCat.R
import com.kotlin.project.dogAndCat.data.model.Kitten
import com.kotlin.project.dogAndCat.ui.common.ListCard
import com.kotlin.project.dogAndCat.ui.theme.Purple200

@ExperimentalFoundationApi
@Composable
fun KittensGridView(
    kittens: State<List<Kitten>>,
    navController: NavController
) {
    val spanCount = 3
    LazyVerticalGrid(
        cells = GridCells.Fixed(spanCount),
        modifier = Modifier.background(Purple200)
    ) {
        items(kittens.value.size) { index ->
            Column {
                if (index < spanCount) Spacer(modifier = Modifier.height(45.dp))
                ListCard(
                    route = "${stringResource(R.string.kittenDetail)}/${kittens.value[index].id}",
                    imgUrl = kittens.value[index].imgUrl,
                    name = kittens.value[index].name,
                    navController = navController
                )
            }
        }
    }
}