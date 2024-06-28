package org.example.devrush_api

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse<T>(
    val success: Boolean,
    val errors: List<ResponseError>,
    val body: T?,
    val resetToken: Boolean
)

interface ApiAuthRequest {
    val token: String
}

@Serializable
data class ResponseError(
    val code: Int,
    val message: String,
    val target: String?,
    val systemException: String?,
    val innerException: String?,
    val stackTrace: String?
)
