package com.example.composeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun FirstPage(
    navController : NavController)
{

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
        ){
        Card(
            modifier = Modifier.padding(top = 110.dp, bottom = 110.dp, start = 20.dp, end = 20.dp),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
            elevation = CardDefaults.cardElevation(5.dp)
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(painter = painterResource(id = R.drawable.logooo), contentDescription = "logo",
                    Modifier.padding(top = 150.dp, start = 85.dp),
                    contentScale = ContentScale.Fit)
                Text(text = "Portfolio",
                    fontWeight = FontWeight.ExtraBold,
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 35.sp,
                    modifier = Modifier.padding(top = 25.dp, start = 80.dp))

                Button(onClick = { navController.navigate(route = Screen.Home.route) },
                    modifier = Modifier.padding(top=50.dp,start = 80.dp)) {
                    Text(text = "Get Started")
                }
            }

        }

    }

}
@Preview
@Composable
fun exp1(){
    FirstPage(navController = rememberNavController())
}



