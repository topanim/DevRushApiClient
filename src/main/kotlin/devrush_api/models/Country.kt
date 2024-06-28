package org.example.devrush_api.models

import kotlinx.serialization.Serializable

@Serializable
data class Country(
    val name: String,
    val id: String,
    val softDeleted: Boolean,
    val softDeletedDate: String?,
)