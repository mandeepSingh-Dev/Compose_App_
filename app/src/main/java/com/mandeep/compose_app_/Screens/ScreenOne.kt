package com.mandeep.compose_app_.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun ScreenOne(navHostController: NavHostController){

    Column {
        Button(onClick = {navHostController.navigate("ScreenTwo")}){
            Text("Go to Screen 2")
        }
    }
}