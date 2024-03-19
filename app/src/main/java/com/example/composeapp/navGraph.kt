package com.example.composeapp

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.First.route
        ){
        composable(
            route = Screen.First.route
        ){
            FirstPage(navController)
        }
        composable(
            route= Screen.Home.route
        ){

            HomePage()
        }
    }
}