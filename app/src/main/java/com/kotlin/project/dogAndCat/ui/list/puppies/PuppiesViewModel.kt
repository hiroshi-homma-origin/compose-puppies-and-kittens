package com.kotlin.project.dogAndCat.ui.list.puppies

import android.app.Application
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.AndroidViewModel
import com.kotlin.project.dogAndCat.data.repository.FakePuppiesAndKittensRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class PuppiesViewModel @ViewModelInject constructor(
    application: Application
) : AndroidViewModel(application) {
    private val repository = FakePuppiesAndKittensRepository()
    private val _puppies = MutableStateFlow(repository.getPuppies())
    val puppies = _puppies.asStateFlow()
}
