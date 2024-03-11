package com.hd.trademate.presentation.company_info

import com.hd.trademate.domain.model.CompanyInfo
import com.hd.trademate.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
