package org.example

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.example.devrush_api.DevRushApi
import org.example.devrush_api.modules.auth.models.login.LoginRequest


suspend fun main() {
    val api = DevRushApi(org.example.devrush_api.Client)
    CoroutineScope(Dispatchers.IO).launch {
        val some = api.auth.login(
            LoginRequest(
                "info@devrush.ru",
                "DevrushLMS2024 ",
                true
            )
        )
        println(some)
    }.join()
}
