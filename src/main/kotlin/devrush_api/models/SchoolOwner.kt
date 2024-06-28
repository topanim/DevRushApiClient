package org.example.devrush_api.models

import kotlinx.serialization.Serializable

@Serializable
data class SchoolOwner(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val avatar: String?,
)