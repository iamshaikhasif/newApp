package com.example.newscomposeapplication.presentation.commonUi

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun CommonButton(
    modifier: Modifier = Modifier,
    btnText: String,
    onClick: () -> Unit
) {
    Button(modifier= modifier, onClick = onClick, colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = Color.White
    )) {
        Text(text = btnText, style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold))
    }
}

@Composable
fun CommonTextButton(
    modifier: Modifier = Modifier,
    btnText: String,
    onClick: () -> Unit
) {
    TextButton(modifier= modifier, onClick = onClick) {
        Text(text = btnText, style = MaterialTheme.typography.labelMedium.copy(color = Color.White, fontWeight = FontWeight.SemiBold))
    }
}

