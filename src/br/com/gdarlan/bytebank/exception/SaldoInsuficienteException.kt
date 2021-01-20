package br.com.gdarlan.bytebank.exception

import java.lang.RuntimeException

class SaldoInsuficienteException() : RuntimeException("Saldo insuficiente") {
}