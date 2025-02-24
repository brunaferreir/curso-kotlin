//5. Faça um programa em kotlin que leia o salário de um funcionário, calcule e mostre o seu novo salário,
//com 15% de aumento.

fun main(){
    println("Digite seu salario:")
    val salarioString = readLine()
    val salario = salarioString?.toDoubleOrNull()

    if (salario != null){
        val aumento  = salario * 0.15
        val salarioCalmento = salario + aumento
        println("Seu salario atual com aumento é de $salarioCalmento")
    }else{
        println("Entreda invalida!")
    }
}