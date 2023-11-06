package com.example.l1add.ui.dotascreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.l1add.R
import com.example.l1add.ui.theme.L1ADDTheme

@Composable
fun DotaScreenTitle(modifier: Modifier = Modifier) {
    Box(modifier) {
        Row {
            Box(modifier.padding(bottom = 7.dp)) {
                DotaLogo()
            }
            Column(modifier
                .padding(start = 12.dp, top = 34.dp)
            ) {
                Text(
                    text = stringResource(R.string.dota_title),
                    color = L1ADDTheme.TextColors.title,
                    style = L1ADDTheme.TextStyle.Bold_20,
                )
                DotaRating(
                    rating = 4.9,
                    modifier = modifier.padding(top = 6.dp),
                )
            }
        }
    }
}

@Preview
@Composable
fun DotaScreenTitlePreview() {
    DotaScreenTitle()
}
