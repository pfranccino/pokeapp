package com.pfranccino.pokeapp.home.data.repository.datasource.impl

import com.pfranccino.pokeapp.register.data.repository.datasource.RegisterRemoteDataSource
import com.pfranccino.pokeapp.register.data.network.PokeApi
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

internal class PokeRemoteDataSourceImpl @Inject constructor(
    private val apiClient: PokeApi,
    private val dispatcher: CoroutineDispatcher
) : RegisterRemoteDataSource {



}