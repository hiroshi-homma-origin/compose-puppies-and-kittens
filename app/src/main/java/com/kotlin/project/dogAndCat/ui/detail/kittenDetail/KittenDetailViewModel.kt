package com.kotlin.project.dogAndCat.ui.detail.kittenDetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kotlin.project.dogAndCat.data.repository.FakePuppiesAndKittensRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class KittenDetailViewModel(id: Int) : ViewModel() {
    private val repository = FakePuppiesAndKittensRepository()

    private val _kitten = MutableStateFlow(repository.getKitten(id))
    val kitten = _kitten.asStateFlow()

    class Factory(private val id: Int) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return KittenDetailViewModel(id) as T
        }
    }
}
