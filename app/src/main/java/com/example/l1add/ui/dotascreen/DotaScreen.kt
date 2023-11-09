package com.example.l1add.ui.dotascreen

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.l1add.R
import com.example.l1add.components.SimpleButton
import com.example.l1add.components.comments
import com.example.l1add.ui.theme.L1ADDTheme

@Composable
fun DotaScreen() {
    val context = LocalContext.current
    val lazyListState = rememberLazyListState()

    LazyColumn(
        state = lazyListState,
        modifier = Modifier.fillMaxSize(),
    ) {
        item {
            DotaScreenHeader(painterResource(R.drawable.dota_backgroud))
        }
        item {
            DotaGameTypes(
                listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
                PaddingValues(start = 24.dp, end = 24.dp),
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
            DotaGameViews(
                gameViews = listOf(
                    R.drawable.video_view1,
                    R.drawable.video_view2,
                ),
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
                modifier = Modifier.padding(top = 18.dp)
            )
        }
        item {
            DotaReviewRatings(Modifier.padding(
                start = 24.dp,
                end = 24.dp,
                top = 24.dp,
                bottom = 30.dp,
            ))
        }
        itemsIndexed(comments) { index, comment ->
            DotaComment(
                comment = comment,
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                    )
            )
            if (index < comments.lastIndex) {
                Divider(
                    thickness = 1.dp,
                    color = L1ADDTheme.BgColors.comment_divider,
                    modifier = Modifier
                        .padding(
                            start = 38.dp,
                            end = 38.dp,
                            top = 24.dp,
                            bottom = 24.dp,
                        )
                )
            }
        }
        item {
            SimpleButton(
                text = stringResource(R.string.install),
                onClick = { Toast.makeText(context, "CLICKED", Toast.LENGTH_LONG).show() },
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 40.dp,
                        bottom = 38.dp,
                    )
                    .fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
fun DotaScreenPreview() {
    Surface(color = L1ADDTheme.BgColors.dark) {
        DotaScreen()
    }
}
