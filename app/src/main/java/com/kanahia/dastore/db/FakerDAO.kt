package com.kanahia.dastore.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kanahia.dastore.models.Product

@Dao
interface FakerDAO {

    @Insert
    suspend fun addProducts(products: List<Product>)

    @Query("SELECT * FROM product")
    suspend fun getProducts() : List<Product>
}