package com.example.bvproject.screens

import android.widget.Toast
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
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
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
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import com.example.bvproject.R

@Preview
@Composable
fun CreateUser(/*navHost: NavHostController*/) {
    Column(modifier = Modifier.fillMaxSize(1f)) {
        val context = LocalContext.current
        val sex = arrayOf("Женский", "Мужской")
        var expanded by remember { mutableStateOf(false) }
        var selectedText by remember { mutableStateOf(sex[0]) }
        var flag = remember {
            mutableStateOf(false)
        }
        var userName: String by rememberSaveable { mutableStateOf("") }
        var userSurname: String by rememberSaveable { mutableStateOf("") }
        var userPatronymic: String by rememberSaveable { mutableStateOf("") }
        var userDate: String by rememberSaveable { mutableStateOf("") }
        var mTextFieldSize by remember { mutableStateOf(Size.Zero)}
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize(1F)
                .background(Color.White)

        ) {


            Row(
                modifier = Modifier
                    .fillMaxWidth(1F)
                    .padding(top = 24.dp, end = 24.dp, start = 10.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically

            )
            {


Box()
{

    Text(
        text = "Создание карты ",
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Left
    )
    Text(
        modifier = Modifier

            .padding(top = 32.dp),
        text = "пациента",
        fontSize = 26.sp,
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
                        textAlign = TextAlign.Right,
                        color = Color(0xFF1A6FEE),

                        )
                }

            }

           /* Row(
                modifier = Modifier
                    .fillMaxWidth(1F)
                    .padding( start = 10.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically

            )
            {
                Text(
                    text = "Без карты пациента вы не сможете заказать анализы.",
                    fontSize = 16.sp,
                    color = Color(0xFF7E7E9A),
                    modifier = Modifier.padding(top = 160.dp)
                )

                Text(
                    text = " В картах пациентов будут храниться результаты анализов вас и ваших близких.",
                    fontSize = 16.sp,
                    color = androidx.compose.ui.graphics.Color(0xFF7E7E9A),
                    modifier = androidx.compose.ui.Modifier.padding(top = 160.dp)
                )
            }*/


    Box(
        modifier = Modifier
            .fillMaxWidth(1F)
            .padding(end = 24.dp, start = 24.dp),
        contentAlignment = Alignment.CenterStart


    )
    {



        Column (verticalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize(1f)) {



            Box(
            modifier = Modifier

                .fillMaxWidth(1f)
        )
        {
            CustomName(search = userName, onValueChange = { it ->
                userName = it
            })
        }

            Box(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(1f)
            )
            {
                CustomPatronymic(search = userPatronymic, onValueChange = { it ->
                    userPatronymic = it
                })
            }
            Box(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(1f)
            )
            {
                CustomSurname(search = userSurname, onValueChange = { it ->
                    userSurname = it
                })
            }
            Box(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(1f)
            )
            {
                CustomDate(search = userDate, onValueChange = { it ->
                    userDate = it
                })
            }
            Box(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(1f)
                    .clip(RoundedCornerShape(10.dp))

            ) {
                ExposedDropdownMenuBox(
                    expanded = expanded,
                    onExpandedChange = {
                        expanded = !expanded
                    }
                ) {
                    TextField(
                        value = selectedText,
                        onValueChange = {},
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0XFFF5F5F9),
                            focusedIndicatorColor = Color.Black,
                            focusedTextColor = Color.Black,
                            disabledIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            cursorColor = Color(0XFFEBEBEB),
                        ),
                        readOnly = true,
                        trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                        modifier = Modifier
                            .menuAnchor()
                            .fillMaxWidth()
                            .onGloballyPositioned { coordinates ->
                                // This value is used to assign to
                                // the DropDown the same width
                                mTextFieldSize = coordinates.size.toSize()}
                            .size(64.dp),
                        label = {Text("Пол")}
                    )

                    ExposedDropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false }
                    ) {
                        sex.forEach { item ->
                            DropdownMenuItem(
                                text = { Text(text = item) },
                                onClick = {
                                    selectedText = item
                                    expanded = false
                                    Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
                                }


                            )
                        }
                    }
                }
            }
            flag.value=userName.isNotEmpty()
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
                    .padding(top = 50.dp)
                    .fillMaxWidth(1f)
            ) {
                Button(

                    shape = RoundedCornerShape(10.dp),
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .size(64.dp),
                    colors = color
                )
                {
                    Text("Создать", fontSize = 23.sp)
                }
            }


        }
}
            }
        }
    }



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomName(
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
                    text = "Имя",
                    color = Color(0xFF7E7E9A)
                )
            }
        )

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomSurname(
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
                    text = "Фамилия",
                    color = Color(0xFF7E7E9A)
                )
            }
        )

    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomPatronymic(
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
                    text = "Отчество",
                    color = Color(0xFF7E7E9A)
                )
            }
        )

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomDate(
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
                    text = "Дата рождения",
                    color = Color(0xFF7E7E9A)
                )
            }
        )

    }
}
//https://github.com/StephenVinouze/SegmentedProgressBar/blob/main/app/src/main/java/com/stephenvinouze/sample/MainActivity.kt
