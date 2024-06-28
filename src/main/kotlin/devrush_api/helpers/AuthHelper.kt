package org.example.devrush_api.helpers

import io.ktor.client.request.*
import org.example.devrush_api.ApiAuthRequest
import org.example.devrush_api.helpers.ApiHelper.AUTHORIZATION_PREFIX
import org.example.devrush_api.helpers.ApiHelper.HEADER_AUTHORIZATION

fun HttpRequestBuilder.authHeader(
    data: ApiAuthRequest
) {
    header(HEADER_AUTHORIZATION, AUTHORIZATION_PREFIX + data.token)
}