package org.example.devrush_api.modules.file.models.beginUpload

import kotlinx.serialization.Serializable

@Serializable
data class BeginUploadResponse(
    val id: String,
    val urls: List<String>
)