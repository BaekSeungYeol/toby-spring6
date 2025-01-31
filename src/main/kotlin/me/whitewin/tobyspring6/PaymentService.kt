package me.whitewin.tobyspring6

import java.math.BigDecimal
import java.time.LocalDateTime

class PaymentService {

    fun prepare(orderId: Long, currency: String, foreignCurrencyAmount: BigDecimal): Payment {
        // 환율 가져오기
        // 금액 계산
        // 유효 시간 계산

        return Payment(orderId, currency, foreignCurrencyAmount, BigDecimal.ZERO, BigDecimal.ZERO, LocalDateTime.now())
    }


}

fun main() {
    val paymentService = PaymentService()
    val payment = paymentService.prepare(100L, "USD", BigDecimal.valueOf(50.7))
    println(payment)
}