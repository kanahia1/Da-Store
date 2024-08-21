package com.kanahia.dastore.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kanahia.dastore.db.FakerDB
import com.kanahia.dastore.models.Product
import com.kanahia.dastore.retrofit.FakerAPI
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI, private val fakerDB: FakerDB){

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products

    suspend fun getProducts(){
       val result = fakerAPI.getProducts()
        result.body()?.let { fakerDB.getDao().addProducts(it) }
        _products.postValue(result.body())
    }

}