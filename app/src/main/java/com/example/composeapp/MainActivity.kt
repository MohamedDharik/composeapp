package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.composeapp.ui.theme.ComposeappTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController : NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeappTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
                Surface(color = MaterialTheme.colorScheme.background) {

                }
            }
        }
    }
}

@Preview
@Composable
fun Exp(){
    FirstPage(navController = rememberNavController())
}
