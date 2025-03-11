package mdao.firstproject.lazylist.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mdao.firstproject.lazylist.viewmodels.ProductViewModel

@Preview (showBackground = true)
@Composable
fun ListProductsView(){
    val productViewModel: ProductViewModel = ProductViewModel()

    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxSize()){
            items(productViewModel.getProducts()){ product ->
                //Van los componentes
                ProductView(product)
            }

            item{
                Buttom(onClick = { }){
                    Text(text= "Terminar Compra")
                }
            }
        }
    }
}