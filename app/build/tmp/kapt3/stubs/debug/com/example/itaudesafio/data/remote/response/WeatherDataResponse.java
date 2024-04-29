package com.example.itaudesafio.data.remote.response;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002STB\u00a1\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0002\u0010\u001eB\u0083\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001fJ\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0015H\u00c6\u0003J\t\u0010<\u001a\u00020\nH\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010?\u001a\u00020\nH\u00c6\u0003J\t\u0010@\u001a\u00020\fH\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010D\u001a\u00020\u0013H\u00c6\u0003J\t\u0010E\u001a\u00020\u0015H\u00c6\u0003J\u009f\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010J\u001a\u00020\u0003H\u00d6\u0001J\t\u0010K\u001a\u00020\nH\u00d6\u0001J!\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u00c7\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0019\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u001a\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107\u00a8\u0006U"}, d2 = {"Lcom/example/itaudesafio/data/remote/response/WeatherDataResponse;", "", "seen1", "", "coord", "Lcom/example/itaudesafio/data/remote/response/Coord;", "weather", "", "Lcom/example/itaudesafio/data/remote/response/Weather;", "base", "", "main", "Lcom/example/itaudesafio/data/remote/response/Main;", "visibility", "wind", "Lcom/example/itaudesafio/data/remote/response/Wind;", "rain", "Lcom/example/itaudesafio/data/remote/response/Rain;", "clouds", "Lcom/example/itaudesafio/data/remote/response/Clouds;", "dt", "", "sys", "Lcom/example/itaudesafio/data/remote/response/Sys;", "timezone", "id", "name", "cod", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/example/itaudesafio/data/remote/response/Coord;Ljava/util/List;Ljava/lang/String;Lcom/example/itaudesafio/data/remote/response/Main;ILcom/example/itaudesafio/data/remote/response/Wind;Lcom/example/itaudesafio/data/remote/response/Rain;Lcom/example/itaudesafio/data/remote/response/Clouds;JLcom/example/itaudesafio/data/remote/response/Sys;IJLjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/example/itaudesafio/data/remote/response/Coord;Ljava/util/List;Ljava/lang/String;Lcom/example/itaudesafio/data/remote/response/Main;ILcom/example/itaudesafio/data/remote/response/Wind;Lcom/example/itaudesafio/data/remote/response/Rain;Lcom/example/itaudesafio/data/remote/response/Clouds;JLcom/example/itaudesafio/data/remote/response/Sys;IJLjava/lang/String;I)V", "getBase", "()Ljava/lang/String;", "getClouds", "()Lcom/example/itaudesafio/data/remote/response/Clouds;", "getCod", "()I", "getCoord", "()Lcom/example/itaudesafio/data/remote/response/Coord;", "getDt", "()J", "getId", "getMain", "()Lcom/example/itaudesafio/data/remote/response/Main;", "getName", "getRain", "()Lcom/example/itaudesafio/data/remote/response/Rain;", "getSys", "()Lcom/example/itaudesafio/data/remote/response/Sys;", "getTimezone", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/example/itaudesafio/data/remote/response/Wind;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
public final class WeatherDataResponse {
    @org.jetbrains.annotations.NotNull
    private final com.example.itaudesafio.data.remote.response.Coord coord = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.itaudesafio.data.remote.response.Weather> weather = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String base = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.itaudesafio.data.remote.response.Main main = null;
    private final int visibility = 0;
    @org.jetbrains.annotations.NotNull
    private final com.example.itaudesafio.data.remote.response.Wind wind = null;
    @org.jetbrains.annotations.Nullable
    private final com.example.itaudesafio.data.remote.response.Rain rain = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.itaudesafio.data.remote.response.Clouds clouds = null;
    private final long dt = 0L;
    @org.jetbrains.annotations.Nullable
    private final com.example.itaudesafio.data.remote.response.Sys sys = null;
    private final int timezone = 0;
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    private final int cod = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.example.itaudesafio.data.remote.response.WeatherDataResponse.Companion Companion = null;
    
    public WeatherDataResponse(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.remote.response.Coord coord, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.itaudesafio.data.remote.response.Weather> weather, @org.jetbrains.annotations.NotNull
    java.lang.String base, @org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.remote.response.Main main, int visibility, @org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.remote.response.Wind wind, @org.jetbrains.annotations.Nullable
    com.example.itaudesafio.data.remote.response.Rain rain, @org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.remote.response.Clouds clouds, long dt, @org.jetbrains.annotations.Nullable
    com.example.itaudesafio.data.remote.response.Sys sys, int timezone, long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, int cod) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itaudesafio.data.remote.response.Coord getCoord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.itaudesafio.data.remote.response.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itaudesafio.data.remote.response.Main getMain() {
        return null;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itaudesafio.data.remote.response.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.itaudesafio.data.remote.response.Rain getRain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itaudesafio.data.remote.response.Clouds getClouds() {
        return null;
    }
    
    public final long getDt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.itaudesafio.data.remote.response.Sys getSys() {
        return null;
    }
    
    public final int getTimezone() {
        return 0;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getCod() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itaudesafio.data.remote.response.Coord component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.itaudesafio.data.remote.response.Sys component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final long component12() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.itaudesafio.data.remote.response.Weather> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itaudesafio.data.remote.response.Main component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itaudesafio.data.remote.response.Wind component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.itaudesafio.data.remote.response.Rain component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itaudesafio.data.remote.response.Clouds component8() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itaudesafio.data.remote.response.WeatherDataResponse copy(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.remote.response.Coord coord, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.itaudesafio.data.remote.response.Weather> weather, @org.jetbrains.annotations.NotNull
    java.lang.String base, @org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.remote.response.Main main, int visibility, @org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.remote.response.Wind wind, @org.jetbrains.annotations.Nullable
    com.example.itaudesafio.data.remote.response.Rain rain, @org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.remote.response.Clouds clouds, long dt, @org.jetbrains.annotations.Nullable
    com.example.itaudesafio.data.remote.response.Sys sys, int timezone, long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, int cod) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    public static final void write$Self(@org.jetbrains.annotations.NotNull
    com.example.itaudesafio.data.remote.response.WeatherDataResponse self, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/example/itaudesafio/data/remote/response/WeatherDataResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/example/itaudesafio/data/remote/response/WeatherDataResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.example.itaudesafio.data.remote.response.WeatherDataResponse> {
        @org.jetbrains.annotations.NotNull
        public static final com.example.itaudesafio.data.remote.response.WeatherDataResponse.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public com.example.itaudesafio.data.remote.response.WeatherDataResponse deserialize(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override
        public void serialize(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull
        com.example.itaudesafio.data.remote.response.WeatherDataResponse value) {
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/example/itaudesafio/data/remote/response/WeatherDataResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/itaudesafio/data/remote/response/WeatherDataResponse;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.serialization.KSerializer<com.example.itaudesafio.data.remote.response.WeatherDataResponse> serializer() {
            return null;
        }
    }
}