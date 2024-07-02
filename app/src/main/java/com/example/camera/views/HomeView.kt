package com.example.camera.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.camera.R

@Preview(showBackground = true)
@Composable
fun HomeView() {
    Box(modifier = Modifier.fillMaxSize()) {
        ImageCustomer(modifier = Modifier.align(Alignment.TopCenter))
    }
}

@Composable
fun ImageCustomer(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.ojo_x_ojo),
        contentDescription = "",
        modifier = modifier
            .padding(16.dp)
            .height(250.dp)
            .width(250.dp),
        contentScale = ContentScale.Fit
    )
}