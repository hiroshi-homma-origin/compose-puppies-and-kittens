package com.kotlin.project.dogAndCat.ui.detail.puppyDetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kotlin.project.dogAndCat.data.repository.FakePuppiesAndKittensRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class PuppyDetailViewModel(id: Int) : ViewModel() {
    private val repository = FakePuppiesAndKittensRepository()
    private val _puppy = MutableStateFlow(repository.getPuppy(id))
    val puppy = _puppy.asStateFlow()

    class Factory(private val id: Int) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return PuppyDetailViewModel(id) as T
        }
    }
}
