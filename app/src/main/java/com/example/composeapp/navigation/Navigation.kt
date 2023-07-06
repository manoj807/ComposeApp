package com.example.composeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeapp.screens.ChatScreen
import com.example.composeapp.screens.HomeScreen
import com.example.composeapp.screens.StartScreen

@Composable
fun MainNavigation()
{

  val navController= rememberNavController()

  NavHost(navController = navController, startDestination = START_SCREEN )
  {
    composable(START_SCREEN)
    {
      StartScreen(navController)
    }

    composable(HOME_SCREEN)
    {
      HomeScreen(navController)
    }

    composable(CHAT_SCREEN)
    {
      ChatScreen(navController)
    }

  }


}






const val START_SCREEN = "Start screen"
const val HOME_SCREEN = "Home screen"
const val CHAT_SCREEN = "Char screen"