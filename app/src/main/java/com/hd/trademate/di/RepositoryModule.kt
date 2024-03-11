package com.hd.trademate.di

import com.hd.trademate.data.csv.CSVParser
import com.hd.trademate.data.csv.CompanyListingParser
import com.hd.trademate.data.csv.IntradayInfoParser
import com.hd.trademate.data.repository.StockRepositoryImpl
import com.hd.trademate.domain.model.CompanyListing
import com.hd.trademate.domain.model.IntradayInfo
import com.hd.trademate.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingParser(
        companyListingParser: CompanyListingParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindsStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}