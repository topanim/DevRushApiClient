package org.example.devrush_api.modules.file

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import org.example.devrush_api.ApiResponse
import org.example.devrush_api.helpers.ApiHelper.HEADER_REFERER
import org.example.devrush_api.modules.file.models.beginUpload.BeginUploadResponse
import org.example.devrush_api.modules.file.models.complete.CompleteRequest
import org.example.devrush_api.modules.file.models.complete.CompleteResponse
import org.example.devrush_api.modules.file.models.prepare.PrepareRequest
import org.example.devrush_api.modules.file.models.prepare.PrepareResponse

class FileModule(
    private val client: HttpClient,
    domain: String,
    path: String
) {
    private val modulePath = "$domain/$path/$MODULE"

    companion object {
        const val MODULE = "file"
        const val BEGIN_UPLOAD_REFERER = "https://devrush.eduonline.io/"
        const val PREPARE_REFERER = "https://devrush.eduonline.io"
        const val COMPLETE_REFERER = "https://devrush.eduonline.io/"
    }

    suspend fun beginUpload(
        data: Unit = Unit
    ) = client.post("$modulePath/begin") {
        header(HEADER_REFERER, BEGIN_UPLOAD_REFERER)
    }.body<ApiResponse<BeginUploadResponse>>()

    suspend fun prepare(
        data: PrepareRequest
    ) = client.put("$modulePath/prepare/${data.id}") {
        header(HEADER_REFERER, PREPARE_REFERER)
    }.body<ApiResponse<PrepareResponse>>()

    suspend fun complete(
        data: CompleteRequest
    ) = client.post("$modulePath/upload") {
        header(HEADER_REFERER, COMPLETE_REFERER)
        contentType(ContentType.Application.Json)
        setBody(data)
    }.body<ApiResponse<CompleteResponse>>()

}