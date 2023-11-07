package com.example.l1add.ui.dotascreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.Text
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.l1add.R
import com.example.l1add.ui.theme.L1ADDTheme

@Preview
@Composable
fun DotaScreen() {
    LazyColumn(
        state = LazyListState(),
        modifier = Modifier.fillMaxSize(),
    ) {
        item {
            DotaScreenHeader()
        }
        item {
            DotaGameTypes(
                listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
                Modifier.padding(top = 16.dp)
            )
        }
        item {
            Text(
                text = stringResource(R.string.description),
                style = L1ADDTheme.TextStyle.regular(12.sp, 19.sp),
                color = L1ADDTheme.TextColors.description,
                modifier = Modifier.padding(
                    start = 21.dp,
                    end = 21.dp,
                    top = 30.dp,
                )
            )
        }
        item {
            // video and pictures
        }
        item {
            // rating
        }
        item {
            // comments
        }
        item {
            SimpleButton(
                text = stringResource(R.string.install),
                onClick = {},
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        bottom = 32.dp,
                    )
                    .fillMaxWidth()
            )
        }
    }
}
