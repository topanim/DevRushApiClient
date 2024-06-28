package org.example.devrush_api

import io.ktor.client.*
import org.example.devrush_api.modules.auth.AuthModule
import org.example.devrush_api.modules.file.FileModule
import org.example.devrush_api.modules.gamification.GamificationModule
import org.example.devrush_api.modules.localization.LocalizationModule
import org.example.devrush_api.modules.notification.NotificationModule
import org.example.devrush_api.modules.quiz.QuizModule
import org.example.devrush_api.modules.student.StudentModule

class DevRushApi(
    private val client: HttpClient
) {
    companion object {
        const val DOMAIN = "https://devrush.eduonline.io"
        const val PATH = "api/v1"
    }

    val auth = AuthModule(client, DOMAIN, PATH)
    val quiz = QuizModule(client, DOMAIN, PATH)
    val file = FileModule(client, DOMAIN, PATH)
    val student = StudentModule(client, DOMAIN, PATH)
    val gamification = GamificationModule(client, DOMAIN, PATH)
    val notification = NotificationModule(client, DOMAIN, PATH)
    val localization = LocalizationModule(client, DOMAIN, PATH)
}