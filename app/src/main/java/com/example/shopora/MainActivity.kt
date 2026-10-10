package com.example.shopora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.shopora.ui.ShoporaHomeScreen
import com.example.shopora.ui.theme.ShoporaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShoporaTheme {
                ShoporaHomeScreen()
            }
        }
    }
}
