package ru.netology

import java.util.*

val scan = Scanner(System.`in`)

fun main() {
    val purchaseAmount = scan.nextDouble()
    val isRegularCustomer = true

    var discount = when {
        purchaseAmount in 1.0..1000.0 -> 0.0
        purchaseAmount in 1001.0..10000.0 -> 100.0
        purchaseAmount > 10000.0 -> purchaseAmount * 0.05
        else -> 0.0
    }
        if (isRegularCustomer) {
            discount += purchaseAmount * 0.01
        }
        val totalAmount = purchaseAmount - discount
    println("Итоговая стоимость покупки: $totalAmount руб.")
}