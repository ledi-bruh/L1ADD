package com.example.l1add.ui.dotascreen

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.l1add.R
import com.example.l1add.ui.theme.L1ADDTheme

@Composable
fun DotaScreenHeader(
    painter: Painter,
    modifier: Modifier = Modifier,
) {
    Box(modifier) {
        Image(
            painter = painter,
            contentDescription = "dota_background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(294.dp)
        )
        DotaScreenTitle(Modifier
            .padding(start = 24.dp, top = 274.dp)
        )
    }
}

@Preview
@Composable
fun DotaScreenHeaderPreview() {
    Surface(color = L1ADDTheme.BgColors.dark) {
        DotaScreenHeader(painterResource(R.drawable.dota_backgroud))
    }
}
