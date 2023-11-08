package com.example.l1add.components

import com.example.l1add.R

data class Comment (
    val message: String,
    val createdBy: User,
    val createdAt: String,
)

val comments = listOf(
    Comment(
        message = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
        createdBy = User(
            name = "Auguste Conte",
            avatar = R.drawable.comment_author_1,
        ),
        createdAt = "February 14, 2019",
    ),
    Comment(
        message = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
        createdBy = User(
            name = "Jang Marcelino",
            avatar = R.drawable.comment_author_2,
        ),
        createdAt = "February 14, 2019",
    )
)
