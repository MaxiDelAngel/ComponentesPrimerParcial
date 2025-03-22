package mdao.firstproject.lazylist.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mdao.firstproject.R
import mdao.firstproject.lazylist.viewmodels.StudentViewModel

//@Preview(showBackground = true, locale = "en")
@Composable
fun SorteoView(studentViewModel: StudentViewModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(R.string.bienvenido_tendre_suerte))
        Spacer(modifier = Modifier.height(8.dp))
        if(studentViewModel.isLoading){
            CircularProgressIndicator()
        } else {
            Button(onClick = { studentViewModel.onClickLuckyButton() }) {
                Text(text = stringResource(R.string.start_message))
            }
        }
        Text(text = studentViewModel.selectedStudent)// Aqui el ganador
        Text(text = studentViewModel.contador.toString())// Aqui el numero de intentos
    }
}