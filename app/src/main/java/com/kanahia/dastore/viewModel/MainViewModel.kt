package com.kanahia.dastore.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kanahia.dastore.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: ProductRepository) : ViewModel() {

    val productLiveData
        get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }

}