package io.homo_efficio.study.springmvc

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping
    fun hello(): ResponseEntity<KotlinHelloOut> {
//    fun hello(): ResponseEntity<HelloOut> {
        if (1 == 1) {
            throw HelloException("아이고~~")
        }
        return ResponseEntity.ok(KotlinHelloOut("아싸~~"))
//        return ResponseEntity.ok(HelloOut("아싸~~"))
    }

    @GetMapping("/good")
    fun helloGood(): ResponseEntity<KotlinHelloOut> {
//    fun helloGood(): ResponseEntity<HelloOut> {
        return ResponseEntity.ok().body(KotlinHelloOut("아싸~~"))
//        return ResponseEntity.ok(HelloOut("아싸~~"))
    }
}
