package com.example.etsturclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.etsturclone.ui.screens.main.MainScreen
import com.example.etsturclone.ui.theme.EtsTurCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EtsTurCloneTheme {
                MainScreen()
            }
        }
    }
}

