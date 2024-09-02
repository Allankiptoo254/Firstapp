package com.example.myfirstapp.ui.theme.screens.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RegisterScreen(){
    var firstname  by remember{ mutableStateOf(TextFieldValue("")) }
    var lastname  by remember{ mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue(""))}
    var age by remember { mutableStateOf(TextFieldValue(""))}
    var pass by remember{ mutableStateOf(TextFieldValue(""))}
    var confirmpass by remember { mutableStateOf(TextFieldValue(""))}

    Column (verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(color = Black))
    {
     Text(text = "Register Here",
          color=Color.White,
          fontSize = 40.sp,
          fontFamily = FontFamily.SansSerif,
          )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = firstname,
            onValueChange ={firstname=it},
            label = { Text(text = "First Name",
                color = Color.White,
                fontSize = 20.sp)},

            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = lastname,
            onValueChange = {lastname=it},
            label = { Text(text = "Last Name",
                color = Color.White,
                fontSize =20.sp)},

            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value =email,
               onValueChange = {email=it},
               label = { Text(text = "Email",
                   color = Color.White,
                   fontSize = 20.sp)},

           modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = pass,
            onValueChange = {pass=it},
            label = { Text(text = "Create Password",
                color = Color.White,
                fontSize = 20.sp)},

          modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = confirmpass,
            onValueChange = {confirmpass=it},
            label = { Text(text = "Confirm password",
                color = Color.White,
                fontSize = 20.sp)},

          modifier = Modifier.fillMaxWidth())



    }

}

@Preview
@Composable
private fun Myregisterscreen() {
      RegisterScreen()

}