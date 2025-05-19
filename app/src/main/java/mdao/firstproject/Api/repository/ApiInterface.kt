package mdao.firstproject.Api.repository

import mdao.firstproject.Api.ui.model.ImagenRandom
import mdao.firstproject.Api.ui.model.ImagenesRaza
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/*
Aqui solo se definene las urls relativas, parametros y tipo de respuestas
 */

interface ApiInterface {

    @GET("breeds/image/random")
    suspend fun imagenAleatoria(): Response<ImagenRandom>

    @GET("breed/{raza}/imagenes")
    suspend fun imagenesPorRaza(@Path("raza") raza: String): Response<ImagenesRaza>
}