package io.polygloat.configuration.polygloat

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "polygloat.sentry")
class SentryProperties {
    var enabled = false
    var serverDsn: String? = null
    var clientDsn: String? = null
}