//1. Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre
//quantos dólares ela pode comprar. Considere US$1,00 = R$5,75.

import java.util.Locale
fun main(){
    val cotacaoDolar = 5.75
    print("Digite o valor em reais (R$): ")
    val valorReaisString = readLine()

    val valorReais = valorReaisString?.toDoubleOrNull()

    if (valorReais != null) {
        val valorDolares = valorReais / cotacaoDolar

        val formatoAmericano = String.format(Locale.US, "%,.2f", valorDolares)

        println("O valor em dólares (US$) é: $formatoAmericano")

    } else {
        println("Entrada inválida. Certifique-se de digitar um número real.")
    }
}