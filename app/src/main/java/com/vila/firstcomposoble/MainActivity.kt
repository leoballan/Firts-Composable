package com.vila.firstcomposoble

import android.opengl.Visibility
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.vila.firstcomposoble.ui.theme.FirstComposobleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposobleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android","Leo")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,salute:String) {
    Column(){
    Row (modifier = Modifier.padding(8.dp)){
        Image(painter = painterResource(
            id = R.drawable.ic_tractor),
            contentDescription ="Red bar code",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .padding(8.dp)
            )

        textForColum(name,salute)

        Image(painter = painterResource(
            id = R.drawable.ic_tractor),
            contentDescription ="Red bar code",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .padding(8.dp)
        )
        
    }
        Row(modifier = Modifier.padding(4.dp)) {
            OutlinedButton(modifier = Modifier.padding(4.dp),
                onClick = {
                sumar(1,2)

            }) {
                clickButton("Press")
            }
          textForColum(name,salute)
        }
   }

}

private fun sumar(num1:Int,num2:Int) :Int{

    return num1 + num2
}

@Composable
fun textForColum(name: String,salute:String){
    Column(){
        Text(text = "Hello $name!"
            ,modifier = Modifier.wrapContentWidth())
        Text(text = "I am $salute"
            ,modifier = Modifier.align(Alignment.CenterHorizontally))
    }
}


@Composable
fun clickButton(texto:String){
    Text(text = texto)
}

@Preview
@Composable
fun DefaultPreview() {
    FirstComposobleTheme {
        Greeting("Android","Leo")
    }



}