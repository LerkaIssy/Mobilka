package com.example.bvproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bvproject.screens.CreatePassword
import com.example.bvproject.screens.CreateUser
import com.example.bvproject.screens.EmailCod
import com.example.bvproject.screens.Login
import com.example.bvproject.screens.SplashScreen

/*Класс для перемещения по страницам*/
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,//контроллер реагирующий и отвечающий за перемещения
        startDestination = "splashScreen")
    {
        //Для каждой страницы задается route - для дальнейшего обращения к ней
        //и указывается метод для запуска с переданными параметрами
        composable("splashScreen"){
            SplashScreen(navController)
        }
        composable("logInScreen"){
            Login(navController)
        }
        composable("EmailCod"){
            EmailCod(navController)
        }
        composable("CreatePassword"){
            CreatePassword(navController)
        }
        composable("CreateUser"){
            CreateUser(navController)
        }
    }
}
