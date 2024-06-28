package org.example.devrush_api.modules.gamification.models.getBalance

import org.example.devrush_api.ApiAuthRequest

class GetBalanceRequest(
    override val token: String,
    val fields: List<String> = emptyList()
) : ApiAuthRequest