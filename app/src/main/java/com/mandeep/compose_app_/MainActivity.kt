package com.mandeep.compose_app_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
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
}