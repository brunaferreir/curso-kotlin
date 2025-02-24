//8. [DESAFIO] Escreva um programa em kotlin para calcular a redução do tempo de vida de um
//fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou.
//Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um
//fumante perderá e exiba o total em dias.

fun main() {
    print("Digite a quantidade de cigarros fumados por dia: ")
    val cigarrosPorDia = readLine()?.toIntOrNull()

    print("Digite a quantidade de anos que você já fumou: ")
    val anosFumando = readLine()?.toIntOrNull()

    if (cigarrosPorDia != null && anosFumando != null) {

        val totalCigarros = cigarrosPorDia * 365 * anosFumando

        val perdaMinutos = totalCigarros * 10

        val perdaDias = perdaMinutos / (24 * 60)

        println("Você já perdeu aproximadamente $perdaDias dias de vida.")
    } else {
        println("Entrada inválida. Certifique-se de digitar números inteiros.")
    }
}