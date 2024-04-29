package com.example.itaudesafio.ui.feature;

import androidx.lifecycle.ViewModel;
import com.example.itaudesafio.data.model.WeatherInfo;
import com.example.itaudesafio.data.repository.WeatherRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import java.time.LocalDate;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/itaudesafio/ui/feature/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "weatherRepository", "Lcom/example/itaudesafio/data/repository/WeatherRepository;", "(Lcom/example/itaudesafio/data/repository/WeatherRepository;)V", "_databaseweatherState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/itaudesafio/ui/feature/DBWeatherState;", "_weatherInfoState", "Lcom/example/itaudesafio/ui/feature/WeatherInfoState;", "databaseweatherState", "Lkotlinx/coroutines/flow/StateFlow;", "getDatabaseweatherState", "()Lkotlinx/coroutines/flow/StateFlow;", "weatherInfoState", "getWeatherInfoState", "deleteSavedWeather", "", "currentDate", "", "getSavedWeather", "getWeatherInfo", "postWeatherInfo", "weatherInfo", "Lcom/example/itaudesafio/data/model/WeatherInfo;", "putWeatherInfo", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.itaudesafio.data.repository.WeatherRepository weatherRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.itaudesafio.ui.feature.WeatherInfoState> _weatherInfoState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.itaudesafio.ui.feature.WeatherInfoState> weatherInfoState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.itaudesafio.ui.feature.DBWeatherState> _databaseweatherState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.itaudesafio.ui.feature.DBWeatherState> databaseweatherState = null;
    
    @javax.inject.Inject
    public WeatherViewModel(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.repository.WeatherRepository weatherRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.itaudesafio.ui.feature.WeatherInfoState> getWeatherInfoState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.itaudesafio.ui.feature.DBWeatherState> getDatabaseweatherState() {
        return null;
    }
    
    private final void getWeatherInfo() {
    }
    
    public final void postWeatherInfo(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.model.WeatherInfo weatherInfo) {
    }
    
    public final void putWeatherInfo(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.model.WeatherInfo weatherInfo) {
    }
    
    public final void getSavedWeather() {
    }
    
    public final void deleteSavedWeather(@org.jetbrains.annotations.NotNull
    java.lang.String currentDate) {
    }
}