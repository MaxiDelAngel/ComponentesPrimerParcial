package mdao.firstproject.Api.ui.model

import com.google.gson.annotations.SerializedName

// La data class tendra los campos que deseamos buscar en la respuesta json

// Cuando necestiamos renombrar el nombre de las llaves del json response usamos
// SealizedName donde la palabra entre comillas es el nombre de la llave
// y el val es como la renombramos.

// Colocamos ? porque no sabemos si siempre traera o no esos campos

data class ImagenRandom (
    @SerializedName("message") val mensaje: String?,
    val status: String?,
)