package com.kanahia.dastore.retrofit

import com.kanahia.dastore.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("products")
    suspend fun getProducts() : Response<List<Product>>

}