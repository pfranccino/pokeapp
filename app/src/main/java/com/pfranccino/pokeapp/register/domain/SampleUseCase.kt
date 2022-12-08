package com.pfranccino.pokeapp.register.domain

interface SampleUseCase {
    suspend operator fun invoke(): Pair<Any, Any>
}