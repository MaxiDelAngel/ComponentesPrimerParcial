package mdao.firstproject

import mdao.firstproject.Api.ui.viewmodel.DogViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mdao.firstproject.Api.ui.views.DogView
import mdao.firstproject.Api.ui.views.DogsViews
import mdao.firstproject.ui.theme.FirstProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        val dogViewModel = DogViewModel()
                        DogsViews(dogViewModel)
                        //dogViewModel.mostrarImagen()
                        //val studentViewModel: StudentViewModel = StudentViewModel()
                        //NavigationManager()
                        //ListProdu ctsView()
                        //SorteoView(studentViewModel)
                        //DataStoreView()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstProjectTheme {
        Greeting("Android")
    }
}