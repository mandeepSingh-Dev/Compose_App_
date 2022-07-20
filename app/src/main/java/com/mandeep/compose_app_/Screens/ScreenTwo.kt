package com.mandeep.compose_app_.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun ScreenTwo(navHostController: NavHostController) {

    Column {
        Button(onClick = {navHostController.navigate("ScreenThree")}){
            Text("Go to Screen 3")
        }
    }
}