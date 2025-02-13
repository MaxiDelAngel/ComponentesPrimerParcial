package mdao.firstproject.Componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mdao.firstproject.R

@Preview(showBackground = true)
@Composable
fun CajaView(){
    Box(modifier = Modifier
        //.fillMaxSize()
        .size(100.dp)
        //.background(Color.Yellow)
    ){
        //Insertar iconos
        Image(imageVector = Icons.Default.AccountCircle,
            contentDescription = "icono",
            //modifier = Modifier.align(Alignment.Center)
        )

        //Insertar imagenes
        Image(painter = painterResource(id = R.drawable.doge),
            contentDescription = "fondo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha = 0.5f
        ) //End Image

        Text(text = "5",
            modifier = Modifier.align(Alignment.Center)
        )
        Text(text = "3", modifier = Modifier.align(Alignment.TopEnd))
        Text(text = "9", modifier = Modifier.align(Alignment.BottomEnd))
        Text(text = "1", modifier = Modifier.align(Alignment.TopStart))
        Text(text = "6", modifier = Modifier.align(Alignment.CenterEnd))
        Text(text = "2", modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "7", modifier = Modifier.align(Alignment.BottomStart))
        Text(text = "8", modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "4", modifier = Modifier.align(Alignment.CenterStart))

        //Insertar Iconos
        Icon(imageVector = Icons.Default.AccountCircle,
            contentDescription = "icono",
            modifier = Modifier.align(Alignment.Center),
            tint = Color.Red
        )
    } //End Box

}//End BoxView