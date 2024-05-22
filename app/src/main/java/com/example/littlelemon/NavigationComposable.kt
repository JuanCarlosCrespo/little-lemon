package com.example.littlelemon

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = OnBoarding.route ){
        composable( Home.route ){
            Home( navController )
        }
        composable( Profile.route ){
            Profile( navController )
        }
        composable( OnBoarding.route ){
            Onboarding(navController)
        }
    }
}