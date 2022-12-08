package com.pfranccino.pokeapp.home.domain

interface SampleUseCase {
    suspend operator fun invoke(): Pair<Any, Any>
}