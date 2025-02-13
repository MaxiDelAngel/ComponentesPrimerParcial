package mdao.firstproject.Componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddModerator
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mdao.firstproject.R

@Preview(showBackground = true)
@Composable
fun BotonesView(){

    // imperativo var texto : String = "Hola"

    //declarativo
    var texto by remember { mutableStateOf("LOGIN") }

    var cambio: Boolean = false

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ){
        Image(painter = painterResource(id = R.drawable.pngegg),
            contentDescription = "logo",
            modifier = Modifier.align(Alignment.TopEnd).size(100.dp),
            contentScale = ContentScale.Fit,
        )
        Column(modifier = Modifier.align(Alignment.Center)){
            HorizontalDivider(
                thickness = 1.dp,
                color = Color.Black)

            Row(modifier = Modifier.align(Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(text = "Apple",
                    fontSize = 50.sp,
                    color = Color.White,
                )

                Spacer(modifier = Modifier.size(90.dp))
                Icon(imageVector = Icons.Default.AddModerator,
                    contentDescription = "icono",
                    modifier = Modifier.size(50.dp),
                )
            }
            Button(onClick = {
                //if (!cambio){
                  //  texto = "NO TIENES CUENTA CHAVO"
                //}else{
                  //  texto = "LOGIN"
                //}
                //cambio = !cambio
            },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                )
            )
            {
                Text(text = texto)
            }

            HorizontalDivider(
                thickness = 1.dp,
                color = Color.Black)
        }

        Text(text = "By Max Del Angel",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier.align(Alignment.BottomCenter).background(Color.Black).fillMaxWidth()
        )
    }
}