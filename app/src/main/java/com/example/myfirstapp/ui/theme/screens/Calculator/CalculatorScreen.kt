package com.example.myfirstapp.ui.theme.screens.Calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorScreen() {
    var firstnum by remember { mutableStateOf(TextFieldValue("")) }
    var secondnum by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(16.dp)
    ) {
        Text(text = answer,
            color = Color.Black,
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = firstnum,
            label = { Text("Enter First No", color = Color.White) },
            textStyle = TextStyle(color = Color.Black, fontSize = 18.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = { firstnum = it }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = secondnum,
            label = { Text("Enter Second No", color = Color.White) },
            textStyle = TextStyle(color = Color.Black, fontSize = 18.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = { secondnum = it }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedButton(
            onClick = {
                val myfirstnum = firstnum.text.trim()
                val mysecondnum = secondnum.text.trim()
                if (myfirstnum.isEmpty() || mysecondnum.isEmpty()) {
                    answer = "Please fill in all details"
                } else {
                    val myanswer = myfirstnum.toDouble() + mysecondnum.toDouble()
                    answer = myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "+", fontSize = 30.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedButton(
            onClick = {
                val myfirstnum = firstnum.text.trim()
                val mysecondnum = secondnum.text.trim()
                if (myfirstnum.isEmpty() || mysecondnum.isEmpty()) {
                    answer = "Please fill in all details"
                } else {
                    val myanswer = myfirstnum.toDouble() - mysecondnum.toDouble()
                    answer = myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "-", fontSize = 30.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedButton(
            onClick = {
                val myfirstnum = firstnum.text.trim()
                val mysecondnum = secondnum.text.trim()
                if (myfirstnum.isEmpty() || mysecondnum.isEmpty()) {
                    answer = "Please fill in all details"
                } else {
                    val myanswer = myfirstnum.toDouble() * mysecondnum.toDouble()
                    answer = myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "*", fontSize = 30.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedButton(
            onClick = {
                val myfirstnum = firstnum.text.trim()
                val mysecondnum = secondnum.text.trim()
                if (myfirstnum.isEmpty() || mysecondnum.isEmpty()) {
                    answer = "Please fill in all details"
                } else {
                    val myanswer = myfirstnum.toDouble() / mysecondnum.toDouble()
                    answer = myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "/", fontSize = 30.sp, color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CalcPreview() {
    CalculatorScreen()
}