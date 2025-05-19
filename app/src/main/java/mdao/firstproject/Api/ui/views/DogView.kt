package mdao.firstproject.Api.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import coil3.compose.AsyncImage
import mdao.firstproject.Api.ui.viewmodel.DogViewModel

@Composable
fun DogView(viewModel : DogViewModel){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Bienvenido conoce al mejor cachorro del año")

        AsyncImage(
            model = viewModel.urlImage,
            contentDescription = null,
        )

        Button(onClick = {
            viewModel.mostrarImagen()
        }) {
            Text(text = "Cargar imagen")
        }
    }
}

@Composable
fun DogsViews(viewModel: DogViewModel){
    LazyColumn(){
        item {
            Button(onClick = {
                viewModel.traerImagenes()
            }) {
                Text(text = "Cargar imagenes")
            }
        }
        items(viewModel.allImagenes){ url ->
            AsyncImage(
                model = url,
                contentDescription = null,
            )
        }
    }
}