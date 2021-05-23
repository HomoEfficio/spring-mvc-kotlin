package io.homo_efficio.study.springmvc

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@EnableConfigurationProperties(HelloProperties::class)
@TestPropertySource("classpath:application.yml")
internal class HelloPropertiesTest {

    @Autowired
    private lateinit var helloProps: HelloProperties


    @Test
    internal fun showPrps() {
        println("singleLine: " + helloProps.cc)
        println("multiLine: " + helloProps.ccc)
    }
}
