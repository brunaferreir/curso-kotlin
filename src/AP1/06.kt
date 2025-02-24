//6. A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa em kotlin
//que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos
//quais ele foi alugado. Calcule o preço total a pagar, sabendo que o carro custa R$ 90,00 por dia e R$
//0,20 por Km rodado.

fun main(){
    println("Digite a quantidade de KM percorrido:")
    val kmString = readLine()
    val km = kmString?.toDoubleOrNull()

    println("Digite a quantidade de dias que foi alugado:")
    val diasString = readLine()
    val dias = diasString?.toIntOrNull()
    if(km != null && dias != null){
        val diaria = 90.00 * dias
        val kmRodado = 0.20 *km
        val total = diaria + kmRodado
        println("Total a pagar pela locação do carro foi: R$$total")

    }

}