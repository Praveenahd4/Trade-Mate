package com.hd.trademate.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface StockDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCompanyListings( companyListingEntity: List<CompanyListingEntity>)

    @Query("DELETE FROM companylistingentity")
    suspend fun clearCompanyListing()

    @Query("""
        SELECT *
        FROM companylistingentity
        WHERE LOWER(name) LIKE '%' || LOWER(:query)||'%' OR
        UPPER(:query) ==symbol
    """)
    suspend fun searchCompanyListing(query:String): List<CompanyListingEntity>
}