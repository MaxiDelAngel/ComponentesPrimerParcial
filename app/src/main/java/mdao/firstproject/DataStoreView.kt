package mdao.firstproject

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import mdao.firstproject.Preferencias.Preferencias

@Preview(showBackground = true)
@Composable
fun DataStoreView(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val context: Context = LocalContext.current
        val preferences = Preferencias(context)
        val corrutineScope = rememberCoroutineScope()

        var name by remember { mutableStateOf("") }
        var age by remember { mutableIntStateOf(0) }

        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Teclea tu nombre") }
        )

        TextField(
            value = age.toString(), // Convertimos el Int a String para que TextField lo acepte
            onValueChange = {
                age = it.toIntOrNull() ?: 0
            },
            label = { Text("Teclea tu edad") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            corrutineScope.launch {
                preferences.savePersonData(name, age)
            }

        }) {
            Text(text = "Guardar")
        }

        Spacer(modifier = Modifier.height(16.dp))

        val savedName = preferences.name.collectAsState(initial = "")
        val savedAge = preferences.age.collectAsState(initial = 0)

        if (savedName.value.isNotEmpty() && savedAge.value != 0){
            Text(text = "Datos guardados son ${savedName.value} y " +
                    "${savedAge.value}")
        } else {
            Text(text = "No hay datos guardados")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            corrutineScope.launch {
                preferences.clearSession()
            }

        }) {
            Text(text = "Clear")
        }

    }
}