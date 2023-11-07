package com.example.l1add.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.l1add.ui.theme.L1ADDTheme

@Composable
fun ReviewRatingsBlock(
    rating: Double,
    reviews: String,
    modifier: Modifier = Modifier,
) {
    Row(modifier) {
        Text(
            text = rating.toString(),
            style = L1ADDTheme.TextStyle.bold(48.sp, 57.6.sp),
            color = L1ADDTheme.TextColors.title,
        )
        Column(
            modifier = Modifier.padding(
                start = 16.dp,
                top = 17.dp,
                bottom = 7.dp,
            )
        ) {
            RatingBar(
                rating = rating,
                modifier = Modifier
                    .size(
                        width = 76.dp,
                        height = 12.dp,
                    )
            )
            Text(
                text = "$reviews Reviews",
                style = L1ADDTheme.TextStyle.regular(12.sp, 14.4.sp),
                color = L1ADDTheme.TextColors.reviews,
            )
        }
    }
}
