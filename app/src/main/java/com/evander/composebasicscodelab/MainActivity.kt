package com.evander.composebasicscodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.evander.composebasicscodelab.ui.theme.ComposeBasicsCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicsCodelabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

//Row(modifier = modifier.padding(24.dp)) {
//    Column(
//        modifier = modifier.weight(1f)
//    ) {
//        Text(text = "Hello")
//        Text(text = name)
//    }
//    ElevatedButton(onClick = { /*TODO*/ }) {
//        Text("Show more")
//    }
//
//}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
        ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(24.dp)
            ) {
                Row(modifier = modifier) {
                    Text(text = "Hello")
                    Text(text = name, modifier=modifier.weight(1f))
                    ElevatedButton(onClick = { /*TODO*/ }) {
                        Text("Show more")
                    }
                }

            }



    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun GreetingPreview() {
    ComposeBasicsCodelabTheme {
        Loopable()
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier){
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
        ) {
        Greeting("Android")

    }
}

@Composable
fun Loopable(modifier: Modifier = Modifier,
             names: List<String> = listOf("World", "Compose")){
  Column(modifier = modifier.padding(vertical = 4.dp)){
      for (name in names){
          Greeting(name = name)
      }
  }
}

