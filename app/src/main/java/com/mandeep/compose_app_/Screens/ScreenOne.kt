package com.mandeep.compose_app_.Screens

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.NavHostController


@Composable
fun ScreenOne(navHostController: NavHostController){



    Column {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter){
            Text("ScreenOne", color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter){
            Button(onClick = {
               // navHostController.popBackStack()
                navHostController.navigate("ScreenTwo")
            }){
                Text("Go to Screen 2")
            }
        }
    }
}