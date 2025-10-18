package com.example.etsturclone.ui.screens.main

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.etsturclone.R
import com.example.etsturclone.ui.components.CampaignItemNew

@Composable
fun CampaignsSectionNew() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
        color = Color.White
    ) {
        Column(modifier = Modifier.padding(vertical = 16.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Kampanyalar", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text("Tümü ->", color = MaterialTheme.colorScheme.primary, fontSize = 14.sp, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(16.dp))
            LazyRow(contentPadding = PaddingValues(horizontal = 8.dp)) {
                item { CampaignItemNew("2026 Erken Rezervasyon Başladı!", R.drawable.campaign_image_1, Brush.horizontalGradient(listOf(Color(0xFFF9C823), Color(0xFFFC7745)))) }
                item { CampaignItemNew("Son Yaz Fırsatlarıyla Tatilinizi Planlayın...", R.drawable.campaign_image_2, Brush.horizontalGradient(listOf(Color(0xFF1EAE98), Color(0xFF6EDDB2)))) }
                item { CampaignItemNew("Son Dakika Tatil Fırsatları", R.drawable.campaign_image_3, Brush.horizontalGradient(listOf(Color(0xFFF4A261), Color(0xFFE76F51)))) }
            }
        }
    }
}