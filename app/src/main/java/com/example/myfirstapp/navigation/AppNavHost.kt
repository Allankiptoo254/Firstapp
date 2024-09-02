package com.example.myfirstapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bramwel.myapp.ui.theme.screens.intent.IntentScreen
import com.example.myfirstapp.ui.theme.screens.Calculator.CalculatorScreen
import com.example.myfirstapp.ui.theme.screens.home.Myhomescreen
import com.example.myfirstapp.ui.theme.screens.login.LoginScreen
import com.example.myfirstapp.ui.theme.screens.register.RegisterScreen

/**
 * Sets up the navigation host for the app.
 *
 * This function defines the main navigation structure of the application,
 * specifying the routes and corresponding composable screens. It uses
 * `NavHost` to manage and display the different screens based on the
 * current navigation state.
 *
 * @param modifier A [Modifier] for adjusting layout or behavior of the NavHost.
 * @param navController A [NavHostController] used to manage navigation between screens.
 * @param startDestination The route of the initial screen when the app is launched.
 */
@Composable
fun AppNavHost(modifier: Modifier = Modifier,navController: NavHostController= rememberNavController(),startDestination:String=ROUTE_HOME) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUTE_HOME){
            Myhomescreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUTE_REGISTER){
            RegisterScreen()
        }

        composable(ROUTE_INTENT){
            IntentScreen()
        }
        composable(ROUTE_CALC){
            CalculatorScreen()
        }

    }



}




