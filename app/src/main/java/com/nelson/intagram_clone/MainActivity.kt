package com.nelson.intagram_clone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nelson.intagram_clone.ui.theme.Intagram_cloneTheme
import com.nelson.intagram_clone.ui.theme.profilePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Intagram_cloneTheme {

                profilePage()

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Intagram_cloneTheme {
        profilePage()
    }
}