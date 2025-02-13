package mdao.firstproject.Actividades

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview (showBackground = true)
@Composable
fun View(){
    Column(
        modifier = Modifier
            .width(100.dp)
            .height(180.dp)
            .background(Color.White)
            .padding(2.dp)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 3.dp),
            verticalArrangement = Arrangement.spacedBy(3.dp)
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .background(Color.DarkGray)
            ){

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .background(Color.Green)
            ){

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .background(Color.DarkGray)
            ){

            }
        }//FIN COLUMNAS
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(3.dp)
        ){
            Column(
                modifier = Modifier
                    .width(30.dp)
                    .height(80.dp)
                    //.background(Color(0xFF886666))
                    .background(Color.DarkGray)
            ){
            }
            Column(
                modifier = Modifier
                    .width(30.dp)
                    .height(80.dp)
                    .background(Color.Blue)
            ){

            }
            Column(
                modifier = Modifier
                    .width(30.dp)
                    .height(80.dp)
                    .background(Color.DarkGray)
            ){

            }
        }//FIN FILAS
    }//FIN CONTENEDOR
}
