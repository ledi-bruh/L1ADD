package com.example.l1add.ui.dotascreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.ui.Modifier
import com.example.l1add.ui.theme.L1ADDTheme


@Preview
@Composable
fun DotaScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box {
            Text(text = "555")
        }
        Box {
            Column {
                Text(
                    text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own."
                )
//                LazyRow(content = )

                Box {
                    Button(
                        onClick = {},
//                        modifier = Modifier.background(color = InstallButton),
                    ){
                        Text(text = "Install")
                    }
                }
            }
        }
    }
}
