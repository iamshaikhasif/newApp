package com.example.newscomposeapplication.presentation.onboard

import androidx.annotation.DrawableRes
import com.example.newscomposeapplication.R

data class PageModel(
    val title: String,
    val des: String,
    @DrawableRes val image: Int,
)


val onBoardingPagesListData = listOf<PageModel>(
    PageModel(
        title = "Lorem Ipsum – Generator, Origins and Meaning",
        des = "Richard McClintock, a Latin scholar from Hampden-Sydney College, is credited with discovering the source behind the ubiquitous filler text. In seeing a sample of lorem ipsum, his interest was piqued by consectetur—a genuine, albeit rare, Latin word.",
        image = R.drawable.onboarding1,
    ),
    PageModel(
        title = "Lorem Ipsum – Generator, Origins and Meaning",
        des = "Richard McClintock, a Latin scholar from Hampden-Sydney College, is credited with discovering the source behind the ubiquitous filler text. In seeing a sample of lorem ipsum, his interest was piqued by consectetur—a genuine, albeit rare, Latin word.",
        image = R.drawable.onboarding2,
    ),
    PageModel(
        title = "Lorem Ipsum – Generator, Origins and Meaning",
        des = "Richard McClintock, a Latin scholar from Hampden-Sydney College, is credited with discovering the source behind the ubiquitous filler text. In seeing a sample of lorem ipsum, his interest was piqued by consectetur—a genuine, albeit rare, Latin word.",
        image = R.drawable.onboarding3,
    ),
)
