package com.example.l1add.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


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
