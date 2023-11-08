package com.example.l1add.ui.dotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.l1add.R
import com.example.l1add.components.Comment
import com.example.l1add.components.User
import com.example.l1add.ui.theme.L1ADDTheme

@Composable
fun DotaComment(
    comment: Comment,
    modifier: Modifier = Modifier,
) {
    Column(modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(Modifier.clip(CircleShape).size(36.dp)) {
                Image(
                    painter = painterResource(comment.createdBy.avatar),
                    contentDescription = "avatar",
                    contentScale = ContentScale.Crop,
                )
            }
            Column(Modifier.padding(start = 16.dp)
            ) {
                Text(
                    text = comment.createdBy.name,
                    style = L1ADDTheme.TextStyle.regular(16.sp, 19.2.sp),
                    color = L1ADDTheme.TextColors.comment_created_by_name,
                )
                Text(
                    text = comment.createdAt,
                    style = L1ADDTheme.TextStyle.regular(12.sp, 14.4.sp),
                    color = L1ADDTheme.TextColors.comment_created_at,
                    modifier = Modifier.padding(top = 7.dp),
                )
            }
        }
        Text(
            text = "“${comment.message}”",
            style = L1ADDTheme.TextStyle.regular(12.sp, 20.sp),
            color = L1ADDTheme.TextColors.comment_message,
            modifier = Modifier.padding(top = 16.dp),
        )
    }
}


@Preview
@Composable
fun DotaCommentPreview() {
    DotaComment(
        comment = Comment(
            message = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
            createdBy = User(
                name = "Auguste Conte",
                avatar = R.drawable.comment_author_1,
            ),
            createdAt = "February 14, 2019",
        ),
    )
}
