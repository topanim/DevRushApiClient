package org.example.devrush_api.models

import kotlinx.serialization.Serializable

@Serializable
data class ChatChannelIntegration(
    val id: String,
    val name: String,
    val type: String,
    val canInitiateMessaging: Boolean
)

