package com.example.bvproject.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.RectangleShape
import androidx.navigation.NavHostController

@Preview
@Composable
fun Login(navHost: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(1f)) {
        var email: String by rememberSaveable { mutableStateOf("") }
        var flag = remember {
            mutableStateOf(false)
        }
        Column(modifier = Modifier
            .fillMaxSize(1f)
            .background(Color.White)) {
            Box(
                modifier = Modifier.padding(top = 137.dp, start = 27.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "\uD83D\uDD90\uFE0F", fontSize = 28.sp, color = Color(0xFF151515)
                    )
                    Text(
                        text = "Добро пожаловать!",
                        fontSize = 28.sp,
                        fontWeight = W700,
                        color = Color(0xFF151515),
                        modifier = Modifier.padding(start = 10.dp)
                    )
                }
                Text(
                    text = "Войдите, чтобы пользоваться функциями приложения",
                    fontSize = 16.sp,
                    color = Color(0xFF151515),
                    modifier = Modifier.padding(top = 60.dp)
                )
                Text(
                    text = "Вход по E-mail",
                    fontSize = 16.sp,
                    color = Color(0xFF7E7E9A),
                    modifier = Modifier.padding(top = 160.dp)
                )
            }

            Box(
                modifier = Modifier
                    .padding(top = 10.dp, start = 27.dp, end = 27.dp)
                    .fillMaxWidth(1f)
            )
            {
                CustomEmail(search = email, onValueChange = {it->email=it
                })
            }
            flag.value=email.isNotEmpty()
            val color = if(flag.value) ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White

            )
else ButtonDefaults.buttonColors(
                containerColor = Color.LightGray,
                contentColor = Color.White
)



            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 25.dp, start = 27.dp, end = 27.dp)
                    .fillMaxWidth(1f)
            ) {
                Button(

                    shape = RoundedCornerShape(10.dp),
                    onClick = {navHost.navigate("EmailCod")},
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .size(75.dp),
                    colors = color
                )
                {
                    Text("Далее", fontSize = 23.sp)
                }
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 50.dp))
            {

                Text(
                    text = "Или войдите с помощью",
                    fontSize = 16.sp,
                    color = Color(0xFF7E7E9A),
                    modifier = Modifier.padding(top = 20.dp)
                )

                Button(
                    shape = RoundedCornerShape(10.dp),
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(top = 25.dp, start = 27.dp, end = 27.dp)
                        .size(80.dp),
                    border = BorderStroke(1.dp, Color.Gray),
                    colors = ButtonDefaults.outlinedButtonColors (containerColor = Color.White, contentColor = Color.Black
                    )
                )
                {
                    Text("Войти с Яндекс", fontSize = 23.sp)
                }
            }
        }

    }
}



    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun CustomEmail(
        search: String,
        modifier: Modifier = Modifier,
        onValueChange: (String) -> Unit
    ) {
        Box(
            modifier = modifier
                .fillMaxWidth(1f)
                .clip(RoundedCornerShape(10.dp))

        ) {
            TextField(
                value = search,
                onValueChange = onValueChange,
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0XFFF5F5F9),
                    focusedIndicatorColor = Color.Black,
                    focusedTextColor = Color.Black,
                    disabledIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    cursorColor = Color(0XFFEBEBEB),
                ),
                modifier = Modifier
                    .background(Color(0XFFF5F5F9))
                    .fillMaxWidth(1f)
                    .size(64.dp),
                placeholder = {
                    Text(
                        text = "example@mail.ru",
                        color = Color(0xFF7E7E9A)
                    )
                }
            )

        }
    }







