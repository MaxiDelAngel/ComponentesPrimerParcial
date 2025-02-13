package mdao.firstproject.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ColumnasView() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .background(Color.LightGray)
        ,
        //Si queremos hacer un footer usamos Bottom
        //verticalArrangement = Arrangement.spacedBy(10.dp)
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Hola",
            modifier = Modifier
                .background(Color.Blue)
                //Cubrir todo el ancho con .fillMaxWidth()
                .fillMaxWidth()
            ,
            color = Color.Red,
            textAlign = TextAlign.Center
        )
        Text(text = "Adios",
            modifier = Modifier
                .background(Color.Black)
            ,
            color= Color.Yellow
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Green)
            ,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text(text = "De nuevo",
                color= Color.White,
            )
        }//Columna Interna
    }//Columna Externa
}

@Preview(showBackground = true)
@Composable
fun ColumnasSeparadas(){
    Column(modifier = Modifier.fillMaxSize()){
        Text(text = "1",)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "2",)
        Spacer(modifier = Modifier.height(40.dp)) //Espacio entre lineas
        HorizontalDivider() //Linea divisoria
        Text(text = "3",)
    }
}