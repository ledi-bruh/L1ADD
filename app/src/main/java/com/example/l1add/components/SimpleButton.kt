package com.example.l1add.components

import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.l1add.ui.theme.L1ADDTheme

@Composable
fun SimpleButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = L1ADDTheme.ButtonColors.install,
            contentColor = L1ADDTheme.TextColors.install,
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 0.dp,
            hoveredElevation = 10.dp,
        ),
        modifier = modifier
            .padding(bottom = 6.dp),
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            style = L1ADDTheme.TextStyle.bold(20.sp, 24.sp),
            modifier = Modifier.padding(
                top = 20.dp,
                bottom = 20.dp,
            )
        )
    }
}

@Preview
@Composable
fun SimpleButtonPreview() {
    SimpleButton(
        text = "text",
        onClick = {},
    )
}
