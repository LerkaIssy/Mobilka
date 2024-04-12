package com.example.bvproject.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import com.example.bvproject.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.ticker
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import java.time.LocalDateTime


@Preview
@Composable
fun EmailCod(/*navHost: NavHostController*/) {
    Column(modifier = Modifier.fillMaxSize(1f)) {


        Column(
            modifier = Modifier
                .fillMaxSize(1f)
                .background(Color.White)
        ) {


            Box(
                modifier = Modifier
                    .padding(top = 24.dp, start = 27.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .size(50.dp, 50.dp)
                    .background(Color(0XFFF5F5F9))

            )
            {
                Image(
                    painter = painterResource(id = R.drawable.ic_action_name),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    alpha = 0.6F,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)

                )
            }

        }

    }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 50.dp)
        )
        {
            var email: String by rememberSaveable { mutableStateOf("") }
            Text(
                text = "Введите код из E-mail",
                fontSize = 23.sp,
                fontWeight= FontWeight.Bold
            )
            Row (modifier = Modifier.fillMaxWidth().padding(top = 20.dp,start = 30.dp, end = 30.dp), horizontalArrangement = Arrangement.SpaceEvenly){


                    CustomCode(search = email, onValueChange = { it ->
                        email = it
                    })



                    CustomCode(search = email, onValueChange = { it ->
                        email = it
                    })



                    CustomCode(search = email, onValueChange = { it ->
                        email = it
                    })


                    CustomCode(search = email, onValueChange = { it ->
                        email = it
                    })

            }
            Box(
                Modifier
                    .padding(start = 60.dp, end = 60.dp),
                        contentAlignment = Alignment.Center

            )
            {
                Text(
                    text = "Отправить код повторно можно будет через 59 секунд",
                    fontSize = 16.sp,
                    color = Color(0xFF7E7E9A),
                    modifier = Modifier.padding(top = 20.dp),
                    textAlign = TextAlign.Center


                )

            }
//            val tickerChannel = ticker(delayMillis = 60_000, initialDelayMillis = 0)
//
//            repeat(10) {
//                tickerChannel.receive()
//                val currentTime = LocalDateTime.now()
//                println(currentTime)
//            }
            Text(
                text = "",

                fontSize = 16.sp,
                color = Color(0xFF7E7E9A),
                modifier = Modifier.padding(top = 20.dp)
            )

        }
    }





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomCode(
    search: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {
    Box(
        modifier = modifier
            .size(64.dp, 64.dp)
            .clip(RoundedCornerShape(12.dp))

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
                .size(64.dp, 64.dp),
            placeholder = {
                /*Text(
                    text = "example@mail.ru",
                    color = Color(0xFF7E7E9A)
                    https://dev.to/aniketsmk/kotlin-flow-implementing-an-android-timer-ieo
                )*/
            }
        )

    }

}


//fun main() = runBlocking<Unit> {
//    val tickerChannel = ticker(delayMillis = 100, initialDelayMillis = 0) // create ticker channel
//    var nextElement = withTimeoutOrNull(1) { tickerChannel.receive() }
//    println("Initial element is available immediately: $nextElement")
//}















