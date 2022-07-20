package com.mandeep.compose_app_.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun ScreenThree(navHostController: NavHostController) {
    Column {
        Button(onClick = {navHostController.navigate("ScreenFour")}){
            Text("Go to Screen 4")
        }
    }
}