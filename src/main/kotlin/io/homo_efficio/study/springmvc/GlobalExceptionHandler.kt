package io.homo_efficio.study.springmvc

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

//@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(HelloException::class)
    fun handleHelloException(e: HelloException): ResponseEntity<ErrorOut> {
        return ResponseEntity(ErrorOut("COMMON_001", e.message ?: "디폴트 메시지"), HttpStatus.NOT_FOUND)
    }
}
