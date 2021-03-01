package com.puppyadoption.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.puppyadoption.R
import com.puppyadoption.models.Dog
import com.puppyadoption.theme.ComposeTheme
import com.puppyadoption.theme.listSubTitleStyle
import com.puppyadoption.theme.listTitleStyle

const val DOG_LIST_ID = "DogListScreen"

@Composable
fun DogListScreen(
    list: List<Dog>,
    onDogClick: (Dog) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Dogs List")
                },
                backgroundColor = MaterialTheme.colors.primary
            )
        },
        backgroundColor = MaterialTheme.colors.surface
    ) {
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
            //verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(list) { dog ->
                DogItem(dog, onDogClick)
            }
        }
    }
}

@Composable
fun DogItem(
    dog: Dog,
    onDogClick: (Dog) -> Unit
) {
    Row(
        horizontalArrangement =  Arrangement.spacedBy(16.dp),
        modifier = Modifier.padding(16.dp).fillMaxWidth().clickable {
            onDogClick.invoke(dog)
        }
    ) {
        ImageDogList(dog.imgId)
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = dog.name,
                style = listTitleStyle
            )
            LabelRounded(
                text = dog.breed
            )
        }
    }
}

@Composable
fun LabelRounded(text: String) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.secondaryVariant
    ) {
        Text(
            text = text,
            style = listSubTitleStyle,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
    }
}

@Composable
fun ImageDogList(imgId: Int = R.drawable.img_dog_one) {
    Image(
        painter = painterResource(imgId),
        contentDescription = null,
        modifier = Modifier
            .height(50.dp)
            .width(50.dp)
            .clip(shape = RoundedCornerShape(4.dp)),
        contentScale = ContentScale.Crop
    )
}

@Preview("HomeScreen")
@Composable
private fun DogListScreenPreview() {
    ComposeTheme {
        DogListScreen(
            listOf(
                Dog(
                    name = "Dog 1",
                    age = 1,
                    breed = "Pitbull",
                    description = "Very calm"
                )
            )
        ) {

        }
    }
}




