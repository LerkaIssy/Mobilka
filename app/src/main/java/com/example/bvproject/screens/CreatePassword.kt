package com.example.bvproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bvproject.R

@Preview
@Composable
fun CreatePassword(/*navHost: NavHostController*/) {
    Column(modifier = Modifier.fillMaxSize(1f)) {
        var flag = remember {
            mutableStateOf(false)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            modifier = Modifier
                .fillMaxSize(1F)
                .background(Color.White)
                .padding(bottom = 50.dp)
        ) {


            Box(
                modifier = Modifier
                    .fillMaxWidth(1F)
                    .padding(top = 24.dp, end = 30.dp),
                contentAlignment = Alignment.BottomEnd


            )
            {
                Text(
                    text = "Пропустить",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0xFF1A6FEE),

                )
            }
            Box(
                modifier = Modifier
                    .padding(top = 24.dp),
                contentAlignment = Alignment.Center

            )
            {
                Text(
                    text = "Создайте пароль",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Для защиты ваших персональных данных",
                    fontSize = 15.sp,
                    color = Color(0xFF7E7E9A),
                    modifier = Modifier.padding(top = 80.dp),
                    textAlign = TextAlign.Center

                )


                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(top = 20.dp, start = 30.dp, end = 30.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                )
                {

                }
            }





            Column(

                modifier = Modifier
                    .padding(top = 24.dp)
                    .fillMaxHeight(1f),
                verticalArrangement = Arrangement.SpaceEvenly


            )
            {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                )
                {
                    Button(

                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier

                            .size(90.dp)
                    )
                    {
                        Text("1", fontSize = 32.sp)
                    }
                    Button(

                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier

                            .size(90.dp)
                    )
                    {
                        Text("2", fontSize = 32.sp)
                    }
                    Button(

                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier

                            .size(90.dp)
                    )
                    {
                        Text("3", fontSize = 32.sp)
                    }

                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                )
                {
                    Button(

                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier

                            .size(90.dp)
                    )
                    {
                        Text("4", fontSize = 32.sp)
                    }
                    Button(

                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier

                            .size(90.dp)
                    )
                    {
                        Text("5", fontSize = 32.sp)
                    }
                    Button(

                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier

                            .size(90.dp)
                    )
                    {
                        Text("6", fontSize = 32.sp)
                    }
                }
                Row(
                        modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
                )
                {
                    Button(

                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier

                            .size(90.dp)
                    )
                    {
                        Text("7", fontSize = 32.sp)
                    }
                    Button(

                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier

                            .size(90.dp)
                    )
                    {
                        Text("8", fontSize = 32.sp)
                    }
                    Button(

                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier

                            .size(90.dp)
                    )
                    {
                        Text("9", fontSize = 32.sp)
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                )
                {
                    Button(

                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.Transparent
                        ),
                        modifier = Modifier

                            .size(90.dp)
                    )
                    {
                        Text("7", fontSize = 32.sp)
                    }
                    Button(

                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier

                            .size(90.dp)
                    )
                    {
                        Text("0", fontSize = 32.sp)
                    }
                    Button(

                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.Transparent
                        ),
                        modifier = Modifier

                            .size(107.dp)
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.delete),
                            contentDescription = "image",
                            contentScale = ContentScale.Fit,

                            modifier = Modifier

                                .size(46.dp)


                        )
                    }
                }
            }
        }
    }
}
//https://github.com/StephenVinouze/SegmentedProgressBar/blob/main/app/src/main/java/com/stephenvinouze/sample/MainActivity.kt
