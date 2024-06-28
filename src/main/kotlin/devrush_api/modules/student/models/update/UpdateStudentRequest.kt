package org.example.devrush_api.modules.student.models.update

import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class UpdateStudentRequest(
    val email: String,
    val firstName: String,
    val gender: String,

    @EncodeDefault(EncodeDefault.Mode.NEVER)
    val avatarId: String? = null,

    val lastName: String = "",
    val middleName: String = "",
    val phone: String? = null
)