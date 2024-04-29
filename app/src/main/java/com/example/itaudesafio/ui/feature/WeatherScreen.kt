package com.example.itaudesafio.ui.feature

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.itaudesafio.data.model.WeatherInfo
import com.example.itaudesafio.ui.theme.BlueSky
import com.example.itaudesafio.ui.theme.ItauDesafioTheme

@Composable
fun WeatherRoute(viewModel: WeatherViewModel = viewModel()) {
    val weatherInfo by viewModel.weatherInfoState.collectAsStateWithLifecycle()
    WeatherScreen(weatherInfo = weatherInfo.weatherInfo, viewModel = viewModel)
}


@SuppressLint("DiscouragedApi")
@Composable
fun WeatherScreen(
    context: Context = LocalContext.current,
    weatherInfo: WeatherInfo?,
    viewModel: WeatherViewModel
) {
    var showDialog by remember { mutableStateOf(false) }

    weatherInfo?.let {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = if (weatherInfo.isDay) {
                BlueSky
            } else Color.DarkGray
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = weatherInfo.locationName,
                    color = Color.White,
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = weatherInfo.dayOfWeek,
                    color = Color.White,
                    style = MaterialTheme.typography.bodyMedium
                )

                Spacer(modifier = Modifier.height(32.dp))

                val iconDrawableResId: Int = context.resources.getIdentifier(
                    "weather_${weatherInfo.conditionIcon}",
                    "drawable",
                    context.packageName
                )

                Image(
                    painter = painterResource(id = iconDrawableResId),
                    contentDescription = null,
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = weatherInfo.condition,
                    color = Color.White,
                    style = MaterialTheme.typography.bodySmall
                )

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = "${weatherInfo.temperature}°",
                    color = Color.White,
                    style = MaterialTheme.typography.displayLarge
                )

                Button(
                    onClick = {
                        viewModel.postWeatherInfo(weatherInfo)
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                    //enabled = !weatherInfo.isChanged,
                ) {
                    Text("Save the date", color = Color.White)
                }

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = if (weatherInfo.isChanged) "Was saved" else "",
                    color = Color.White,
                    style = MaterialTheme.typography.displayLarge
                )

                Button(
                    onClick = { showDialog = true },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                ) {
                    Text("Show Saved Weather", color = Color.White)
                }

                if (showDialog) {
                    WeatherInfoDialog(viewModel, onDismissRequest = { showDialog = false })
                }

            }
        }
    }
}

@Composable
fun WeatherInfoDialog(viewModel: WeatherViewModel, onDismissRequest: () -> Unit) {
    val dbWeatherState = viewModel.databaseweatherState.collectAsState().value

    AlertDialog(
        onDismissRequest = { onDismissRequest() },
        title = { Text("Saved Weather Information") },
        text = {
            Column {
                dbWeatherState.dbWeather.forEach { weather ->
                    if (weather != null) {
                        Column(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("${weather.currentDate} - ${weather.condition}")
                            Row(
                                horizontalArrangement = Arrangement.SpaceEvenly,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Button(
                                    onClick = { viewModel.putWeatherInfo(weather)
                                                onDismissRequest()
                                              },
                                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                                ) {
                                    Text("Up", color = Color.White)
                                }
                                Button(
                                    onClick = {
                                                viewModel.deleteSavedWeather(weather.currentDate)
                                                onDismissRequest()
                                              },
                                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
                                ) {
                                    Text("Del", color = Color.White)
                                }
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                        }
                    }
                }
            }
        },
        confirmButton = {
            Button(onClick = { onDismissRequest() }) {
                Text("Close")
            }
        }
    )
}

