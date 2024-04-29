package com.example.itaudesafio.data.repository;

import com.example.itaudesafio.data.model.WeatherInfo;
import com.example.itaudesafio.data.remote.RemoteDataSource;
import com.example.itaudesafio.data.remote.response.Weather;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/itaudesafio/data/repository/WeatherRepositoryImpl;", "Lcom/example/itaudesafio/data/repository/WeatherRepository;", "remoteDataSource", "Lcom/example/itaudesafio/data/remote/RemoteDataSource;", "(Lcom/example/itaudesafio/data/remote/RemoteDataSource;)V", "deleteSavedWeather", "", "currentDate", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedWeather", "", "Lcom/example/itaudesafio/data/model/WeatherInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherData", "lat", "", "lgn", "(FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postWeatherData", "weatherInfo", "(Lcom/example/itaudesafio/data/model/WeatherInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putWeatherData", "app_debug"})
public final class WeatherRepositoryImpl implements com.example.itaudesafio.data.repository.WeatherRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.itaudesafio.data.remote.RemoteDataSource remoteDataSource = null;
    
    @javax.inject.Inject
    public WeatherRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.remote.RemoteDataSource remoteDataSource) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getWeatherData(float lat, float lgn, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.itaudesafio.data.model.WeatherInfo> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object postWeatherData(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.model.WeatherInfo weatherInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.itaudesafio.data.model.WeatherInfo> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object putWeatherData(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.model.WeatherInfo weatherInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getSavedWeather(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.itaudesafio.data.model.WeatherInfo>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteSavedWeather(@org.jetbrains.annotations.NotNull
    java.lang.String currentDate, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}