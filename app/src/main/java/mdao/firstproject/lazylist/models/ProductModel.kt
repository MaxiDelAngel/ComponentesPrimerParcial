package mdao.firstproject.lazylist.models

import androidx.annotation.DrawableRes

data class ProductModel(
    val id: Int, //var puede cambiar su valor, val no puede cambiar su valor
    val name: String,
    val description: String?, //? significa que es opcional
    val price: Float,
    @DrawableRes val image: Int
)
