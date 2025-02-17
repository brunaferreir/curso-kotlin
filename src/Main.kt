fun main() {
    val name = "Bruna"
    val name2 = "Ferreira"
    var peso = 57
    var altura = 1.67
    var possuiAviao = "sim"

    println("Nome: $name")
    println("Sobrenome: $name2")
    println("Peso: $peso")
    println("Altura $altura")
    println("Possui avião? $possuiAviao")


}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var txt = "Eu AMO kotlin"
    println(txt[0])
    println(txt[2])

    var txt2 = "Hoje é segunda, bora segundar!"
    println("Tamanho: ${txt2.length}")
    //println("Tamanho: +{txt2.length}")

    var txt3 = "palmeiras não tem mundial"
    println(txt3.uppercase())

    var txt4 = "PALMEIRAS NÃO TEM MUNDIAL"
    println(txt3.lowercase())

    var txt5 = "Eu AMO kotlin"
    var txt6 = "Eu AMO kotlin"
    println(txt5.compareTo(txt6))

    var txt7 = "Please locate where 'locate' occurs!"
    println(txt7.indexOf("locate"))

    // Concatenação de String +

    var firstName = "Adam"
    var lastName = "Sandler"
    println("Olá, eu sou "+firstName+" "+lastName)

    // Interpolação de String

    var firstName2 = "Mike"
    var lastName2 = "Wazowski"
    println("My name is $firstName2 $lastName2")
    println("O nome Mike tem ${firstName2.length} letras" )
    println("O sobrenome Wazowski tem ${lastName2.length}")
}
