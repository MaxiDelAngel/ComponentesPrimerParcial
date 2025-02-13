package mdao.firstproject.Actividades

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mdao.firstproject.R

@Preview(showBackground = true)
@Composable
fun TablaContabilidad() {
    var resultado by remember { mutableStateOf(List(12) { "0" }) }
    var ingresos = listOf(2000,2000,2000,4000,4000,4000,8000,8000,8000,12000,12000,25000)
    var egresos = listOf(500,500,500,4500,1200,3000,4500,4500,4650,6000,6000,75000)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(2.dp)
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .background(Color.White)
                .padding(5.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bandera),
                contentDescription = "logo",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .size(100.dp),
                contentScale = ContentScale.Fit
            )
            Text(
                text = "Contabilidad de Alfonso Estudiante",
                fontSize = 24.sp,
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 110.dp)
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(30.dp)
                    .background(Color.White)
            ){
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(30.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.Bottom
            ){
                Text(text="Ingresos", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(30.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.Bottom
            ){
                Text(text="Egresos", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(30.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.Bottom
            ){
                Text(text="Neto", color = Color.White, fontSize = 18.sp,)
            }
        } // INGRESOS - EGRESOS - NETO
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text="Enero", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="2000", color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Bold)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="500", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text= resultado[0], color = Color.Black, fontSize = 18.sp,)
            }
        } // Enero
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text="Febrero", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="2000", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="500", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text= resultado[1], color = Color.Black, fontSize = 18.sp,)
            }
        } // Febrero
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text="Marzo", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="2000", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="500", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text= resultado[2], color = Color.Black, fontSize = 18.sp,)
            }
        } // Marzo
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text="Abril", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="4000", color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Bold,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="4500", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                if (resultado[3].toInt() < 0) {
                    Text(text= resultado[3], color = Color.Red, fontSize = 18.sp,)
                }else {
                    Text(text= resultado[3], color = Color.Black, fontSize = 18.sp,)
                }
            }
        } // Abril
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text="Mayo", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="4000", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="1200", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text= resultado[4], color = Color.Black, fontSize = 18.sp,)
            }
        } // Mayo
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text="Junio", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="4000", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="3000", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text= resultado[5], color = Color.Black, fontSize = 18.sp,)
            }
        } // Junio
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text="Julio", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="8000", color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Bold,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="4500", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text= resultado[6], color = Color.Black, fontSize = 18.sp,)
            }
        } // Julio
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text="Agosto", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="8000", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="4500", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text= resultado[7], color = Color.Black, fontSize = 18.sp,)
            }
        } // Agosto
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text="Septiembre", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="8000", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="4650", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text= resultado[8], color = Color.Black, fontSize = 18.sp,)
            }
        } // Septiembre
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text="Octubre", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="12000", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="6000", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text= resultado[9], color = Color.Black, fontSize = 18.sp,)
            }
        } // Octubre
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text="Noviembre", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="12000", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="6000", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text= resultado[10], color = Color.Black, fontSize = 18.sp,)
            }
        } // Noviembre
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color(0xFF18671C)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text="Diciembre", color = Color.White, fontSize = 18.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="25000", color = Color(0xFF007BFF), fontSize = 15.sp, fontWeight = FontWeight.Bold,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                Text(text="75000", color = Color.Black, fontSize = 15.sp,)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(1f))
                if (resultado[11].toInt() < 0) {
                    Text(text= resultado[11], color = Color.Red, fontSize = 18.sp,)
                }else {
                    Text(text= resultado[11], color = Color.Black, fontSize = 18.sp,)
                }
            }
        } // Diciembre
        Spacer(modifier = Modifier.size(20.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Servicio ofrecido por", fontSize = 20.sp, fontStyle = FontStyle.Italic,)
                Spacer(modifier = Modifier.size(20.dp))
                Text(text = "RayMundo-ISND", fontSize = 15.sp, fontStyle = FontStyle.Normal, textDecoration = TextDecoration.Underline)
                Spacer(modifier = Modifier.size(20.dp))
                Button(
                    onClick = {
                        //resultado = (ingresos[0].toInt() + egresos[0].toInt()).toString()
                        resultado = ingresos.zip(egresos) { ingreso, egreso -> (ingreso - egreso).toString() }
                    },
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .width(150.dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF18671C),
                        contentColor = Color.White
                    )
                ) {
                    Text(text = "Calcular")
                }
            }
        }
    }
}