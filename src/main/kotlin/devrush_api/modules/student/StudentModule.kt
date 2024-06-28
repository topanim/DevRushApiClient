package org.example.devrush_api.modules.student

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import org.example.devrush_api.ApiResponse
import org.example.devrush_api.helpers.ApiHelper.HEADER_REFERER
import org.example.devrush_api.modules.student.models.update.UpdateStudentRequest
import org.example.devrush_api.modules.student.models.update.UpdateStudentResponse

class StudentModule(
    private val client: HttpClient,
    domain: String,
    path: String
) {

    private val modulePath = "$domain/$path/$MODULE"

    companion object {
        const val MODULE = "student"
        const val UPDATE_STUDENT_REFERER = "https://devrush.eduonline.io/"
    }


    suspend fun update(
        data: UpdateStudentRequest
    ) = client.put(modulePath) {
        header(HEADER_REFERER, UPDATE_STUDENT_REFERER)
        contentType(ContentType.Application.Json)

        setBody(data)
    }.body<ApiResponse<UpdateStudentResponse>>()

}