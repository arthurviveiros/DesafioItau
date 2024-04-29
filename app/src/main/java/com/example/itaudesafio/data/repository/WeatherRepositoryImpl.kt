package com.example.itaudesafio.data.repository

import com.example.itaudesafio.data.model.WeatherInfo
import com.example.itaudesafio.data.remote.RemoteDataSource
import com.example.itaudesafio.data.remote.response.Weather
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Locale
import javax.inject.Inject
import kotlin.math.roundToInt

class WeatherRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : WeatherRepository {
    override suspend fun getWeatherData(lat: Float, lgn: Float): WeatherInfo {
        val response = remoteDataSource.getWeatherDataResponse(lat, lgn)
        val weather = response.weather[0]

        return WeatherInfo(
            locationName = response.name,
            conditionIcon = weather.icon,
            condition = weather.main,
            temperature = response.main.temp.roundToInt(),
            dayOfWeek = LocalDate.now().dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()),
            isDay = weather.icon.last() == 'd',
            isChanged = false,
            currentDate = LocalDate.now().toString()
        )
    }

    override suspend fun postWeatherData(weatherInfo: WeatherInfo): WeatherInfo {
        remoteDataSource.postWeatherData(weatherInfo)

        return(weatherInfo)
    }

    override suspend fun putWeatherData(weatherInfo: WeatherInfo) {
        remoteDataSource.putWeatherData(weatherInfo)
    }

    override suspend fun getSavedWeather(): List<WeatherInfo> {
        var response = remoteDataSource.getSavedWeather()
        return(response)
    }

    override suspend fun deleteSavedWeather(currentDate: String) {
        remoteDataSource.deleteSavedWeather(currentDate)
    }

}