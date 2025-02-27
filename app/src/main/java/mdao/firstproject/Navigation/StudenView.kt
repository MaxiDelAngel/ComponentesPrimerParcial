package mdao.firstproject.Navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun StudenView(studentName: String, studentId: Int) {
    Column() {
        Text(text = "Nombre: $studentName")
        Text(text = "ID: $studentId")
    }
}

@Preview (showBackground = true)
@Composable
fun StudenViewTest(){
    StudenView("Max", 0)
}