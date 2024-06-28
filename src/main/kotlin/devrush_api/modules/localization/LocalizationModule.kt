package org.example.devrush_api.modules.localization

import io.ktor.client.*

class LocalizationModule(
    private val client: HttpClient,
    domain: String,
    path: String
) {
    private val modulePath = "$domain/$path/$MODULE"

    companion object {
        const val MODULE = "authorization"
//        const val LOGIN_REFERER_URL = "https://devrush.eduonline.io/login?returnUrl=/"
    }
}