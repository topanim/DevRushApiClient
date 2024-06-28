package org.example.devrush_api.modules.auth.models.refreshToken

import kotlinx.serialization.Serializable

@Serializable
data class RefreshTokenResponse(
    val accessToken: String,
    val refreshToken: String
)