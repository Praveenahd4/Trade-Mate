package com.hd.trademate.presentation.company_listings

import com.hd.trademate.domain.model.CompanyListing

data class CompanyListingState(
    val companies: List<CompanyListing> = emptyList(),
    val isLoading: Boolean =false,
    val isRefreshing: Boolean = false,
    val searchQuery: String ="",
    val error: String=""
)
