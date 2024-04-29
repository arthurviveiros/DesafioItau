package com.example.itaudesafio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.itaudesafio.ui.feature.WeatherRoute
import com.example.itaudesafio.ui.theme.ItauDesafioTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ItauDesafioTheme {
                WeatherRoute()
            }
        }
    }
}