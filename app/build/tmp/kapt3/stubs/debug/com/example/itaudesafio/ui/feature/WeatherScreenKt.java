package com.example.itaudesafio.ui.feature;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.navigation.NavController;
import com.example.itaudesafio.data.model.WeatherInfo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u0012\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a$\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u00a8\u0006\f"}, d2 = {"WeatherInfoDialog", "", "viewModel", "Lcom/example/itaudesafio/ui/feature/WeatherViewModel;", "onDismissRequest", "Lkotlin/Function0;", "WeatherRoute", "WeatherScreen", "context", "Landroid/content/Context;", "weatherInfo", "Lcom/example/itaudesafio/data/model/WeatherInfo;", "app_debug"})
public final class WeatherScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void WeatherRoute(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.ui.feature.WeatherViewModel viewModel) {
    }
    
    @android.annotation.SuppressLint(value = {"DiscouragedApi"})
    @androidx.compose.runtime.Composable
    public static final void WeatherScreen(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    com.example.itaudesafio.data.model.WeatherInfo weatherInfo, @org.jetbrains.annotations.NotNull
    com.example.itaudesafio.ui.feature.WeatherViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void WeatherInfoDialog(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.ui.feature.WeatherViewModel viewModel, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest) {
    }
}