package io.homo_efficio.study.springmvc

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties(prefix = "aa.bb")
@ConstructorBinding
data class HelloProperties(
    val cc: String,
    val ccc: String
)
