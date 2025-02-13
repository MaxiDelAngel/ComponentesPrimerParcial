package mdao.firstproject.Actividades

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Puzzle(){
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.DarkGray)
            .border(width = 5.dp, color = Color.DarkGray)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                ,
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.White)
                        .border(width = 2.dp, color = Color.Black)
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "1", color = Color.Blue)
                }

                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Blue)
                        .border(width = 2.dp, color = Color.Black)
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "2", color = Color.White)
                }

                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.White)
                        .border(width = 2.dp, color = Color.Black)
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "3", color = Color.Blue)
                }

                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Blue)
                        .border(width = 2.dp, color = Color.Black)
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "4", color = Color.White)
                }
            } // FIN ROW PRIMERA FILA
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                ,
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.White)
                        .border(width = 2.dp, color = Color.Black)
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "5", color = Color.Blue)
                }
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Blue)
                        .border(width = 2.dp, color = Color.Black)
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "6", color = Color.White)
                }
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.White)
                        .border(width = 2.dp, color = Color.Black)
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "7", color = Color.Blue)
                }
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Blue)
                        .border(width = 2.dp, color = Color.Black)
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "8", color = Color.White)
                }
            } // FIN ROW SEGUNDA FILA
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                ,
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.White)
                        .border(width = 2.dp, color = Color.Black)
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "9", color = Color.Blue)
                }
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Blue)
                        .border(width = 2.dp, color = Color.Black),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "10", color = Color.White)
                }
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.White)
                        .border(width = 2.dp, color = Color.Black),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "11", color = Color.Blue)
                }
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Blue)
                        .border(width = 2.dp, color = Color.Black),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "12", color = Color.White)
                }
            } // FIN ROW TERCERA FILA
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                ,
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.White)
                        .border(width = 2.dp, color = Color.Black),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "13", color = Color.Blue)
                }
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Blue)
                        .border(width = 2.dp, color = Color.Black),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "14", color = Color.White)
                }
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .border(width = 2.dp, color = Color.Black),
                    contentAlignment = Alignment.Center
                ) {
                }
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.White)
                        .border(width = 2.dp, color = Color.Black),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "15", color = Color.Blue)
                }
            } // FIN ROW CUARTA FILA
        }//Fin Columna
    } // FIN CONTENEDOR MAIN
}