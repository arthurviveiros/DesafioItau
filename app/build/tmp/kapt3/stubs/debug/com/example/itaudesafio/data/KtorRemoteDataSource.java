package com.example.itaudesafio.data;

import com.example.itaudesafio.data.model.WeatherInfo;
import com.example.itaudesafio.data.remote.RemoteDataSource;
import com.example.itaudesafio.data.remote.response.WeatherDataResponse;
import io.ktor.http.ContentType;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/itaudesafio/data/KtorRemoteDataSource;", "Lcom/example/itaudesafio/data/remote/RemoteDataSource;", "httpClient", "Lio/ktor/client/HttpClient;", "(Lio/ktor/client/HttpClient;)V", "deleteSavedWeather", "", "currentDate", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedWeather", "", "Lcom/example/itaudesafio/data/model/WeatherInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherDataResponse", "Lcom/example/itaudesafio/data/remote/response/WeatherDataResponse;", "lat", "", "lng", "(FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postWeatherData", "weatherInfo", "(Lcom/example/itaudesafio/data/model/WeatherInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putWeatherData", "Companion", "app_debug"})
public final class KtorRemoteDataSource implements com.example.itaudesafio.data.remote.RemoteDataSource {
    @org.jetbrains.annotations.NotNull
    private final io.ktor.client.HttpClient httpClient = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BASE_URL = "https://api.openweathermap.org/data/2.5";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String LAMBDA_URL = "https://omm2ywd177.execute-api.us-east-1.amazonaws.com/prod";
    @org.jetbrains.annotations.NotNull
    public static final com.example.itaudesafio.data.KtorRemoteDataSource.Companion Companion = null;
    
    @javax.inject.Inject
    public KtorRemoteDataSource(@org.jetbrains.annotations.NotNull
    io.ktor.client.HttpClient httpClient) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getWeatherDataResponse(float lat, float lng, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.itaudesafio.data.remote.response.WeatherDataResponse> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object postWeatherData(@org.jetbrains.annotations.NotNull
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
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object putWeatherData(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.model.WeatherInfo weatherInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/itaudesafio/data/KtorRemoteDataSource$Companion;", "", "()V", "BASE_URL", "", "LAMBDA_URL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}