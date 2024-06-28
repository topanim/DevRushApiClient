package org.example.devrush_api.models

import kotlinx.serialization.Serializable

@Serializable
data class ChatUserData(
    val id: String,
    val roles: List<Int>,
)
