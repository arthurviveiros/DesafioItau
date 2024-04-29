package com.example.itaudesafio.data.di;

import com.example.itaudesafio.data.repository.WeatherRepository;
import com.example.itaudesafio.data.repository.WeatherRepositoryImpl;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/example/itaudesafio/data/di/RepositoryModule;", "", "bindWeatherRepository", "Lcom/example/itaudesafio/data/repository/WeatherRepository;", "repository", "Lcom/example/itaudesafio/data/repository/WeatherRepositoryImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
public abstract interface RepositoryModule {
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.example.itaudesafio.data.repository.WeatherRepository bindWeatherRepository(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.repository.WeatherRepositoryImpl repository);
}