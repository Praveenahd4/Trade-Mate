package com.hd.trademate.domain.repository

import com.hd.trademate.domain.model.CompanyInfo
import com.hd.trademate.domain.model.CompanyListing
import com.hd.trademate.domain.model.IntradayInfo
import com.hd.trademate.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListing(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol:String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>

}