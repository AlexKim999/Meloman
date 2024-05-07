package ru.netology


fun main() {
    val purchaseAmount: Double = readln().toDouble()
    val isRegularCustomer = true

    var discount = when {
        purchaseAmount in 1.0..1000.0 -> 0.0
        purchaseAmount in 1001.0..10000.0 -> 100.0
        purchaseAmount > 10000.0 -> purchaseAmount * 0.05
        else -> 0.0
    }
    val totalAmountBeforeRegularDiscount = purchaseAmount - discount

    if (isRegularCustomer) {
        discount = totalAmountBeforeRegularDiscount * 0.01
    }

    val totalAmount = purchaseAmount - discount
    println("Итоговая стоимость покупки: $totalAmount руб.")
}