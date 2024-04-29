// Generated by Dagger (https://dagger.dev).
package com.example.itaudesafio.data;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.ktor.client.HttpClient;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class KtorRemoteDataSource_Factory implements Factory<KtorRemoteDataSource> {
  private final Provider<HttpClient> httpClientProvider;

  public KtorRemoteDataSource_Factory(Provider<HttpClient> httpClientProvider) {
    this.httpClientProvider = httpClientProvider;
  }

  @Override
  public KtorRemoteDataSource get() {
    return newInstance(httpClientProvider.get());
  }

  public static KtorRemoteDataSource_Factory create(Provider<HttpClient> httpClientProvider) {
    return new KtorRemoteDataSource_Factory(httpClientProvider);
  }

  public static KtorRemoteDataSource newInstance(HttpClient httpClient) {
    return new KtorRemoteDataSource(httpClient);
  }
}
