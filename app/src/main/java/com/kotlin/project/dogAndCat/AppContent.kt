package com.kotlin.project.dogAndCat

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.kotlin.project.dogAndCat.ui.detail.kittenDetail.KittenDetailScreen
import com.kotlin.project.dogAndCat.ui.detail.puppyDetail.PuppyDetailScreen
import com.kotlin.project.dogAndCat.ui.list.kittens.KittensScreen
import com.kotlin.project.dogAndCat.ui.list.puppies.PuppiesScreen
import com.kotlin.project.dogAndCat.ui.theme.DogAndCatTheme
import timber.log.Timber

@SuppressLint("RestrictedApi")
@ExperimentalFoundationApi
@Composable
fun AppContents() {
    val navController = rememberNavController()
    val puttiesName = stringResource(R.string.puppies)
    val kittensName = stringResource(R.string.kittens)
    val puppyDetailName = stringResource(R.string.puppyDetailRoute)
    val kittenDetailName = stringResource(R.string.kittenDetailRoute)

    DogAndCatTheme {
        NavHost(navController, startDestination = puttiesName) {
            composable(puttiesName) {
                Timber.d("current_s1:${navController.currentDestination?.displayName}")
                PuppiesScreen(navController)
            }
            composable(kittensName) {
                KittensScreen(navController)
            }
            composable(
                puppyDetailName,
                arguments = listOf(
                    navArgument("id") { type = NavType.IntType }
                )
            ) { backStackEntry ->
                val id = backStackEntry.arguments!!.getInt("id")
                PuppyDetailScreen(id, navController)
            }
            composable(
                kittenDetailName,
                arguments = listOf(
                    navArgument("id") { type = NavType.IntType }
                )
            ) { backStackEntry ->
                val id = backStackEntry.arguments!!.getInt("id")
                KittenDetailScreen(id, navController)
            }
        }
    }
}