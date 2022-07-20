package com.mandeep.compose_app_.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ScreenFour(navHostController: NavHostController) {

    Column {

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter){
            Text("ScreenFour", color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter){
            Button(onClick = {
                navHostController.popBackStack("ScreenOne",false)
                navHostController.navigate("ScreenOne")
            }){
                Text("Go to Screen 1")
            }
        }

    }
}

@Composable
fun sample(){
    Column {

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter){
            Text("ScreenFour", color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter){
            Button(onClick = {
//                navHostController.popBackStack("ScreenOne",false)
//                navHostController.navigate("ScreenOne")
            }){
                Text("Go to Screen 1")
            }
        }

    }
}
@Preview
@Composable
fun preview(){
    sample()
   // ScreenFour(navHostController = reme)
}