package mdao.firstproject.Componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun CajaDeTextoView(){
    var firstNumber by remember {
        mutableStateOf("")
    }
    var secondNumber by remember {
        mutableStateOf("")
    }

    var resultado by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Dame un número")
        TextField(value= firstNumber,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = {
            textoIngresado -> firstNumber = textoIngresado
        },
            placeholder = {
            Text(text = "Ingresa un número")
                        },
        )

        Spacer(modifier = Modifier.size(20.dp))

        Text(text = "Dame un segundo número")
        TextField(value= secondNumber,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = {
                    textoIngresado -> secondNumber = textoIngresado
            },
            placeholder = {
                Text(text = "Ingresa un segundo número")
            },
        )

        Spacer(modifier = Modifier.size(20.dp))

        Button(onClick = {
            resultado = (firstNumber.toInt() + secondNumber.toInt()).toString()
        },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            )
        )
        {
            Text(text = "Calcular")
        }

        Spacer(modifier = Modifier.size(20.dp))

        Text(text = "El resultado es: $resultado")

    }
}