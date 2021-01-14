fun main() {
    println("Bem vindo ao Bytebank")

    val contaGabriel = Conta()
    contaGabriel.titular = "Gabriel"
    contaGabriel.numero = 1000
    contaGabriel.saldo = 200.0

    var contaKarla = Conta()
    contaKarla.titular = "Karla"
    contaKarla.numero = 1001
    contaKarla.saldo = 300.0

    println(contaKarla.titular)
    println(contaKarla.numero)
    println(contaKarla.saldo)
    println()
    println(contaGabriel.titular)
    println(contaGabriel.numero)
    println(contaGabriel.saldo)

    println("Depositando na conta do Gabriel")
    deposita(contaGabriel, 50.0)
    println(contaGabriel.saldo)

    println("Depositando na conta do Gabriel")
    deposita(contaKarla, 70.0)
    println(contaKarla.saldo)


}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0


}


