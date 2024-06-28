package org.example.devrush_api.modules.quiz

import io.ktor.client.*

class QuizModule(
    private val client: HttpClient,
    private val domain: String,
    private val path: String
) {

}