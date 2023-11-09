package com.example.l1add.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun RatingBar(
    rating: Double,
    modifier: Modifier = Modifier,
) {
    // TODO:
    Text(
        text = rating.toString(),
        modifier = modifier,
    )
}
