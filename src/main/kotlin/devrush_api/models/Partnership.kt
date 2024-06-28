package org.example.devrush_api.models

import kotlinx.serialization.Serializable

@Serializable
data class Partnership(
    val id: String,
    val isActive: Boolean,

    val paymentGatewayFeeEnabled: Boolean,
    val levelCount: Int,

    val canUseReferalBonus: Boolean,
    val canUsePartnerBonus: Boolean,

    val partnershipVisible: Boolean,
    val partnerAssigningCookieDurationDays: Int,
    val partnerAssigningDurationType: String,
    val partnerAssigningDurationDays: Int,
    val partnershipPaidOrdersVisible: Boolean,
    val partnershipAllOrdersVisible: Boolean,
    val partnershipOrdersContactVisible: Boolean,
    val partnershipVisibleToGroupId: PartnershipVisibleToGroupId?, //TODO: need to be fixed

    val transferFeeMethod: String,
    val transferBonusPartner: Boolean,
    val transferBonusPartnerAmount: Int,
    val transferBonusReferral: Boolean,
    val transferBonusReferralAmount: Int,
    val transferFeeAllowedToBonus: Boolean,
    val transferFeeAllowed: Boolean,
    val transferFeeMinAmount: Short,
    val transferFeeHoldingPeriodDays: Int,
)