package com.example.itaudesafio.data.remote;

import com.example.itaudesafio.data.model.WeatherInfo;
import com.example.itaudesafio.data.remote.response.WeatherDataResponse;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/itaudesafio/data/remote/RemoteDataSource;", "", "deleteSavedWeather", "", "currentDate", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedWeather", "", "Lcom/example/itaudesafio/data/model/WeatherInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherDataResponse", "Lcom/example/itaudesafio/data/remote/response/WeatherDataResponse;", "lat", "", "lgn", "(FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postWeatherData", "weatherInfo", "(Lcom/example/itaudesafio/data/model/WeatherInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putWeatherData", "app_debug"})
public abstract interface RemoteDataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getWeatherDataResponse(float lat, float lgn, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.itaudesafio.data.remote.response.WeatherDataResponse> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object postWeatherData(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.model.WeatherInfo weatherInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getSavedWeather(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.itaudesafio.data.model.WeatherInfo>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteSavedWeather(@org.jetbrains.annotations.NotNull
    java.lang.String currentDate, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object putWeatherData(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.model.WeatherInfo weatherInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}