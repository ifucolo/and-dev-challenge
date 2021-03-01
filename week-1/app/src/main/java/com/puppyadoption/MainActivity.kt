package com.puppyadoption

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.puppyadoption.models.Dog
import com.puppyadoption.models.dogs
import com.puppyadoption.screens.DOG_DETAIL_ID
import com.puppyadoption.screens.DogDetailScreen
import com.puppyadoption.theme.ComposeTheme
import com.puppyadoption.screens.DOG_LIST_ID
import com.puppyadoption.screens.DogListScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeTheme {
                val navController = rememberNavController()

                NavHost(navController, startDestination = DOG_LIST_ID) {
                    composable(DOG_LIST_ID) {
                        DogListScreen(
                            dogs,
                            onDogClick = { dog ->
                                navController.currentBackStackEntry
                                    ?.arguments?.putSerializable("dog", dog)
                                navController.navigate(DOG_DETAIL_ID)
                            }
                        )
                    }

                    composable(DOG_DETAIL_ID,) {
                            val dog = navController.previousBackStackEntry
                                ?.arguments?.getSerializable("dog") as Dog

                            DogDetailScreen(
                                dog = dog,
                                onBackClick = { navController.navigateUp() }
                            )
                    }
                }
            }
        }
    }
}