package com.example.camera.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ButtonCustomer() {
    Button(
        onClick = { },
        shape = RoundedCornerShape(10f),
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(Color.Black),
    ) {
        Row {
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "")
            Spacer(modifier = Modifier.size(16.dp))
            Text(text = "")
        }
    }
}