package org.example.devrush_api.models

import kotlinx.serialization.Serializable

@Serializable
data class Session(
    val id: String,
    val studentId: String,
    val studentCommunicationId: String?, // TODO: need to be fixed
    val adminId: String?, // TODO: need to be fixed
    val expiredDate: String?, // TODO: need to be fixed
)