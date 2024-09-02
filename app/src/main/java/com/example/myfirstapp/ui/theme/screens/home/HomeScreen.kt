package com.example.myfirstapp.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myfirstapp.navigation.ROUTE_CALC
import com.example.myfirstapp.navigation.ROUTE_INTENT
import com.example.myfirstapp.navigation.ROUTE_LOGIN
import com.example.myfirstapp.navigation.ROUTE_REGISTER


@Composable
fun Myhomescreen(navController: NavHostController) {
     Column (verticalArrangement = Arrangement.Center,
             horizontalAlignment = Alignment.CenterHorizontally,
             modifier = Modifier
                 .fillMaxSize()
                 .background(Color.Cyan))
     {


         Text(
             text = "This is my first app",
             color = Color.Magenta,
             fontSize = 30.sp,
             fontFamily = FontFamily.Cursive
         )
         Spacer(modifier = Modifier.height(30.dp))
         Text(
              text = "Allan's Ecommerce App",
              color= Color.Red,
              fontSize = 20.sp,
              fontFamily = FontFamily.Serif

         )
         Button(onClick = {
             navController.navigate(ROUTE_LOGIN)
         },
         modifier = Modifier.fillMaxWidth()) {

         Text(text="Login",
             color = Color.Magenta,
             fontSize = 25.sp,
             fontFamily =  FontFamily.Monospace,
             fontWeight = FontWeight.ExtraBold
         )

         }
         Spacer(modifier = Modifier.height(30.dp))
         Button(onClick = {
             navController.navigate(ROUTE_REGISTER)
         },
             modifier = Modifier.fillMaxWidth()){
             Text(text = "Register",
                  color = Color.Magenta,
                  fontSize= 25.sp,
                  fontFamily=FontFamily.Monospace,
                  fontWeight = FontWeight.ExtraBold
                 )
         }
         Spacer(modifier = Modifier.height(30.dp))

         Button(onClick = {
             navController.navigate(ROUTE_CALC)
         },
             modifier = Modifier.fillMaxWidth()){
             Text(text = "Calculator",
                 
                 color = Color.Magenta,
                 fontSize = 25.sp,
                 fontFamily = FontFamily.Monospace)
         }
         Spacer(modifier = Modifier.height(30.dp))

         Button(onClick = {
             navController.navigate(ROUTE_INTENT)

         },
            modifier = Modifier.fillMaxWidth()){
             Text(text = "Intent",
                 color = Color.Magenta,
                 fontSize = 25.sp,
                 fontFamily = FontFamily.Monospace)
         }
     }
                 }

@Preview
@Composable
private fun HomeScreenPreview(){
     Myhomescreen(rememberNavController())
}
