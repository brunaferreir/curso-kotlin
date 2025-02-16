//Entrada der dados com ReadLine
fun main(arg: Array<String>){

    //READLINE ê uma linha de entrada do fluxo de entrada padrão.
    println("Digite o valor de X:")
    val x = readLine()?.toInt()!!

    println("Digite o valor de Y:")
    val y = readLine()?.toInt()!! //valor inteiro nao nulo
    val z = (x+y)

    println("Resultado = $z")

}
