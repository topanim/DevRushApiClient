package devrush_api.modules.notification.models.getNotifications

import org.example.devrush_api.ApiAuthRequest

class GetNotificationsRequest(
    override val token: String,

    val skip: Int = 0,
    val take: Int = 25,
    val softDeleted: Boolean = false,
    val useSort: Boolean = true,
    val useBaseFilter: Boolean = true,
    val useItemsTotal: Boolean = true,
    val read: Boolean = false,
    val fields: List<String> = emptyList()
) : ApiAuthRequest