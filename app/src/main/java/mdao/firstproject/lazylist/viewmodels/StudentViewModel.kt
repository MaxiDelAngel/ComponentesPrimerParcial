package mdao.firstproject.lazylist.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class StudentViewModel: ViewModel() {

    var selectedStudent by mutableStateOf("")
        private set

    var isLoading by mutableStateOf(false)
        private set

    var contador by mutableStateOf(0)
        private set

    init {

    }

    // Function sincrona
    fun onClickLuckyButton(){
        viewModelScope.launch {
            selectedStudent = getStudentsAsync()
        }
    }

    // function asincrona (hilos)
    suspend fun getStudentsAsync(): String {
        return withContext(Dispatchers.IO){
            isLoading = true
            selectedStudent = ""
            delay(5000)
            val students = listOf<String>(
                "Fabiola", "Yahir", "Marcelo", "Ivan",
                "Yuanel", "Eunice", "Max", "Julia",
                "Juan Pablo", "Zuri", "Roberto", "Gerardo",
                "Luis Alberto", "David", "Alain", "Valeria",
                "Edna", "Guillermo",
            )
            delay(3000)
            contador++
            isLoading = false
            students.random()
        }
    }

}