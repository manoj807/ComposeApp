package com.example.composeapp.screens

import android.app.Application
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavHostController
import com.example.composeapp.Greeting
import com.example.composeapp.R
import com.example.composeapp.navigation.HOME_SCREEN
import com.example.composeapp.ui.theme.Aqua
import com.example.composeapp.ui.theme.ComposeAppTheme
import com.example.composeapp.ui.utill.ButtonComponent
import com.example.composeapp.ui.utill.SpaceWidth

@Composable
fun StartScreen(navHostController: NavHostController)
{
  Box(modifier = Modifier
      .fillMaxSize()
      .background(Color.Black) ){
      Image(painter = painterResource(id = R.drawable.background), contentDescription ="", contentScale = ContentScale.FillWidth)

      Box(modifier = Modifier
          .padding(top = 220.dp)
          .background(Color.Black)
          .align(Alignment.Center))
      {
          Column(modifier = Modifier.padding(horizontal = 20.dp, vertical = 40.dp)) {
             Text(text = stringResource(id = R.string.start_with_your_friend),
                 style = TextStyle(fontSize = 36.sp, color = Color.White, fontWeight = FontWeight.Bold))
              CustomCheckBox()
          }



      }




      ButtonComponent(modifier = Modifier
          .padding(20.dp)
          .align(Alignment.BottomCenter)
          .height(60.dp)){
          navHostController.navigate(HOME_SCREEN)
      }


  }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeAppTheme {
        StartScreen(NavHostController(Application()))
    }
}

@Composable
fun CustomCheckBox() {

    Row(modifier = Modifier.padding(vertical = 15.dp)) {
       Box(modifier = Modifier
           .background(Aqua, RoundedCornerShape(
                   topStart = 10.dp, topEnd = 10.dp,
                   bottomStart = 80.dp, bottomEnd = 80.dp
               )
           )
           .size(20.dp), contentAlignment = Alignment.Center)
       {
           Icon( Icons.Default.Check, contentDescription ="", modifier = Modifier.size(15.dp), tint = Color.Black )

       }

        SpaceWidth(20.dp)
        Text(text = stringResource(id = R.string.secure_private_messaging),
            style = TextStyle(color=Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            ))
    }
}



@Composable
fun CustomCheckBox2() {

    Row(
        modifier = Modifier.padding(vertical = 15.dp)
    ) {
        Box(
            modifier = Modifier
                .background(
                    Aqua, RoundedCornerShape(
                        topStart = 10.dp, topEnd = 10.dp, bottomStart = 80.dp, bottomEnd = 80.dp
                    )
                )
                .size(24.dp), contentAlignment = Alignment.Center
        ) {
            Icon(
                Icons.Default.Check,
                contentDescription = "",
                modifier = Modifier.size(15.dp),
                tint = Color.Black
            )
        }
        SpaceWidth(15.dp)
        Text(
            text = stringResource(R.string.secure_private_messaging),
            style = TextStyle(
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }

}

/*@Composable
fun StartScreen(
    navHostController: NavHostController
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Image(
            painter = painterResource(id = R.drawable.background), contentDescription = "",
            contentScale = ContentScale.FillWidth
        )

        Box(
            modifier = Modifier
                .padding(top = 220.dp)
                .background(Color.Black)
                .align(Alignment.Center)

        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 40.dp)
            ) {
                Text(
                    text = stringResource(R.string.stay_with_your_friends),
                    style = TextStyle(
                        fontSize = 36.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                )
                CustomCheckBox()
            }
        }
        ButtonComponent(
            modifier = Modifier
                .padding(20.dp)
                .align(Alignment.BottomCenter)
                .height(60.dp)
        ) {
            navHostController.navigate(HOME_SCREEN)
        }
    }
}


@Composable
fun CustomCheckBox() {

    Row(
        modifier = Modifier.padding(vertical = 15.dp)
    ) {
        Box(
            modifier = Modifier
                .background(
                    Aqua, RoundedCornerShape(
                        topStart = 10.dp, topEnd = 10.dp, bottomStart = 80.dp, bottomEnd = 80.dp
                    )
                )
                .size(24.dp), contentAlignment = Alignment.Center
        ) {
            Icon(
                Icons.Default.Check,
                contentDescription = "",
                modifier = Modifier.size(15.dp),
                tint = Color.Black
            )
        }
        SpacerWidth(15.dp)
        Text(
            text = stringResource(R.string.secure_private_messaging), style = TextStyle(
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }

}*/

