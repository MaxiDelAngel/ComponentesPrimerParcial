package mdao.firstproject.Api.domain

import android.util.Log
import mdao.firstproject.Api.repository.RetrofitHelper

class API {
    private val service = RetrofitHelper.getRetrofitService()

    suspend fun getImagenAleatoria():String {
        val msg:String
        val response = service.imagenAleatoria()
        /*obtenemos la respuesta y aplicamos la logica de que deseamos hacer con los campos*/
        if(response.body()?.status.equals("success")){
            msg = response.body()?.mensaje ?: ""
        }else{
            msg = "NO fue exitoso"
        }
        Log.d("API_PRUEBA", "status es " + response.body()?.status)
        Log.d("API_PRUEBA ", "message es " + response.body()?.mensaje)
        return msg
    }

    /*
    suspend fun getImagenesDeRaza(raza: String): List<String> {
        val msg:List<String>
        val response = service.imagenesPorRaza(raza)

        if(response.body()?.status.equals("success")){
            msg = response.body()?.message ?: emptyList()
        }else{
            msg = emptyList()
        }
        Log.d("API_PRUEBA", "status es " + response.body()?.status)
        Log.d("API_PRUEBA ", "message es " + response.body()?.message)
        return msg
    }*/

    suspend fun getImagenesDeRaza(): List<String> {
        val response = service.imagenesPorRaza("akita")
        return if (response.body()?.status == "success") {
            response.body()?.message ?: emptyList()
        } else {
            emptyList()
        }
    }
}
