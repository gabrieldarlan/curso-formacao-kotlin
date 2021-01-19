package br.com.gdarlan.bytebank.teste

import br.com.gdarlan.bytebank.modelo.*


fun testaObjects() {
    val karla = object : Autenticavel {
        val nome: String = "Karla"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(karla, 1000)
    println("nome do cliente: ${karla.nome}")

    val gabriel = Cliente(nome = "Gabriel", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = gabriel, numero = 1000)
    val contaCorrente = ContaCorrente(titular = gabriel, numero = 1000)

    testaContasDiferentes()
    println("Total de contas criadas: ${Conta.total}")
}
