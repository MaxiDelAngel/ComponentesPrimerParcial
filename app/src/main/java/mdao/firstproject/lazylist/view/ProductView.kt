package mdao.firstproject.lazylist.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mdao.firstproject.R
import mdao.firstproject.lazylist.models.ProductModel

@Preview(showBackground = true)
@Composable
fun ProductPreview(){
    val product = ProductModel(
        id = 1,
        name = "Tamales",
        description = null,
        price = 10.0f,
        image = R.drawable.tamales
    )
    ProductView(product)
}

@Composable
fun ProductView(product: ProductModel){
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = product.image),
                contentDescription = "taco",
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )

            Column(modifier = Modifier.padding(start = 6.dp)) {
                Text(text= product.name, fontSize = 18.sp)
                Text(text= product.description ?: "Sin Descripción", fontSize = 10.sp, color = Color.Blue)

                Text(text = "${product.price} MXN", fontSize = 18.sp)

                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End)
                {
                    Button(onClick = { },) {
                        Text(text = "Comprar")
                    }
                }

            }
        }
    }
}