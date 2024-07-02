package com.example.camera.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedButtonCustomer(modifier: Modifier, text: String, icon: Int, onClick: () -> Unit) {
    OutlinedButton(
        onClick = { onClick() },
        shape = RoundedCornerShape(10f),
        modifier = modifier
            .padding(12.dp)
            .fillMaxWidth(),
        border = BorderStroke(width = 1.dp, color = Color.Black),
        contentPadding = PaddingValues(vertical = 16.dp, horizontal = 8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(id = icon), contentDescription = "", tint = Color.Black)
            Spacer(modifier = Modifier.size(16.dp))
            Text(text = text, color = Color.Black, maxLines = 1, overflow = TextOverflow.Ellipsis)
        }
    }
}