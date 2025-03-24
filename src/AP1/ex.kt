/*01. O código abaixo representa categorias diferentes de zumbis, no entanto há alguns erros presentes no código.
Revise o código e o reescreva da forma correta */

// o tipo da variavel "nome" é string. a função "exibirInformacoes" está sem parenteses
open class Zumbi(val nome:Int, val estagioInfeccao: Int){
    open fun exibirInformacoes{
        println("Nome: $nome, Estágio de Infecção: $estagioInfeccao")
    }
}

// O tipo da variável "nome" está escrita de forma incorreta
class Corredor(nome: string, estagioInfeccao: Int,) : Zumbi(nome, estagioInfeccao){
    override fun exibirInformacoes(){
        super.exibirInformacoes()
    }
    fun correr(){
        println("O zumbi $nome corre")
    }
}

// A classe "Estalador" está faltando o atributo nome derivado da classe "Zumbi".
//A função "exibirInformacoes" está faltando o override.
class Estalador(nome: String, estagioInfeccao: Int,) : Zumbi(estagioInfeccao){
    fun exibirInformacoes(){
        super.exibirInformacoes()
    }
    fun ecolocalização(){
        println("O zumbi $nome emite sons para se localizar")
    }
}


fun main() {
    val zumbi1 = Corredor(" Corredor X-01", 1)
    zumbi1.exibirInformacoes()
    zumbi1.correr()
    val zumbi2 = Estalador("Estalador X-02", 2)
    zumbi2.exibirInformacoes()
    zumbi2.ecolocalização()
}

/* resposta:
open class Zumbi(val nome:String, val estagioInfeccao: Int){
    open fun exibirInformacoes(){
        println("Nome: $nome, Estágio de Infecção: $estagioInfeccao")
    }
}

class Corredor(nome: String, estagioInfeccao: Int,) : Zumbi(nome, estagioInfeccao){
    override fun exibirInformacoes(){
        super.exibirInformacoes()
    }
    fun correr(){
        println("O zumbi $nome corre")
    }
}

class Estalador(nome: String, estagioInfeccao: Int,) : Zumbi(nome, estagioInfeccao){
    override fun exibirInformacoes(){
        super.exibirInformacoes()
    }
    fun ecolocalização(){
        println("O zumbi $nome emite sons para se localizar")
    }
}

fun main() {
    val zumbi1 = Corredor(" Corredor X-01", 1)
    zumbi1.exibirInformacoes()
    zumbi1.correr()
    val zumbi2 = Estalador("Estalador X-02", 2)
    zumbi2.exibirInformacoes()
    zumbi2.ecolocalização()
}
*/
