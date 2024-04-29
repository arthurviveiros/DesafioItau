package com.example.itaudesafio.data.repository

import com.example.itaudesafio.data.model.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Float, lgn: Float): WeatherInfo
    suspend fun postWeatherData(weatherInfo: WeatherInfo): WeatherInfo
    suspend fun getSavedWeather(): List<WeatherInfo>
    suspend fun deleteSavedWeather(currentDate: String)
    suspend fun putWeatherData(weatherInfo: WeatherInfo)

}