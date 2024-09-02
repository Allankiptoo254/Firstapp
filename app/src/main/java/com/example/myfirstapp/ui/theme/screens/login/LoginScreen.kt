package com.example.myfirstapp.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myfirstapp.R

@Composable
fun LoginScreen(navController: NavHostController) {

    var email by remember { mutableStateOf(TextFieldValue("")) }
    var mypass by remember { mutableStateOf(TextFieldValue("")) }
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White))
        


    {

        Image(painter = painterResource(id = R.drawable.manu),
            contentDescription = "Rounder corner image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(128.dp)
                .clip(RoundedCornerShape(10)) // clip to the circle shape
                .border(5.dp, Color.Black, RoundedCornerShape(10)) )

          Text(text = "Login Here!",
              color = Color.Magenta,
              fontSize = 38.sp,
              fontFamily = FontFamily.Monospace
              )

          Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(value = email,
                          onValueChange ={email=it},
                           label = { Text(text = "Enter Email",
                               color = Color.Magenta,
                               fontSize = 20.sp)},

            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(value = mypass,
                          onValueChange = {mypass=it},
                          label = { Text(text = "Enter Password",
                              color = Color.Magenta,
                              fontSize = 20.sp)},
           modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(30.dp))
      Button(onClick = { /*TODO*/ },
          modifier=Modifier.fillMaxWidth()){
          Text(text = "Login",
              color = Color.Magenta,
              fontFamily = FontFamily.Monospace,
              fontSize = 25.sp
          )
      }
     TextButton(onClick = { /*TODO*/ }) {
         Text(text = "Don't have an account?Register",
             color = Color.Black,
             fontFamily = FontFamily.Monospace
         )
         
     }
    }


}

@Preview
@Composable
private fun MyLoginScreen() {
    LoginScreen(rememberNavController())
}