package com.pfranccino.pokeapp.home.di

import com.pfranccino.pokeapp.register.data.network.PokeApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {

    private const val CONNECT_TIMEOUT = 30 * 4
    private const val WRITE_TIMEOUT = 30 * 4
    private const val READ_TIMEOUT = 30 * 4
    private const val BASE_URL_TRUST = ""

    @Provides
    @Singleton
    fun provideLogginInterceptor(): Interceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }


    @Provides
    @Singleton
    fun provideOkHttpClient(
        interceptor: Interceptor
    ): OkHttpClient {
        return OkHttpClient().newBuilder()
            .addInterceptor(interceptor)
            .connectTimeout(CONNECT_TIMEOUT.toLong(), TimeUnit.SECONDS)
            .writeTimeout(WRITE_TIMEOUT.toLong(), TimeUnit.SECONDS)
            .readTimeout(READ_TIMEOUT.toLong(), TimeUnit.SECONDS)
            .build()
    }


    @Singleton
    @Provides
    fun provideTransactionApi(okHttpClient: OkHttpClient): PokeApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL_TRUST)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PokeApi::class.java)
    }

}