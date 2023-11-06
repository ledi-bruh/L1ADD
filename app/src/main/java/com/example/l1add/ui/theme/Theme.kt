package com.example.l1add.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

object L1ADDTheme {
    object BgColors {
        val dark
            get() = Color(0xFF050B18)
        val black
            get() = Color(0xFF000000)
        val logo_border
            get() = Color(0xFF1F2430)
        val game_type
            get() = Color(0x3D44A9F4)
    }

    object ButtonColors {
        val yellow
            get() = Color(0xFFF4D144)
    }

    object TextColors {
        val description
            get() = Color(0xB3EEF2FB)
        val title
            get() = Color(0xFFFFFFFF)
        val downloads
            get() = Color(0xFF45454D)
        val game_type
            get() = Color(0xFF44A9F4)
    }

    object TextStyle {
        val Regular_12
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                )
            )
        val Regular_12_19
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                lineHeight = 19.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                )
            )
        val Medium_10_12
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp,
                lineHeight = 12.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                )
            )
        val Bold_20
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                )
            )
        val Bold_48
            @Composable
            get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                )
            )
    }
}

@Composable
fun L1ADDTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme{
        content()
    }
}
