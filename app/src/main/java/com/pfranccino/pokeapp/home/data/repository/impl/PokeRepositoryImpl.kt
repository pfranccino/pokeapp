package cl.bci.sismo.card.data.repository.impl

import com.pfranccino.pokeapp.register.data.repository.RegisterRepository
import com.pfranccino.pokeapp.register.data.repository.datasource.RegisterRemoteDataSource
import javax.inject.Inject

internal class PokeRepositoryImpl @Inject constructor(
    private val remote: RegisterRemoteDataSource,
) : RegisterRepository {
}