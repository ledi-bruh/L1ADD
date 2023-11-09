package com.example.l1add.ui.dotascreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.l1add.R
import com.example.l1add.components.ReviewRatingsBlock
import com.example.l1add.ui.theme.L1ADDTheme

@Composable
fun DotaReviewRatings(modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(
            text = stringResource(R.string.review_and_ratings),
            style = L1ADDTheme.TextStyle.bold(16.sp, 19.sp),
            color = L1ADDTheme.TextColors.reviewRatings,
        )
        ReviewRatingsBlock(
            rating = 4.73f,
            reviews = "70M",
            modifier = Modifier.padding(top = 12.dp),
        )
    }
}

@Preview
@Composable
fun DotaReviewRatingsPreview() {
    DotaReviewRatings()
}
