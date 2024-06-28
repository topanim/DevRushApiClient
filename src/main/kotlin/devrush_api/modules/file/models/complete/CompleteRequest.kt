package org.example.devrush_api.modules.file.models.complete

import kotlinx.serialization.Serializable

@Serializable
data class CompleteRequest(
    val eTags: List<ETag>,
    val id: String
)

@Serializable
data class ETag(
    val eTag: String,
    val partNumber: Int
)