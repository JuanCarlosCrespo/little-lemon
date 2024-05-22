package com.example.littlelemon

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Onboarding(){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .background(Color.White),
            verticalArrangement = Arrangement.Top
            //horizontalAlignment  = Alignment.CenterHorizontally
        ) {
            Header()

            Text(
                text = "Let's get to know you",
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(150.dp)
                    .padding(vertical = 20.dp)
                    .background(color = colorResource(R.color.primary1))
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )

            Text(
                text = "Personal information",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            )

            /*Text(
                text = "First Name",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding( top = 5.dp, start = 20.dp, end = 20.dp, bottom = 0.dp)
            )*/

            OutlinedTextField(
                value = "",
                label = { Text("First Name") },
                onValueChange = { newText ->
                },
                textStyle = TextStyle.Default.copy(fontSize = 14.sp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedTextColor = Color.Gray,
                    unfocusedBorderColor = Color.Black,
                    unfocusedLabelColor = Color.Black,
                    unfocusedLeadingIconColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth()
                    .background(Color.White)
                    .padding(top = 5.dp, start = 20.dp, end = 20.dp, bottom = 20.dp)
            )

            OutlinedTextField(
                value = "",
                label = { Text("Last Name") },
                onValueChange = { newText ->
                },
                textStyle = TextStyle.Default.copy(fontSize = 14.sp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedTextColor = Color.Gray,
                    unfocusedBorderColor = Color.Black,
                    unfocusedLabelColor = Color.Black,
                    unfocusedLeadingIconColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth()
                    .background(Color.White)
                    .padding(top = 5.dp, start = 20.dp, end = 20.dp, bottom = 20.dp)
            )

            OutlinedTextField(
                value = "",
                label = { Text("Email") },
                onValueChange = { newText ->
                },
                textStyle = TextStyle.Default.copy(fontSize = 14.sp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedTextColor = Color.Gray,
                    unfocusedBorderColor = Color.Black,
                    unfocusedLabelColor = Color.Black,
                    unfocusedLeadingIconColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth()
                    .background(Color.White)
                    .padding(top = 5.dp, start = 20.dp, end = 20.dp, bottom = 20.dp)
            )
        }

        Row(
            modifier = Modifier
                .weight(1f, false)
        ) {

            OutlinedButton(
                onClick = {},
                border = BorderStroke(2.dp, colorResource(R.color.secondary1)),
                colors = ButtonDefaults
                    .buttonColors(containerColor = colorResource(R.color.primary2)),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.padding(top = 5.dp, start = 20.dp, end = 20.dp, bottom = 40.dp)
            ) {
                Text(
                    text = "Register",
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Composable
fun Header(){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_header),
            contentDescription = "Logo Image",
            modifier = Modifier.fillMaxWidth(1f).padding(top=10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingPreview(){
    Onboarding()
}