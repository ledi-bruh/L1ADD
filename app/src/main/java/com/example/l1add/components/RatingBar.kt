package com.example.l1add.components

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.min
import kotlin.math.max
import kotlin.math.pow

@Composable
fun RatingBar(
    rating: Float,
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier) {
        val filteredRating = max(0.0f, min(5.0f, rating))
        val fullStars = filteredRating.toInt()
        val partialStar = (filteredRating - fullStars)
        val emptyStars = 5 - (fullStars + if (partialStar > 10f.pow(-6)) 1 else 0)

        repeat(fullStars) {
            Icon(
                imageVector = Icons.Rounded.Star,
                contentDescription = "rating star",
                tint = Color.Yellow
            )
        }
        if (partialStar > 0) {
            Box {
                Icon(
                    imageVector = Icons.Rounded.Star,
                    contentDescription = "rating star",
                    tint = Color.Yellow,
                )
                Icon(
                    imageVector = Icons.Rounded.Star,
                    contentDescription = "rating star",
                    tint = Color.Gray,
                    modifier = Modifier.drawWithContent {
                        clipRect(
                            left = size.width * (0.14f + 0.75f * partialStar)
                        ) {
                            this@drawWithContent.drawContent()
                        }
                    }
                )
            }
        }
        repeat(emptyStars) {
            Icon(
                imageVector = Icons.Rounded.Star,
                contentDescription = "rating star",
                tint = Color.Gray
            )
        }
    }
}

@Preview
@Composable
fun RatingBarPreview() {
    RatingBar(rating = 4.83f)
}
