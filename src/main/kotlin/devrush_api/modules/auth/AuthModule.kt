package org.example.devrush_api.modules.auth

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import org.example.devrush_api.ApiResponse
import org.example.devrush_api.helpers.ApiHelper.HEADER_REFERER
import org.example.devrush_api.helpers.authHeader
import org.example.devrush_api.modules.auth.models.getMe.GetMeRequest
import org.example.devrush_api.modules.auth.models.getMe.GetMeResponse
import org.example.devrush_api.modules.auth.models.login.LoginRequest
import org.example.devrush_api.modules.auth.models.login.LoginResponse
import org.example.devrush_api.modules.auth.models.refreshToken.RefreshTokenRequest
import org.example.devrush_api.modules.auth.models.refreshToken.RefreshTokenResponse
import org.example.devrush_api.modules.auth.models.register.RegisterRequest
import org.example.devrush_api.modules.auth.models.register.RegisterResponse

class AuthModule(
    private val client: HttpClient,
    domain: String,
    path: String
) {
    private val modulePath = "$domain/$path/$MODULE"

    companion object {
        const val MODULE = "authorization"
        const val LOGIN_REFERER_URL = "https://devrush.eduonline.io/login?returnUrl=/"
        const val REGISTER_REFERER_URL = "https://devrush.eduonline.io/register"
        const val REFRESH_TOKEN_REFERER_URL = "https://devrush.eduonline.io"
        const val GET_ME_REFERER_URL = "https://devrush.eduonline.io/"
    }

    suspend fun login(
        data: LoginRequest
    ) = client.post("$modulePath/login") {
        header(HEADER_REFERER, LOGIN_REFERER_URL)
        contentType(ContentType.Application.Json)

        setBody(data)
    }.body<ApiResponse<LoginResponse>>()

    suspend fun register(
        data: RegisterRequest
    ) = client.post("$modulePath/register") {
        header(HEADER_REFERER, REGISTER_REFERER_URL)
        contentType(ContentType.Application.Json)

        setBody(data)
    }.body<ApiResponse<RegisterResponse>>()

    suspend fun refreshToken(
        data: RefreshTokenRequest
    ) = client.put("$modulePath/refresh") {
        header(HEADER_REFERER, REFRESH_TOKEN_REFERER_URL)
        contentType(ContentType.Application.Json)

        setBody(data)
    }.body<ApiResponse<RefreshTokenResponse>>()

    suspend fun getMe(
        data: GetMeRequest
    ) = client.get("$modulePath/me") {
        header(HEADER_REFERER, GET_ME_REFERER_URL)
        authHeader(data)

        parameter("fields", data.fields)
    }.body<ApiResponse<GetMeResponse>>()
}