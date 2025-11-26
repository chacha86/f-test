package com.back.global.app

import org.springframework.boot.context.properties.ConfigurationProperties


@ConfigurationProperties(prefix = "custom.site")
data class SiteProperties(
    val cookieDomain: String,
    val frontUrl: String,
    val backUrl: String
)