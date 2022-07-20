package com.mandeep.compose_app_.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ScreenTwo(navHostController: NavHostController) {

    Column {

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter){
            Text("ScreenTwo", color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter){
            Button(onClick = {
                navHostController.popBackStack("ScreenOne",false)
                navHostController.navigate("ScreenThree")
            }){
                Text("Go to Screen 3")
            }
        }

    }
}