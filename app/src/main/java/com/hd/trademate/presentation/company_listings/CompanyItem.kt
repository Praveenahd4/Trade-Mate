package com.hd.trademate.presentation.company_listings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hd.trademate.domain.model.CompanyListing

@Composable
fun CompanyItem(
    company: CompanyListing,
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ){
        Column(
            modifier =Modifier.weight(1f)
        ) {
            Row (modifier = Modifier.fillMaxWidth()){
                Text(
                    text = company.name,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    modifier = Modifier.weight(1f)
                    )
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = company.exchange,
                    fontWeight = FontWeight.Light
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "(${company.symbol})",
                fontStyle = FontStyle.Italic
            )

        }
        
    }
}