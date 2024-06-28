package org.example.devrush_api.modules.file.models.complete

import kotlinx.serialization.Serializable

@Serializable
data class CompleteResponse(
    val id: String,
    val name: String,
    val mimeType: String,
    val type: String,
    val cloudKey: String,
//    val additionalData: Any?,
    val extension: String,
    val size: Int
)
