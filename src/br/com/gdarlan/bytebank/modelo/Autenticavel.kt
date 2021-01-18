package br.com.gdarlan.bytebank.modelo

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}