package com.example.newscomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.newscomposeapplication.presentation.onboard.components.OnBoardingPage
import com.example.newscomposeapplication.presentation.onboard.onBoardingPagesListData
import com.example.newscomposeapplication.presentation.onboard.ui.OnBoardingScreen
import com.example.newscomposeapplication.ui.theme.NewsComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            NewsComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    OnBoardingScreen()
                }
            }
        }
    }
}