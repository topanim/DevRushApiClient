package org.example.devrush_api.modules.auth.models.register

import kotlinx.serialization.Serializable

@Serializable
data class RegisterResponse(
    val accessToken: String,
    val refreshToken: String
)