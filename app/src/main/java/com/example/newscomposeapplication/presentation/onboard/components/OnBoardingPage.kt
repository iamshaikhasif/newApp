package com.example.newscomposeapplication.presentation.onboard.components

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.newscomposeapplication.R
import com.example.newscomposeapplication.presentation.Dimes.MediumPadding1
import com.example.newscomposeapplication.presentation.Dimes.MediumPadding2
import com.example.newscomposeapplication.presentation.onboard.PageModel
import com.example.newscomposeapplication.presentation.onboard.onBoardingPagesListData
import com.example.newscomposeapplication.ui.theme.NewsComposeApplicationTheme

@Composable
fun OnBoardingPage(
    page: PageModel,
    modifier: Modifier = Modifier
) {

    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(MediumPadding1))
        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal =  MediumPadding2),
            style = MaterialTheme.typography.displaySmall.copy(color = colorResource(id = R.color.white), fontWeight = FontWeight.Bold)
            )
        Text(
            text = page.des,
            modifier = Modifier.padding(horizontal =  MediumPadding2),
            style = MaterialTheme.typography.bodyMedium.copy(color = colorResource(id = R.color.white), fontWeight = FontWeight.Bold)
            )
    }

}

@Preview
@Composable
fun OnBoarding() {
    NewsComposeApplicationTheme {
        OnBoardingPage(page = onBoardingPagesListData[0], modifier = Modifier)
    }
}