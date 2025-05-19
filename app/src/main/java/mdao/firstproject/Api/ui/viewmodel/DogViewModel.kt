package mdao.firstproject.Api.ui.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import mdao.firstproject.Api.domain.API

class DogViewModel: ViewModel() {
    var urlImage by mutableStateOf("")
    var allImagenes by mutableStateOf<List<String>>(emptyList())

    fun mostrarImagen(){
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                urlImage = API().getImagenAleatoria()
            }
        }
    }

    fun traerImagenes(){
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                allImagenes = API().getImagenesDeRaza()
                Log.d("API_PRUEBA", "allImagenes es " + allImagenes)
            }
        }
    }
}