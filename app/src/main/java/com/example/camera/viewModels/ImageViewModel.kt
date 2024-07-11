package com.example.camera.viewModels

import android.net.Uri
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ImageViewModel: ViewModel() {
    var image = mutableStateOf<Uri?>(null)
        private set

    fun updateImage(newImage: Uri?) {
        image.value = newImage
    }
}