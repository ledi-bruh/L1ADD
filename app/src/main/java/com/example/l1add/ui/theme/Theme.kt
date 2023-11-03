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
    }

    object ButtonColors {
        val yellow
            get() = Color(0xFFF4D144)
    }

    object TextColors {
        val description
            get() = Color(0xFFFF0000)
    }

    object TextStyle {
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
