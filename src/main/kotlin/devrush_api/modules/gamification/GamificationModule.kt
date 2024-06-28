package org.example.devrush_api.modules.gamification

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import org.example.devrush_api.ApiResponse
import org.example.devrush_api.helpers.ApiHelper.HEADER_REFERER
import org.example.devrush_api.helpers.authHeader
import org.example.devrush_api.modules.gamification.models.getBalance.GetBalanceRequest

class GamificationModule(
    private val client: HttpClient,
    domain: String,
    path: String
) {
    private val modulePath = "$domain/$path/$MODULE"

    companion object {
        const val MODULE = "gamification"
        const val GET_BALANCE_REFERER = "https://devrush.eduonline.io/"
    }

    suspend fun getBalance(
        data: GetBalanceRequest
    ) = client.get("$modulePath/balance") {
        header(HEADER_REFERER, GET_BALANCE_REFERER)
        authHeader(data)

        parameter("fields", data.fields)
    }.body<ApiResponse<Int>>()
}