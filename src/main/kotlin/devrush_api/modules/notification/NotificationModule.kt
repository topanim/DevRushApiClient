package org.example.devrush_api.modules.notification

import devrush_api.modules.notification.models.getNotifications.GetNotificationsRequest
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import org.example.devrush_api.ApiResponse
import org.example.devrush_api.helpers.ApiHelper.HEADER_REFERER
import org.example.devrush_api.modules.notification.models.getNotifications.GetNotificationsResponse

class NotificationModule(
    private val client: HttpClient,
    domain: String,
    path: String
) {
    private val modulePath = "$domain/$path/$MODULE"

    companion object {
        const val MODULE = "notification"
        const val GET_NOTIFICATIONS_REFERER = "https://devrush.eduonline.io/"
    }

    suspend fun getNotifications(
        data: GetNotificationsRequest
    ) = client.get("$modulePath/count") {
        header(HEADER_REFERER, GET_NOTIFICATIONS_REFERER)

        parameter("skip", data.skip)
        parameter("take", data.take)
        parameter("softDeleted", data.softDeleted)
        parameter("useSort", data.useSort)
        parameter("useBaseFilter", data.useBaseFilter)
        parameter("useItemsTotal", data.useItemsTotal)
        parameter("read", data.read)
        parameter("fields", data.fields)
    }.body<ApiResponse<GetNotificationsResponse>>()
}