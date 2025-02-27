package mdao.firstproject.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import mdao.firstproject.Componentes.BotonesView
import mdao.firstproject.HomeView

@Composable
fun NavigationManager(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Inicio"){
        ///// Aqui los nombres de rutas y su componente/vista respectiva
        composable("Inicio"){
            HomeView(navController)
        }

        composable("Botones"){
            BotonesView(navController)
        }

        /*composable(route = "estudiante/{nombre}/{id}",
            arguments = listOf(
                navArgument("nombre"){type = NavType.StringType},
                navArgument("id"){type = NavType.IntType}
            )
        ){
            parametros ->
            val studentName = parametros.arguments?.getString("nombre") ?: ""
            val studentId = parametros.arguments?.getInt("id") ?: 0
            StudenView(studentName, studentId)
        }*/

        composable(route = "estudiante?nombre={nombre}&id={id}",
            arguments = listOf(
                navArgument("nombre"){type = NavType.StringType
                                     defaultValue = "null"
                                     nullable = true},

                navArgument("id"){type = NavType.IntType
                    defaultValue = 0 }
            )
        ){
                parametros ->
            val studentName = parametros.arguments?.getString("nombre") ?: "null"
            val studentId = parametros.arguments?.getInt("id") ?: 0
            StudenView(studentName, studentId)
        }
    }
}