package mdao.firstproject.Actividades

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.ui.Alignment


@Preview(showBackground = true)
@Composable
fun PlanB(){
    Column(
        modifier = Modifier
            .wrapContentSize() // Ajusta al contenido en ancho y alto
            .background(Color.White)
            .border(width = 5.dp, color = Color.DarkGray)
            .padding(5.dp)
    ){
        Row(
            modifier = Modifier.wrapContentSize() // Ajusta al contenido en ancho y alto
        ){
            Box(
                modifier = Modifier
                    .width(120.dp)
                    .background(Color.Red)
            ){
                Text(text="Top Start", color = Color.White)
            }
            Box(
                modifier = Modifier
                    .width(120.dp)
                    .height(200.dp)
                    .background(Color(0xFF5B03FF))
            ){
                Text(text="Top", color = Color.White, modifier = Modifier.align(Alignment.TopCenter))
            }
            Box(
                modifier = Modifier
                    .width(120.dp)
                    .height(50.dp)
                    .background(Color.Magenta)
            ) {
                Text(
                    text = "Top End",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.TopEnd)
                )
            }
        }
        Row(
            modifier = Modifier.wrapContentSize()
        ){
            Box(
                modifier = Modifier
                    .width(140.dp)
                    .height(150.dp)
                    .background(Color.Green)
            ){
                Text(text="Center Start", modifier = Modifier.align(Alignment.CenterStart))
            }
            Box(
                modifier = Modifier
                    .width(80.dp)
                    .height(400.dp)
                    .background(Color.Gray)
            ){
                Text(text="Center", modifier = Modifier.align(Alignment.Center))
            }
            Box(
                modifier = Modifier
                    .width(140.dp)
                    .background(Color.Black)
            ){
                Text(text="Center End", color = Color.White,modifier = Modifier.align(Alignment.CenterEnd))
            }
        }
        Row(
            modifier = Modifier.wrapContentSize()
        ){
            Box(
                modifier = Modifier
                    .width(80.dp)
                    .height(200.dp)
                    .background(Color.Cyan)
            ){
                Text(text="Bottom Start", modifier = Modifier.align(Alignment.BottomCenter))
            }
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .background(Color.DarkGray)
            ){
                Text(text="Bottom Center", color = Color.White, modifier = Modifier.align(Alignment.BottomCenter))
            }
            Box(
                modifier = Modifier
                    .width(80.dp)
                    .height(200.dp)
                    .background(Color.Yellow)
            ){
                Text(text="Bottom End", modifier = Modifier.align(Alignment.BottomEnd))
            }
        }
    }
}