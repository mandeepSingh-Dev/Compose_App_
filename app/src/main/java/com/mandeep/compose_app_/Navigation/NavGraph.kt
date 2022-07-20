package com.mandeep.compose_app_.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mandeep.compose_app_.Screens.ScreenFour
import com.mandeep.compose_app_.Screens.ScreenOne
import com.mandeep.compose_app_.Screens.ScreenThree
import com.mandeep.compose_app_.Screens.ScreenTwo

@Composable
fun setUpNavGraph(navHostController: NavHostController)
{
    NavHost(navController = navHostController, startDestination = "ScreenOne"){

        composable("ScreenOne"){
            ScreenOne(navHostController)
        }
        composable("ScreenTwo"){
            ScreenTwo(navHostController)
        }
        composable("ScreenThree"){
            ScreenThree(navHostController)
        }
        composable("ScreenFour"){
            ScreenFour(navHostController)
        }
    }

}