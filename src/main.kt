fun main() {
    println("Bem vindo ao Bytebank")

    val contaCorrente = ContaCorrente(
        titular = "Gabriel",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Karla",
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

    contaCorrente.transfere(100.0, contaPoupanca)

    println("")
    println("saldo da conta corrente após transferir para conta poupança: ${contaCorrente.saldo}")
    println("saldo da conta poupança após transferencia realizada pela conta corrente: ${contaPoupanca.saldo}")


    contaPoupanca.transfere(100.0, contaCorrente)
    println("")
    println("saldo da conta poupança após transferir para conta corrente: ${contaPoupanca.saldo}")
    println("saldo da conta corrente após transferencia realizada pela conta poupança: ${contaCorrente.saldo}")


}
