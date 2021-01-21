package br.com.gdarlan.bytebank

import br.com.gdarlan.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua nena")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalStateException("Complemento é obrigatório")
        println(tamanhoComplemento)
    }

}