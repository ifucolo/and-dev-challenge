package com.puppyadoption.models

import android.graphics.drawable.Drawable
import com.puppyadoption.R
import java.io.Serializable

data class Dog(
    val name: String,
    val age: Int,
    val breed: String,
    val description: String,
    val imgId: Int = R.drawable.img_dog_one
): Serializable


val dogs = listOf<Dog>(
    Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),
    Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),
    Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),
    Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),
    Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),
    Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),
    Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),Dog(
        name = "Jublim",
        age = 1,
        breed = "Pitbull",
        description = "Very calm"
    ),
)