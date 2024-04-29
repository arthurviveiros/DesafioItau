package com.example.itaudesafio.ui.feature

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.itaudesafio.data.model.WeatherInfo
import com.example.itaudesafio.data.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val weatherRepository: WeatherRepository
) : ViewModel() {

    private val _weatherInfoState = MutableStateFlow(WeatherInfoState())
    val weatherInfoState: StateFlow<WeatherInfoState> = _weatherInfoState.asStateFlow()

    private val _databaseweatherState = MutableStateFlow(DBWeatherState())
    val databaseweatherState: StateFlow<DBWeatherState> = _databaseweatherState.asStateFlow()

    init {
        getWeatherInfo();
        getSavedWeather()
    }

    private fun getWeatherInfo() {
        viewModelScope.launch {
            val weatherInfo = weatherRepository.getWeatherData(-23.5489f, -46.6388f)
            _weatherInfoState.update {
                it.copy(weatherInfo = weatherInfo)
            }
        }
    }

    fun postWeatherInfo(weatherInfo: WeatherInfo) {
        viewModelScope.launch {
            weatherInfo.currentDate = LocalDate.now().toString()
            weatherRepository.postWeatherData(weatherInfo = weatherInfo)
            println("Checking if there was any changes in the climate")
            val weatherInfo = weatherRepository.getWeatherData(-23.5489f, -46.6388f)
            weatherInfo.isChanged = true;
            _weatherInfoState.update {
                it.copy(weatherInfo = weatherInfo)
            }

            getSavedWeather()


        }
    }

    fun putWeatherInfo(weatherInfo: WeatherInfo) {
        viewModelScope.launch {
            weatherInfo.currentDate = LocalDate.now().toString()
            weatherInfo.condition = "Thunderstorms"
            weatherRepository.putWeatherData(weatherInfo = weatherInfo)
            getSavedWeather()
        }
    }

    fun getSavedWeather() {
        viewModelScope.launch {
            val dbWeather = weatherRepository.getSavedWeather()
            _databaseweatherState.update {
                it.copy(dbWeather = dbWeather)
            }
        }
    }

    fun deleteSavedWeather(currentDate: String) {
        viewModelScope.launch {
            weatherRepository.deleteSavedWeather(currentDate)

            getSavedWeather()
        }
    }

}