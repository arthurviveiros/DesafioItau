package com.example.itaudesafio.ui.feature

import com.example.itaudesafio.data.model.WeatherInfo

data class WeatherInfoState(
    val weatherInfo: WeatherInfo? = null
)

data class DBWeatherState(
    val dbWeather: List<WeatherInfo?> = listOf()
)
