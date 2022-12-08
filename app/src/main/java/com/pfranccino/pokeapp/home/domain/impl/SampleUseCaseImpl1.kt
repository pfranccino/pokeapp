package com.pfranccino.pokeapp.home.domain.impl

import com.pfranccino.pokeapp.register.data.repository.RegisterRepository
import com.pfranccino.pokeapp.register.domain.SampleUseCase
import javax.inject.Inject

internal class SampleUseCaseImpl1 @Inject constructor(
    private val repository: RegisterRepository
): SampleUseCase {
    override suspend fun invoke(): Pair<Any, Any> {
        TODO("Not yet implemented")
    }
}