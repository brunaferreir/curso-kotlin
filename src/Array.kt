fun main(){
    // criando uma lista
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    println(cars[1])
    cars[0] = "Ferrari"

    println(cars[0])
    println(cars.size) // le o tamanho do array

    if ("Ferrari" in cars){ // sae ferrari existe na lista.
        println("Existe")
    }else{
        println("Nao existe")
    }

    for(car in cars){ // percorre a lista elemento por elemento
        println(car)

    }

}
