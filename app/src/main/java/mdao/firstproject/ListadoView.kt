package mdao.firstproject

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import mdao.firstproject.compartido.TarjetaView
import mdao.firstproject.compartido.TerminalView

@Preview(showBackground = true)
@Composable
fun ListadoView(){
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        TerminalView()
        TarjetaView()
        TerminalView()
        TarjetaView(Color.Red,Color.Black,"Hola me llamo max")
    }
}