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

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false

    }
}


