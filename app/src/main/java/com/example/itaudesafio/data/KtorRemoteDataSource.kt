package com.example.itaudesafio.data

import com.example.itaudesafio.data.model.WeatherInfo
import com.example.itaudesafio.data.remote.RemoteDataSource
import com.example.itaudesafio.data.remote.response.WeatherDataResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.delete
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.put
import io.ktor.client.request.setBody
import io.ktor.client.request.url
import io.ktor.client.utils.EmptyContent.headers
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.headers
import javax.inject.Inject

class KtorRemoteDataSource @Inject constructor(
    private val httpClient: HttpClient
) : RemoteDataSource {

    companion object {
        private const val BASE_URL = "https://api.openweathermap.org/data/2.5"
        private const val LAMBDA_URL = "https://omm2ywd177.execute-api.us-east-1.amazonaws.com/prod"
    }

    override suspend fun getWeatherDataResponse(lat: Float, lng: Float): WeatherDataResponse {
        return httpClient
            .get("${BASE_URL}/weather?lat=$lat&lon=$lng&appid=b51198ec4270f9c950cefeaaffc27149&units=metric")
            .body()
    }

    override suspend fun postWeatherData(weatherInfo: WeatherInfo) {
        try {
            httpClient.post {
                url(LAMBDA_URL)
                contentType(ContentType.Application.Json)
                setBody(weatherInfo)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override suspend fun getSavedWeather(): List<WeatherInfo> {
        var response = httpClient
            .get("https://omm2ywd177.execute-api.us-east-1.amazonaws.com/prod/")
        return response.body<List<WeatherInfo>>()
    }

    override suspend fun deleteSavedWeather(currentDate: String) {
        try {
            println("Attempting to delete weather data for date: $currentDate")
            val formattedDate = currentDate.replace("-", "")
            httpClient.delete {
                url("${LAMBDA_URL}?currentDate=$currentDate")
                headers {
                    append("Content-Type", "application/json")
                    append("currentDate", formattedDate)
                }
                setBody("\"$currentDate\"")
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override suspend fun putWeatherData(weatherInfo: WeatherInfo) {
        try {
            httpClient.put {
                url(LAMBDA_URL)
                contentType(ContentType.Application.Json)
                setBody(weatherInfo)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


}