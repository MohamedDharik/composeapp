package com.example.composeapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomePage(){
    val showPage =  remember {
        mutableStateOf(false) }
    Surface(modifier = Modifier.fillMaxSize()) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            shape = RoundedCornerShape(15.dp),
            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ){
                Surface(
                    modifier = Modifier
                        .size(150.dp)
                        .padding(5.dp),
                    shape = CircleShape,
                    border = BorderStroke(0.5.dp, Color.LightGray),
                    shadowElevation = 4.dp
                ) {
                    Image(painter = painterResource(id =R.drawable.image ),
                        contentDescription = null,
                    contentScale = ContentScale.Crop)
                }
                Divider()
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = "Mohamed Dharik",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary)
                    
                    Text(text = "Android App Developer",
                        modifier = Modifier.padding(3.dp))

                    Text(text = "@mohameddharik",
                        modifier = Modifier.padding(3.dp))

                    Button(onClick = { showPage.value = !showPage.value }) {
                        Text(text ="Portfolio" )
                    }
                    if (showPage.value){
                        PortfolioScreen()
                    }
                }

            }

        }
    }
}
@Composable
fun PortfolioScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(2.dp, Color.Gray)
    ) {
        LazyColumn {

           items(getList()){
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(MaterialTheme.colorScheme.background)
                            .padding(16.dp)
                    ){
                        Surface(
                            modifier = Modifier.size(50.dp),
                            shape = CircleShape,
                            shadowElevation = 4.dp
                        ) {
                            Image(painter = painterResource(id = it.img), contentDescription = null,
                                contentScale = ContentScale.Crop
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column{
                            Text(text = it.name,
                                fontWeight = FontWeight.Bold)
                            Text(text = it.desc,
                                fontWeight = FontWeight.Bold)
                        }
                    }

                }
           }
        }

    }

}