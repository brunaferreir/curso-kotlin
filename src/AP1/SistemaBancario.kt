package AP1

open class ContaBancaria(val nomeTitular: String, var saldoConta: Double) {

    open fun depositar(valor: Double) {
        if (valor > 0) {
            saldoConta += valor
            println("Depósito de R$%.2f realizdo com sucesso.".format(valor))
        } else {
            println("Valor de depósito inválido.")
        }
    }

    open fun sacar(valor: Double) {
        if (valor > 0 && valor <= saldoConta) {
            saldoConta -= valor
            println("Saque de R$%.2f realizado com sucesso.".format(valor))
        } else {
            println("Saque não permitido. Verifique o valor ou saldo insuficiente.")
        }
    }

    open fun exibirSaldo() {
        println("Saldo da conta de $nomeTitular: R$%.2f".format(saldoConta))
    }
}


class ContaCorrente(nomeTitular: String, saldoConta: Double, val taxaOperacao: Double = 5.0) :
    ContaBancaria(nomeTitular, saldoConta) {

    override fun sacar(valor: Double) {
        val valorTotal = valor + taxaOperacao
        if (valorTotal > 0 && valorTotal <= saldoConta) {
            saldoConta -= valorTotal
            println("Saque de R$%.2f realizado com sucesso. Taxa de operação: R$%.2f".format(valor, taxaOperacao))
        } else {
            println("Saque não permitido. Verifique o valor ou saldo insuficiente.")
        }
    }
}

class ContaPoupanca(nomeTitular: String, saldoConta: Double, val rendimento: Double = 0.02) :
    ContaBancaria(nomeTitular, saldoConta) {

    override fun depositar(valor: Double) {
        if (valor > 0) {
            val valorRendimento = valor * rendimento
            saldoConta += valor + valorRendimento
            println("Depósito de R$%.2f realizado com sucesso. Rendimento de R$%.2f aplicado.".format(valor, valorRendimento))
        } else {
            println("Valor de depósito inválido.")
        }
    }
}


fun main() {
    val contaCorrente = ContaCorrente("João", 1000.0)
    contaCorrente.exibirSaldo()
    contaCorrente.depositar(500.0)
    contaCorrente.sacar(200.0)
    contaCorrente.exibirSaldo()

    println("\n")

    val contaPoupanca = ContaPoupanca("Maria", 500.0)
    contaPoupanca.exibirSaldo()
    contaPoupanca.depositar(1000.0)
    contaPoupanca.sacar(100.0)
    contaPoupanca.exibirSaldo()
}
