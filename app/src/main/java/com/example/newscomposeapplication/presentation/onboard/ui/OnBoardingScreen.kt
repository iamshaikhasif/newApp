package com.example.newscomposeapplication.presentation.onboard.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.newscomposeapplication.presentation.Dimes.MediumPadding1
import com.example.newscomposeapplication.presentation.Dimes.MediumPadding2
import com.example.newscomposeapplication.presentation.Dimes.PageIndicatorWidth
import com.example.newscomposeapplication.presentation.commonUi.CommonButton
import com.example.newscomposeapplication.presentation.commonUi.CommonTextButton
import com.example.newscomposeapplication.presentation.onboard.components.OnBoardingPage
import com.example.newscomposeapplication.presentation.onboard.components.PageIndicator
import com.example.newscomposeapplication.presentation.onboard.onBoardingPagesListData
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(){
    Column(modifier = Modifier.fillMaxSize()) {
        val pageState = rememberPagerState(initialPage = 0) {
            onBoardingPagesListData.size
        }

        HorizontalPager(state = pageState) {index ->
            OnBoardingPage(page = onBoardingPagesListData[index])
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(MediumPadding2)
            .navigationBarsPadding(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            PageIndicator(modifier = Modifier.width(PageIndicatorWidth), pageSize = onBoardingPagesListData.size, selectedPage = pageState.currentPage)

            Row(verticalAlignment = Alignment.CenterVertically) {

                val scope = rememberCoroutineScope()

                CommonTextButton(btnText = if(pageState.currentPage == 0) "" else "Back",) {
                    scope.launch {
                        pageState.animateScrollToPage(pageState.currentPage - 1)
                    }
                }
                CommonButton(btnText = if(pageState.currentPage == (onBoardingPagesListData.size - 1)) "Get Started" else "Next") {
                    scope.launch {
                        if(pageState.currentPage == (onBoardingPagesListData.size - 1)){
                            //navigate to main page
                        }else {
                            pageState.animateScrollToPage(pageState.currentPage + 1)
                        }
                    }
                }
            }
        }

    }
}