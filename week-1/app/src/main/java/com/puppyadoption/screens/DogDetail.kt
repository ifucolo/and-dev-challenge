package com.puppyadoption.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.puppyadoption.R
import com.puppyadoption.models.Dog
import com.puppyadoption.theme.bigTitleStyle
import com.puppyadoption.theme.descriptionStyle

const val DOG_DETAIL_ID: String = "DogDetailScreen"

@Composable
fun DogDetailScreen(
    dog: Dog,
    onBackClick: () -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Dogs Detail")
                },
                backgroundColor = MaterialTheme.colors.primary,
                navigationIcon = {
                    // navigation icon is use
                    // for drawer icon.
                    IconButton(onClick = {
                        onBackClick.invoke()
                    }) {
                        // below line is use to
                        // specify navigation icon.
                        Icon(imageVector = Icons.Filled.ArrowBack, "back")
                    }
                },
            )
        },
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Column() {
            ImageDogDetail(dog.imgId)
            Text(
                text = dog.name,
                style = bigTitleStyle,
                modifier = Modifier.fillMaxWidth()
                    .padding(16.dp)
            )
            Text(
                text = dog.description,
                style = descriptionStyle,
                modifier = Modifier.fillMaxWidth()
                    .padding(16.dp)
            )
        }
    }
}

@Composable
fun ImageDogDetail(imgId: Int = R.drawable.img_dog_one) {
    Image(
        painter = painterResource(imgId),
        contentDescription = null,
        modifier = Modifier
            .height(250.dp)
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
}