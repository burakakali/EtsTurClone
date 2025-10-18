package com.example.etsturclone.ui.screens.main

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.etsturclone.ui.theme.AppBackground
import com.example.etsturclone.ui.theme.LightBlueBackground
import com.example.etsturclone.ui.theme.StatusBarGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    // Status bar rengini ayarlayan kod
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = StatusBarGray.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = true
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = { HomeTopBar() }, // Ayrılmış bileşeni çağır
            containerColor = MaterialTheme.colorScheme.background
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(LightBlueBackground, AppBackground)
                        )
                    )
            ) {
                // Ekranın içeriğini oluşturan ayrılmış bileşenleri çağır
                TopCategorySelector()
                SearchSection()
                SearchButtonAndInfo()
                CampaignsSectionNew()

                Spacer(modifier = Modifier.height(100.dp)) // Alt boşluk
            }
        }

        // Kayan alt barı çağır
        FloatingBottomBar(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(WindowInsets.navigationBars.asPaddingValues())
                .padding(horizontal = 24.dp, vertical = 12.dp)
        )
    }
}