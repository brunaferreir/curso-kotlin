//2. Faça um programa em kotlin que leia a largura e altura de uma parede, calcule e mostre a área a ser
//pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma
//área de 2 metros quadrados.

fun main(){
    println("Digite a largura da parede (em metros):")
    val larguraString = readLine()

    val  largura = larguraString?.toDoubleOrNull()

    println("Digite a altura da parede (em metros):")
    val alturaString = readLine()

    val altura = alturaString?.toDoubleOrNull()

    if (largura != null && altura != null){
        val area = altura * largura
        println("A área da parede é de $area metros quadrados.")

        val litrosTinta  = area / 2
        println("A quantidade de tinta necessária é de $litrosTinta litros.")
    } else {
        println("Entrada inválida. Certifique-se de digitar números válidos para largura e altura.")
    }
}
















