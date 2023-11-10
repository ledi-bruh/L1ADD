package com.example.l1add.ui.dotascreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.l1add.components.RatingBar
import com.example.l1add.ui.theme.L1ADDTheme

@Composable
fun DotaRating(rating: Float, modifier: Modifier = Modifier) {
    Row(modifier) {
        RatingBar(
            rating = rating,
            modifier = Modifier
                .height(14.dp)
                .width(76.dp)
        )
        Text(
            text = "70M",
            style = L1ADDTheme.TextStyle.regular(12.sp, 14.sp),
            color = L1ADDTheme.TextColors.downloads,
            modifier = Modifier.padding(start = 10.dp)
        )
    }
}

@Preview
@Composable
fun DotaRatingPreview() {
    DotaRating(rating = 3.69f)
}
