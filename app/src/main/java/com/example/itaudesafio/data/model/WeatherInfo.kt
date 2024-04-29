package com.example.itaudesafio.data.model

import kotlinx.serialization.Serializable

@Serializable
data class WeatherInfo(
    val locationName: String,
    val conditionIcon: String,
    var condition: String,
    val temperature: Int,
    val dayOfWeek: String,
    val isDay: Boolean,
    var isChanged: Boolean,
    var currentDate: String
)