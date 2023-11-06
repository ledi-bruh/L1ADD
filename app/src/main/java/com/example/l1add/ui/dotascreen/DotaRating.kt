package com.example.l1add.ui.dotascreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.l1add.R
import com.example.l1add.components.RatingBar
import com.example.l1add.ui.theme.L1ADDTheme

@Composable
fun DotaRating(rating: Double, modifier: Modifier = Modifier) {
    Row(modifier) {
        RatingBar(
            rating = rating,
            modifier = modifier
                .height(14.dp)
                .width(76.dp)
        )
        Text(
            text = stringResource(R.string.n_downloads),
            style = L1ADDTheme.TextStyle.Regular_12,
            color = L1ADDTheme.TextColors.downloads,
            modifier = modifier.padding(start = 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DotaRatingPreview() {
    DotaRating(rating = 4.9)
}
