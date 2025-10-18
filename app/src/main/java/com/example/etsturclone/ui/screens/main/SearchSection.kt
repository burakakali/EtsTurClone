package com.example.etsturclone.ui.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bed
import androidx.compose.material.icons.filled.Man
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.Villa
import androidx.compose.material.icons.outlined.LocalOffer
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.etsturclone.R
import com.example.etsturclone.ui.components.SearchFieldCard
import com.example.etsturclone.ui.theme.Black
import com.example.etsturclone.ui.theme.TextGray
import com.example.etsturclone.ui.theme.VeryLightBlue


@Composable
fun TopCategorySelector() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        SelectableCategoryItem(rememberVectorPainter(image = Icons.Default.Bed), "Otel", false)
        SelectableCategoryItem(rememberVectorPainter(image = Icons.Default.Public), "Tur", false)
        SelectableCategoryItem(painterResource(id = R.drawable.plane), "Uçak", false)
        SelectableCategoryItem(rememberVectorPainter(image = Icons.Default.Villa), "Villa", false)
    }
}

@Composable
fun SearchSection() {
    Column(modifier = Modifier.padding(top = 16.dp)) {

        SearchFieldCard {
            Surface(
                shape = RoundedCornerShape(10.dp),
                color = VeryLightBlue,
                modifier = Modifier.size(32.dp)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Icon(
                        Icons.Outlined.LocalOffer,
                        "Gidilecek Yer",
                        tint = Black,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                "Adam & Eve +16, İskele Mevkii, Belek",
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
            )
        }
        SearchFieldCard {
            Text(
                text = "Giriş Tarihi",
                color = Black,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Start,
                fontSize = 14.sp
            )
            Divider(
                color = Color.LightGray.copy(alpha = 0.5f),
                modifier = Modifier.height(48.dp).width(1.dp)
            )
            Text(
                text = "Çıkış Tarihi",
                color = Black,
                modifier = Modifier.weight(1f).padding(start = 8.dp),
                textAlign = TextAlign.Start,
                fontSize = 14.sp
            )
        }
        SearchFieldCard {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = VeryLightBlue
                ) {
                    Text(
                        "2 Misafir",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Default.Man, "Misafir", tint = TextGray)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("2 Yetişkin", fontSize = 16.sp, fontWeight = FontWeight.Medium)
                }
            }
        }
    }
}

@Composable
fun SearchButtonAndInfo() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, bottom = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { /* İşlev yok */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
        ) {
            Text("Otel Ara", modifier = Modifier.padding(vertical = 10.dp), fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Ets Ersoy Turizm Seyahat Acentası Belge No: 2242", fontSize = 12.sp, color = TextGray)
    }
}



@Composable
private fun RowScope.SelectableCategoryItem(painter: Painter, text: String, isSelected: Boolean) {
    val iconColor = MaterialTheme.colorScheme.primary
    val fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal

    Surface(
        modifier = Modifier
            .weight(1f)
            .padding(horizontal = 4.dp),
        shape = RoundedCornerShape(12.dp),
        color = Color.White,
        shadowElevation = 2.dp
    ) {
        Row(
            modifier = Modifier.padding(vertical = 12.dp, horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter,
                text,
                colorFilter = ColorFilter.tint(iconColor),
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text,
                color = Black,
                fontWeight = fontWeight,
                fontSize = 14.sp
            )
        }
    }
}