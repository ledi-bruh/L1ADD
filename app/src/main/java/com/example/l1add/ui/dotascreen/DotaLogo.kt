package com.example.l1add.ui.dotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.l1add.R
import com.example.l1add.ui.theme.L1ADDTheme

@Composable
fun DotaLogo(modifier: Modifier = Modifier) {
    Box(modifier
        .size(88.dp)
        .clip(RoundedCornerShape(14.dp))
        .background(color = L1ADDTheme.BgColors.logo_border)
    ) {
        Box(modifier
            .size(84.dp)
            .clip(RoundedCornerShape(13.dp))
            .background(color = L1ADDTheme.BgColors.black)
            .align(Alignment.Center)
        ) {
            Box(modifier.align(Alignment.Center)) {
                Image(
                    painter = painterResource(R.drawable.dota_logo),
                    contentDescription = "dota_cube_logo",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.size(54.dp),
                )
            }
        }
    }
}

@Preview
@Composable
fun DotaLogoPreview() {
    DotaLogo()
}
