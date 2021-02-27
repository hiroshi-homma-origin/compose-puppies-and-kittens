package com.kotlin.project.dogAndCat.ui.list.puppies

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
import com.kotlin.project.dogAndCat.data.model.Puppy
import com.kotlin.project.dogAndCat.ui.common.ListCard
import com.kotlin.project.dogAndCat.ui.theme.Purple200

@ExperimentalFoundationApi
@Composable
fun PuppiesGridView(
    puppies: State<List<Puppy>>,
    navController: NavController
) {
    val spanCount = 3
    LazyVerticalGrid(
        cells = GridCells.Fixed(spanCount),
        modifier = Modifier.background(Purple200)
    ) {
        items(puppies.value.size) { index ->
            Column {
                if (index < spanCount) Spacer(modifier = Modifier.height(45.dp))
                ListCard(
                    route = "${stringResource(R.string.puppyDetail)}/${puppies.value[index].id}",
                    imgUrl = puppies.value[index].imgUrl,
                    name = puppies.value[index].name,
                    navController = navController
                )
            }
        }
    }
}