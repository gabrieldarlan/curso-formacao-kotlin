package br.com.gdarlan.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: br.com.gdarlan.bytebank.modelo.Funcionario) {
        this.total += funcionario.bonificacao()
    }

//    fun registra(gerente: br.com.gdarlan.modelo.Gerente) {
//        this.total += gerente.bonificacao()
//    }
//
//    fun registra(diretor: br.com.gdarlan.modelo.Diretor) {
//        this.total += diretor.bonificacao()
//    }

}