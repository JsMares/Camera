package com.example.camera.views

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.camera.R
import com.example.camera.components.ButtonCustomer
import com.example.camera.components.OutlinedButtonCustomer
import com.example.camera.viewModels.ImageViewModel

@Composable
fun HomeView(viewModel: ImageViewModel) {
    Box(modifier = Modifier.fillMaxSize()) {
        ImageCustomer(modifier = Modifier.align(Alignment.TopCenter), viewModel)
        Column(modifier = Modifier.align(Alignment.BottomCenter)) {
            SelectorButtons(viewModel)
            Spacer(modifier = Modifier.size(96.dp))
            SaveButtons()
        }
    }
}

@Composable
fun ImageCustomer(modifier: Modifier, viewModel: ImageViewModel) {
    Image(
        painter = if (viewModel.image.value != null) {
            rememberAsyncImagePainter(model = viewModel.image.value)
        } else {
            painterResource(id = R.drawable.baseline_photo_24)
        },
        contentDescription = "",
        modifier = modifier
            .padding(16.dp)
            .height(250.dp)
            .width(250.dp),
        contentScale = ContentScale.Fit
    )
}

@Composable
fun SelectorButtons(viewModel: ImageViewModel) {
    val photoPicker =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.PickVisualMedia()) {
            if (it != null) {
                viewModel.updateImage(it)
            } else {
                // Toast to indicate an error
            }
        }

    Row {
        OutlinedButtonCustomer(
            modifier = Modifier.weight(1f),
            text = stringResource(id = R.string.indication_takePhoto),
            icon = R.drawable.baseline_photo_camera_24
        ) {

        }
        OutlinedButtonCustomer(
            modifier = Modifier.weight(1f),
            text = stringResource(id = R.string.indication_selectImage),
            icon = R.drawable.baseline_photo_24
        ) {
            //RegisterPicker(viewModel = viewModel)
            photoPicker.launch(
                PickVisualMediaRequest(
                    ActivityResultContracts.PickVisualMedia.ImageOnly
                )
            )
        }
    }
}


@Composable
fun SaveButtons() {
    ButtonCustomer(
        text = stringResource(id = R.string.save_database),
        icon = R.drawable.baseline_save_alt_24
    ) {

    }
    ButtonCustomer(
        text = stringResource(id = R.string.save_firebase),
        icon = R.drawable.baseline_local_fire_department_24
    ) {

    }
    ButtonCustomer(
        text = stringResource(id = R.string.save_dataRoom),
        icon = R.drawable.baseline_smartphone_24
    ) {

    }
    ButtonCustomer(
        text = stringResource(id = R.string.save_externalMemory),
        icon = R.drawable.baseline_save_24
    ) {

    }
}