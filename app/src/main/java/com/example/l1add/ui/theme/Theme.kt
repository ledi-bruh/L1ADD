package com.example.l1add.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.TextUnit

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
        val comment_divider
            get() = Color(0xFF1A1F29)
    }

    object ButtonColors {
        val yellow
            get() = Color(0xFFF4D144)
        val white
            get() = Color(0xFFFFFFFF)
    }

    object TextColors {
        val description
            get() = Color(0xB3EEF2FB)
        val review_ratings
            get() = Color(0xFFEEF2FB)
        val title
            get() = Color(0xFFFFFFFF)
        val downloads
            get() = Color(0xFF45454D)
        val game_type
            get() = Color(0xFF44A9F4)
        val install
            get() = Color(0xFF050B18)
        val reviews
            get() = Color(0xFFA8ADB7)
        val comment_created_by_name
            get() = Color(0xFFFFFFFF)
        val comment_created_at
            get() = Color(0x66FFFFFF)
        val comment_message
            get() = Color(0xFFA8ADB7)
    }

    object TextStyle {
        @Composable
        fun regular(fontSize: TextUnit, lineHeight: TextUnit): androidx.compose.ui.text.TextStyle {
            return TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = fontSize,
                lineHeight = lineHeight,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                )
            )
        }
        @Composable
        fun medium(fontSize: TextUnit, lineHeight: TextUnit): androidx.compose.ui.text.TextStyle {
            return TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = fontSize,
                lineHeight = lineHeight,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                )
            )
        }
        @Composable
        fun bold(fontSize: TextUnit, lineHeight: TextUnit): androidx.compose.ui.text.TextStyle {
            return TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = fontSize,
                lineHeight = lineHeight,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                )
            )
        }
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
