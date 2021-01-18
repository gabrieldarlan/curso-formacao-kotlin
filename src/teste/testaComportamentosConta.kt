import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaConta() {
    val contaGabriel = ContaCorrente(titular = "Gabriel", numero = 1000)
    contaGabriel.deposita(200.0)

    val contaKarla = ContaPoupanca(numero = 1001, titular = "Karla")
    contaKarla.deposita(300.0)

    println(contaKarla.titular)
    println(contaKarla.numero)
    println(contaKarla.saldo)
    println()
    println(contaGabriel.titular)
    println(contaGabriel.numero)
    println(contaGabriel.saldo)

    println("Depositando na conta do Gabriel")
    contaGabriel.deposita(50.0)
    println(contaGabriel.saldo)

    println("Depositando na conta do karla")
    contaKarla.deposita(70.0)
    println(contaKarla.saldo)

    println("Sacando da conta Gabriel")
    contaGabriel.saca(250.0)
    println(contaGabriel.saldo)

    println("Sacando da conta Karla")
    contaKarla.saca(100.0)
    println(contaKarla.saldo)

    println("saque em excesso na conta do Gabriel")
    contaGabriel.saca(100.0)
    println(contaGabriel.saldo)

    println("saque em excesso na conta da Karla")
    contaKarla.saca(500.0)
    println(contaKarla.saldo)

    println("Transferência da conta da Karla para o Gabriel")
    if (contaKarla.transfere(300.0, contaGabriel)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }

    println(contaGabriel.saldo)
    println(contaKarla.saldo)
}
