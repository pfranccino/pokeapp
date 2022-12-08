package com.pfranccino.pokeapp.home.di

import com.pfranccino.pokeapp.register.data.repository.RegisterRepository
import com.pfranccino.pokeapp.register.domain.SampleUseCase
import com.pfranccino.pokeapp.home.domain.impl.SampleUseCaseImpl1
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class UseCaseModule {
    @Provides
    @Singleton
    internal fun provideGetSessionStatusUseCase(
        repository: RegisterRepository
    ): SampleUseCase =
        SampleUseCaseImpl1(repository)

}