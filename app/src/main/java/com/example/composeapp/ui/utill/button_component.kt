package com.example.composeapp.ui.utill


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.R


@Composable
fun ButtonComponent(
    modifier: Modifier=Modifier,
    text:String= stringResource(id = R.string.get_started),
    backGroundColor:Color= Color.White,
    foregroundColor:Color= Color.Black,
    elevation: ButtonElevation=ButtonDefaults.elevatedButtonElevation(0.dp),
    colors: ButtonColors=ButtonDefaults.buttonColors(containerColor = backGroundColor),
    onClick:()->Unit
)
{
     Button(onClick=onClick,modifier=modifier.fillMaxWidth(),
     shape = RoundedCornerShape(100.dp),
         elevation = elevation,
         colors = colors
     ){

         Text(text = text, style = TextStyle(color = foregroundColor, fontSize = 16.sp, fontWeight = FontWeight.Bold))
     }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

        ButtonComponent( modifier = Modifier
            .padding(20.dp)
            .height(60.dp)){

        }

}

@Composable
fun ButtonComponent2(
    modifier: Modifier = Modifier,
    text: String = stringResource(id = R.string.get_started),
    backgroundColor: Color = Color.White,
    foregroundColor: Color = Color.Black,
    elevation: ButtonElevation = ButtonDefaults.elevatedButtonElevation(0.dp),
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = backgroundColor
    ),
    onClick: () -> Unit
) {

    Button(
        onClick = onClick, modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(100.dp),
        elevation = elevation,
        colors = colors
    ) {
        Text(
            text = text, style = TextStyle(
                color = foregroundColor,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }

}
