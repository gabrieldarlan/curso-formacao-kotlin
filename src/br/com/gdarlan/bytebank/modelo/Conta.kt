package br.com.gdarlan.bytebank.modelo

import br.com.gdarlan.bytebank.exception.FalhaAutenticacaoException
import br.com.gdarlan.bytebank.exception.SaldoInsuficienteException
import java.lang.RuntimeException


abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object { // é uma especia de propriedade  estatica
        var total = 0
    }

    init {
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "Saldo insuficiente. Saldo atual: $saldo, valor a ser subtraido: $valor")
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
        throw RuntimeException()
        this.saldo -= valor
        destino.deposita(valor)
    }
}


class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}