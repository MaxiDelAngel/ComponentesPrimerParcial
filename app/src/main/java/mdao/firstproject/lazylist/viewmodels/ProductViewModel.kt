package mdao.firstproject.lazylist.viewmodels

import androidx.lifecycle.ViewModel
import mdao.firstproject.R
import mdao.firstproject.lazylist.models.ProductModel

class ProductViewModel(): ViewModel() {
    init {
        //getProducts()
    }

    fun getProducts(): List<ProductModel> {
        var productsList = listOf<ProductModel>(
            ProductModel(
                id = 1,
                name = "Tacos",
                description = "3 Tacos",
                price = 10.0f,
                image = R.drawable.tacos
            ),
            ProductModel(
                id = 2,
                name = "Tamales",
                description = "Un tamal",
                price = 10.0f,
                image = R.drawable.tamales
            ),
            ProductModel(
                id = 3,
                name = "Pozole",
                description = "Un pozolote",
                price = 10.0f,
                image = R.drawable.pozole
            ),
            ProductModel(
                id = 4,
                name = "Hamburguesa",
                description = "Super Hamburguesa",
                price = 10.0f,
                image = R.drawable.pozole
            ),
            ProductModel(
                id = 5,
                name = "HotDog",
                description = "Super HotDog",
                price = 10.0f,
                image = R.drawable.pozole
            ),
            ProductModel(
                id = 6,
                name = "Caldo",
                description = "Super Caldo",
                price = 10.0f,
                image = R.drawable.pozole
            ),
            ProductModel(
                id = 7,
                name = "Boneless",
                description = "Super Boneless",
                price = 10.0f,
                image = R.drawable.tamales
            ),
            ProductModel(
                id = 8,
                name = "PolloChicken",
                description = "Super Pollo",
                price = 10.0f,
                image = R.drawable.tacos
            ),
            ProductModel(
                id = 9,
                name = "Para la Cruda",
                description = "Super Cruda",
                price = 10.0f,
                image = R.drawable.tacos
            ),
            ProductModel(
                id = 10,
                name = "Arrachera",
                description = "Super Arrachera",
                price = 10.0f,
                image = R.drawable.tacos
            ),
        )
        return productsList
    }
}