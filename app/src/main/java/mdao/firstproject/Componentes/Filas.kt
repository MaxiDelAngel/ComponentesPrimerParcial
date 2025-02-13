package mdao.firstproject.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview (showBackground = true)
@Composable
fun FilasView() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
        ){
            Text(text = "Primero")
            Column(){
                Text(text = "Segundo")
                Text(text = "Tercero")
                Text(text = "Cuarto")
            }//Cierre de Columna Interna
        }//Cierre de Row
        Text(text = "Hola amiguito",
            modifier =
                Modifier.fillMaxHeight().background(Color.Red).weight(1f),
        )
        Text(text = "Hola enemiguito",
            modifier =
                Modifier.fillMaxHeight().background(Color.Green).weight(1f),
        )
    }//Cierre de Columna Externa
}
