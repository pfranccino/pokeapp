package com.pfranccino.pokeapp.home.di

import com.pfranccino.pokeapp.register.data.repository.datasource.RegisterRemoteDataSource
import com.pfranccino.pokeapp.register.data.repository.datasource.impl.RegisterRemoteDataSourceImpl
import com.pfranccino.pokeapp.register.data.network.PokeApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class DataSourceModule {
    @Provides
    @Singleton
    internal fun provideRemoteDataSource(
        apiClient: PokeApi, dispatcher: CoroutineDispatcher
    ): RegisterRemoteDataSource =
        RegisterRemoteDataSourceImpl(apiClient, dispatcher)
}

