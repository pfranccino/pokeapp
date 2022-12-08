package com.pfranccino.pokeapp.register.di

import com.pfranccino.pokeapp.register.data.repository.RegisterRepository
import com.pfranccino.pokeapp.register.data.repository.datasource.RegisterRemoteDataSource
import com.pfranccino.pokeapp.register.data.repository.impl.RegisterRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class RepositoryModule {
    @Provides
    @Singleton
    internal fun provideRepository(
        remote: RegisterRemoteDataSource,
    ): RegisterRepository = RegisterRepositoryImpl(remote)
}