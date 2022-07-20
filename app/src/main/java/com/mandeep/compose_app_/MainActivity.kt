package com.mandeep.compose_app_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.mandeep.compose_app_.Navigation.setUpNavGraph

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            MaterialTheme {
                val navHostController = rememberNavController()
                setUpNavGraph(navHostController)
                Log.d("difndfd","dkvfhdf")
            }
        }
    }


    @Composable
    fun hellp(){
        Column {
            Button(onClick = {}){
                Text("Go to Screen 2")
            }
        }
    }


    @Preview
    @Composable
    fun preview1(){
        hellp()
    }

}