package com.hd.trademate.data.maapper

import com.hd.trademate.data.local.CompanyListingEntity
import com.hd.trademate.data.remote.dto.CompanyInfoDto
import com.hd.trademate.domain.model.CompanyInfo
import com.hd.trademate.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing{
    return CompanyListing(
        name = name,
        symbol= symbol,
        exchange=exchange
    )
}
fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity{
    return CompanyListingEntity(
        name = name,
        symbol= symbol,
        exchange=exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo{
    return CompanyInfo(
        symbol = symbol?:"",
        description = description?:"",
        name = name ?:"",
        country= country?:"",
        industry = industry?:""
    )
}