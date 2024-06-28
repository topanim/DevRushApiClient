package org.example.devrush_api.modules.auth.models.getMe

import org.example.devrush_api.ApiAuthRequest

class GetMeRequest(
    override val token: String,
    val fields: List<String> = emptyList()
) : ApiAuthRequest