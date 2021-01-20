package br.com.gdarlan.bytebank

import br.com.gdarlan.bytebank.exception.SaldoInsuficienteException
import testaComportamentosConta

//cap02-01
//Lidando com exceptions com o try expression
fun main() {
    println("início main")
    testaComportamentosConta()

    println("fim main")
}


fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
        println("SaldoInsuficienteException capturado")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
//teste
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw SaldoInsuficienteException("Saldo insuficiente")
    }
    println("fim funcao2")
}