fun main() {
    val totalPrice = 10_001
    val discount = 100
    val discountStart = 1_000
    val percentDiscount = 0.05 * totalPrice
    val percentDiscountStart = 10_000
    val melomanDiscount = 0.99
    val meloman = true

    val result = if (!meloman) {
        if (totalPrice > percentDiscountStart) totalPrice - percentDiscount
        else if (totalPrice > discountStart) totalPrice - discount
        else totalPrice
    } else {
        if (totalPrice > percentDiscountStart) (totalPrice - percentDiscount) * melomanDiscount
        else if (totalPrice > discountStart) (totalPrice - discount) * melomanDiscount
        else totalPrice * melomanDiscount
    }
    println("Итоговая цена в копейках: $result")
}