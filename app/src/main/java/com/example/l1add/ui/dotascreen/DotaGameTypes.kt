package com.example.l1add.ui.dotascreen

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.l1add.ui.theme.L1ADDTheme

@Composable
fun DotaGameTypes(
    types: List<String>,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = contentPadding,
        modifier = modifier,
    ) {
        items(types) { type ->
            GameType(type)
        }
    }
}

@Composable
fun GameType(type: String, modifier: Modifier = Modifier) {
    Box(
        modifier
            .clip(RoundedCornerShape(100.dp))
            .background(color = L1ADDTheme.BgColors.game_type)
            .padding(horizontal = 10.dp, vertical = 5.dp)
    ) {
        Text(
            text = type,
            color = L1ADDTheme.TextColors.game_type,
            style = L1ADDTheme.TextStyle.medium(10.sp, 12.sp),  // TODO: montserrat
        )
    }
}

@Preview
@Composable
fun DotaGameTypesPreview() {
    DotaGameTypes(
        types = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
        contentPadding=PaddingValues(start = 24.dp, end = 24.dp),
    )
}
