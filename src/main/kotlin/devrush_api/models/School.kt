package org.example.devrush_api.models

import kotlinx.serialization.Serializable

@Serializable
data class School(
    val id: String,
    val ownerId: String,
    val owner: SchoolOwner,
    val name: String,
    val description: String,
    val domain: String,
    val timezoneId: String?,
    val timezone: Timezone,
    val currency: String,
    val number: Int,
    val billing: String?, // TODO: need to be fixed
    val partnership: Partnership,
    val gamification: Gamification,
    val countryId: String?,  // TODO: need to be fixed
    val country: Country,
    val lang: String,
    val appIntegrations: List<String>,
    val chatChannelIntegrations: List<ChatChannelIntegration>,
    val allowCustomProductGatewaySettings: Boolean,
)