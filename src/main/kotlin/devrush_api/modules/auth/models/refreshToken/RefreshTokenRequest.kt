package org.example.devrush_api.modules.auth.models.refreshToken

import kotlinx.serialization.Serializable

@Serializable
data class RefreshTokenRequest(
    val token: String
)