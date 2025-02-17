// entrada da dados
import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    var numero: Int

    println("Digite um numero(0 para sair):")
    numero = scanner.nextInt()

    while (numero != 0){
        println("Voce didigitou: $numero")
        println("Digite outro numero(0 para sair):")
        numero = scanner.nextInt()
    }
    println("Programa encerrado")


}