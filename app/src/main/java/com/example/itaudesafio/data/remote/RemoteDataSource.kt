package com.example.itaudesafio.data.remote

import com.example.itaudesafio.data.model.WeatherInfo
import com.example.itaudesafio.data.remote.response.WeatherDataResponse

interface RemoteDataSource {

    suspend fun getWeatherDataResponse(lat: Float, lgn: Float): WeatherDataResponse

    suspend fun postWeatherData(weatherInfo: WeatherInfo)

    suspend fun getSavedWeather(): List<WeatherInfo>

    suspend fun deleteSavedWeather(currentDate: String)

    suspend fun putWeatherData(weatherInfo: WeatherInfo)


}