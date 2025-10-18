package com.example.etsturclone.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CampaignItemNew(text: String, @DrawableRes imageResId: Int, borderColor: Brush) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(horizontal = 8.dp)
            .width(120.dp)
    ) {
        Box(
            modifier = Modifier
                .size(90.dp)
                .border(3.dp, borderColor, CircleShape)
                .padding(6.dp)
                .clip(CircleShape)
        ) {
            Image(painterResource(id = imageResId), text, contentScale = ContentScale.Crop)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text, fontSize = 14.sp, textAlign = TextAlign.Center, lineHeight = 18.sp)
    }
}