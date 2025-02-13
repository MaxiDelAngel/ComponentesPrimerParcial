package mdao.firstproject.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Helloworld(){
    Text(
        text = "Hello World! from the IEST, Maximiliano Del Angel",
        color = Color.Magenta,
        fontSize = 10.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.SansSerif,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier
            .background( color = Color.Cyan)
            .padding(16.dp)
            .background( color = Color.Black)
            .padding(horizontal = 8.dp)
            .background( color = Color.Gray)
            .padding(top = 6.dp)
            .background( color = Color(0xA6AD6E6E)) //0x y 8 caracteres
            .border(width = 3.dp, color = Color.Magenta)
            //.fillMaxWidth() ocupa tod_o el ancho
            //.fillMaxHeight() ocupa tod_o el alto
            .fillMaxSize() //ocupa tod_o el ancho y alto
            //.blur(3.dp) //difuminado a una imagen o componente
        //.width(60.dp)
        //Modifier.background( color = Color.Green,shape = RoundedCornerShape(25.dp) )
        )

}



