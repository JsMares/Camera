package com.example.camera.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ButtonCustomer(text: String, icon: Int, onClick: () -> Unit) {
    Button(
        onClick = { onClick() },
        shape = RoundedCornerShape(10f),
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(Color.Black),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(id = icon), contentDescription = "")
            Spacer(modifier = Modifier.size(16.dp))
            Text(text = text)
        }
    }
}