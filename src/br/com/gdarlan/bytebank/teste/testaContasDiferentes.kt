package br.com.gdarlan.bytebank.teste

import br.com.gdarlan.bytebank.modelo.Cliente
import br.com.gdarlan.bytebank.modelo.ContaCorrente
import br.com.gdarlan.bytebank.modelo.ContaPoupanca
import br.com.gdarlan.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Gabriel",
            cpf = "123.456.789-45",
            senha = 1000,
            endereco = Endereco(
                logradouro = "Rua Nena"
            )
        ),
        numero = 1000
    )

    println("titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereço: ${contaCorrente.titular.endereco.logradouro}")

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Karla",
            cpf = "999.654.123-45",
            senha = 1001
        ),
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo da conta corrente ${contaCorrente.saldo}")
    println("saldo da conta poupança ${contaPoupanca.saldo}")


    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo da conta corrente após saque ${contaCorrente.saldo}")
    println("saldo da conta poupança após saque ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca, 1001)

    println("")
    println("saldo da conta corrente após transferir para conta poupança: ${contaCorrente.saldo}")
    println("saldo da conta poupança após transferencia realizada pela conta corrente: ${contaPoupanca.saldo}")


    contaPoupanca.transfere(100.0, contaCorrente, 1000)
    println("")
    println("saldo da conta poupança após transferir para conta corrente: ${contaPoupanca.saldo}")
    println("saldo da conta corrente após transferencia realizada pela conta poupança: ${contaCorrente.saldo}")
}
