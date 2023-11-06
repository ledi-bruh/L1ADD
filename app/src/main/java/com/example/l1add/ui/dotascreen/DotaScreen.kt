package com.example.l1add.ui.dotascreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun DotaScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            state = LazyListState(),
            modifier = Modifier.fillMaxSize(),
        ) {
            item {
                DotaScreenHeader()
            }
            item {
                DotaGameTypes(
                    listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
                    Modifier.padding(top = 16.dp))
            }
            item {
                // video and pictures
            }
            item {
                // rating
            }
            item {
                // comments
            }
            item {
                // button
            }
        }
    }
}
