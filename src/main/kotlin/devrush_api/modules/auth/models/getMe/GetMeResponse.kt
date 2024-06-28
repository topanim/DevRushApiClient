package org.example.devrush_api.modules.auth.models.getMe

import kotlinx.serialization.Serializable
import org.example.devrush_api.models.*


@Serializable
data class GetMeResponse(
    val id: String,
    val email: String,
    val firstName: String,
    val middleName: String?,
    val lastName: String?,
    val phone: String?,
    val lang: String,
    val gender: String,
    val birthday: String?,
    val bonusBalance: Int,
    val isEmailConfirmed: Boolean,
    val isSchoolEmailConfirmed: Boolean,
    val emailConfirmationSentDate: String,
    val isPhoneConfirmed: Boolean,
    val phoneConfirmationSentDate: String?,
    val needChangePassword: Boolean,
    val isAdmin: Boolean,
    val concurrencyStamp: String,
    val roles: List<Int>, // TODO: need to be fixed
    val school: School,
    val avatar: String?,  // TODO: need to be fixed
    val session: Session,
    val chatUserData: ChatUserData,
    val tags: List<Tag>,
    val groups: List<Group>
)

















