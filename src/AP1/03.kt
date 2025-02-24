//3. Desenvolva uma programa em kotlin que leia os valores de A, B e C de uma equação do segundo
//grau e mostre o valor de Delta. (formula Δ = b2 – 4ac)

import kotlin.math.pow

fun main() {
    println("Digite o valor de A:")
    val aString = readLine()
    val a = aString?.toDoubleOrNull()

    println("Digite o valor de B:")
    val bString = readLine()
    val b = bString?.toDoubleOrNull()

    println("Digite o valor de C:")
    val cString = readLine()
    val c = cString?.toDoubleOrNull()

    if (a != null && b != null && c != null) {
        val delta = b.pow(2) - 4 * a * c
        println("O valor de Delta (Δ) é: $delta")
    } else {
        println("Entrada inválida. Certifique-se de digitar números válidos para A, B e C.")
    }
}