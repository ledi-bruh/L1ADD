package com.example.l1add.ui.dotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.l1add.R
import com.example.l1add.ui.theme.L1ADDTheme

@Composable
fun DotaGameViews(
    gameViews: List<Int>,
    modifier: Modifier = Modifier,
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
        modifier = modifier,
    ) {
        items(gameViews) { gameView ->
            GameView(gameView = gameView)
        }
    }
}

@Composable
fun GameView(
    gameView: Int,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier
        .size(240.dp, 128.dp)
    ) {
        Image(
            painter = painterResource(gameView),
            contentDescription = "game view",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(14.dp))
                .fillMaxSize()
        )
        val backgroundCircleModifier = Modifier.background(
            brush = Brush.verticalGradient(
                colors = listOf(
                    Color(0x00FFFFFF),
                    Color(0x66FFFFFF),
                ),
                startY = 0f,
                endY = 1f,
            )
        ) then Modifier.background(
            brush = Brush.horizontalGradient(
                colors = listOf(
                    Color(0x3DFFFFFF),
                    Color(0x3DFFFFFF),
                ),
                startX = 0f,
                endX = 1f,
            )
        )
        Box(
            Modifier
                .clip(CircleShape)
                .size(48.dp)
                .align(Alignment.Center)
                .then(backgroundCircleModifier)
        ) {
            Icon(
                imageVector = Icons.Rounded.PlayArrow,
                contentDescription = "play view",
                tint = L1ADDTheme.ButtonColors.white,
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
    }
}

@Preview
@Composable
fun DotaGameViewsPreview() {
    DotaGameViews(
        gameViews = listOf(
            R.drawable.video_view1,
            R.drawable.video_view2,
        ),
        modifier = Modifier,
    )
}
