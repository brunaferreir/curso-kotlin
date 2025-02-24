//7. Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o salário de um
//funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.

fun main(){
    println("Digite a quantidade de dias trabalhados em um mês:")
    val diasString = readLine()
    val dias = diasString?.toIntOrNull()
    if (dias != null){
        val horas = dias * 8
        val ganha  = 25.00 * horas
        println("Seu salario neste mes foi de R$$ganha")
    }

}