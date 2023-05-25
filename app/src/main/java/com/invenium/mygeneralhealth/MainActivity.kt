package com.invenium.mygeneralhealth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.invenium.mygeneralhealth.data.graphs.RootNavigationGraph
import com.invenium.mygeneralhealth.ui.theme.MyGeneralHealthTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyGeneralHealthTheme {
                RootNavigationGraph(navController = rememberNavController())
            }
        }
    }
}
