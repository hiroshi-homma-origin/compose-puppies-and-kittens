package com.kotlin.project.dogAndCat.ui.list.kittens

import android.app.Application
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.kotlin.project.dogAndCat.data.repository.FakePuppiesAndKittensRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class KittensViewModel @ViewModelInject constructor(
    application: Application
) : AndroidViewModel(application) {
    private val repository = FakePuppiesAndKittensRepository()
    private val _kittens = MutableStateFlow(repository.getKittens())
    val kittens = _kittens.asStateFlow()
}
