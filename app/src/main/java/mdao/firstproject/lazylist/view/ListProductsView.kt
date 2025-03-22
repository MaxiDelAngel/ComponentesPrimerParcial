package mdao.firstproject.lazylist.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import mdao.firstproject.lazylist.viewmodels.ProductViewModel
import mdao.firstproject.lazylist.viewmodels.StudentViewModel

@Preview (showBackground = true)
@Composable
fun ListProductsView(){
    val productViewModel: ProductViewModel = ProductViewModel()
    val studentViewModel: StudentViewModel = StudentViewModel()

    Column(modifier = Modifier.fillMaxSize()) {

        LazyColumn(){
            item {
                Text(text = studentViewModel.selectedStudent, fontSize = 30.sp)
            }
        }

        LazyColumn(modifier = Modifier.fillMaxSize()){
            items(productViewModel.getProducts()){ product ->
                //Van los componentes
                ProductView(product)
            }

            item{
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Agregar Producto")
                }
            }
        }
    }
}