package mdao.firstproject.compartido

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun TerminalView(){
    Text(text="Este texto a repetir :D",
        modifier = Modifier
            .wrapContentSize()
            .background(Color.Black)
            .border(width= 1.dp, Color.LightGray)
            .padding(16.dp),
        color = Color.White
        )
}