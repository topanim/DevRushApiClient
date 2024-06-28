package org.example.devrush_api.models

import kotlinx.serialization.Serializable

@Serializable
data class Timezone(
    val id: String,
    val offset: String,
)