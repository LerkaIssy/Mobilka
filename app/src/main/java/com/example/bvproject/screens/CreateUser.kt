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
fun CreateUser(/*navHost: NavHostController*/) {
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


            Row(
                modifier = Modifier
                    .fillMaxWidth(1F)
                    .padding(top = 24.dp, end = 24.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceAround,
                verticalAlignment = Alignment.CenterVertically

            )
            {


Box()
{

    Text(
        text = "Создание карты ",
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Left
    )
    Text(
        modifier = Modifier

            .padding(top = 32.dp),
        text = "пациента",
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Left
    )
}
                Box(/*modifier = Modifier

                    .padding(top = 24.dp, end = 24.dp)*/)
                {
                    Text(
                        text = "Пропустить",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        color = Color(0xFF1A6FEE),

                        )
                }

            }

            Box(
                modifier = Modifier
                    .fillMaxWidth(1F)
                    .padding( end = 30.dp, start = 24.dp),
                contentAlignment = Alignment.CenterStart


            )
            {

                    Text(
                        text = "Без карты пациента вы не сможете заказать анализы.",
                        fontSize = 19.sp,
                        color = Color(0xFF7E7E9A),
                        textAlign = TextAlign.Justify

                    )
                Text(
                    text = "В картах пациентов будут храниться результаты анализов вас и ваших близких.",
                    fontSize = 19.sp,
                    color = Color(0xFF7E7E9A),
                    modifier = Modifier.padding(top = 140.dp),
                    textAlign = TextAlign.Justify

                )
                }

            }
        }
    }


//https://github.com/StephenVinouze/SegmentedProgressBar/blob/main/app/src/main/java/com/stephenvinouze/sample/MainActivity.kt
