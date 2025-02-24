//4. Crie um programa em Kotlin que leia o preço de um produto, calcule e mostre o seu PREÇO
// PROMOCIONAL, com 5% de desconto.

fun main(){
    println("Digite o preço do produto:")
    val precoString = readLine()
    val preco = precoString?.toDoubleOrNull()

    if (preco != null){
        val desconto = preco * 0.05
        val valorCdesconto = preco - desconto
        println("Valor do produto com desconto $valorCdesconto")

    }else{
        println("Entrada inválida.")
    }
}

