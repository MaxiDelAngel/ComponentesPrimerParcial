package mdao.firstproject

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeView(navegar: NavController){
    var nombre by remember { mutableStateOf("") }
    var id by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hola")

        Button(onClick = {
            navegar.navigate("Botones")
        }) {
            Text(text = "Presioname")
        }
        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = nombre, onValueChange = { nombre = it })

        TextField(value = id, onValueChange = { id = it })

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navegar.navigate("estudiante?nombre=$nombre&id=$id")
        })
        {
            Text(text = "A Estudiante -->")
        }
    }
}

@Preview (showBackground = true)
@Composable
fun HomeViewPreview(){
    val nav = rememberNavController()
    HomeView(nav)
}