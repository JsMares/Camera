package com.example.camera.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.camera.R
import com.example.camera.components.ButtonCustomer

@Preview(showBackground = true)
@Composable
fun HomeView() {
    Box(modifier = Modifier.fillMaxSize()) {
        ImageCustomer(modifier = Modifier.align(Alignment.TopCenter))

        Column(modifier = Modifier.align(Alignment.BottomCenter)) {
            SaveButtons()
        }
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

@Composable
fun SaveButtons() {
    ButtonCustomer(text = stringResource(id = R.string.save_database), icon = R.drawable.baseline_save_alt_24) {

    }
    ButtonCustomer(text = stringResource(id = R.string.save_firebase), icon = R.drawable.baseline_local_fire_department_24) {

    }
    ButtonCustomer(text = stringResource(id = R.string.save_dataRoom), icon = R.drawable.baseline_smartphone_24) {

    }
    ButtonCustomer(text = stringResource(id = R.string.save_externalMemory), icon = R.drawable.baseline_save_24) {

    }
}