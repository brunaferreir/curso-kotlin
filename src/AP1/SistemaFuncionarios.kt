package AP1

open class Funcionario (val nome: String, val salario: Double){
    open fun exibirInformacoes():String{
        return "Nome do funcionario: $nome, Salario: $salario "
    }
}

class Gerente(nome: String, salario: Double, val bonus: Double) : Funcionario(nome, salario) {
    override fun exibirInformacoes(): String {
        return "${super.exibirInformacoes()}, Bônus: $bonus, Salário total: ${salario + bonus}"
    }
}

class Desenvolvedor(nome: String, salario: Double, val linguagemProgramacao: String) : Funcionario(nome, salario) {
    override fun exibirInformacoes(): String {
        return "${super.exibirInformacoes()}, Linguagem de programação: $linguagemProgramacao"
    }
}

fun main() {
    val funcionarios: List<Funcionario> = listOf(
        Funcionario("Samuel", 2000.0),
        Funcionario("Maria", 2500.0),
        Gerente("Gustavo", 5000.0, 1000.0),
        Gerente("Ana", 6000.0, 1500.0),
        Desenvolvedor("Pedro", 3000.0, "Kotlin"),
        Desenvolvedor("Bruna", 3500.0, "Java")
    )

    for (funcionario in funcionarios) {
        println(funcionario.exibirInformacoes())
    }
}

