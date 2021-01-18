package br.com.gdarlan.bytebank.modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : br.com.gdarlan.bytebank.modelo.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override fun bonificacao(): Double {
        println("bonificacao analista")
        return this.salario + 0.1
    }
}