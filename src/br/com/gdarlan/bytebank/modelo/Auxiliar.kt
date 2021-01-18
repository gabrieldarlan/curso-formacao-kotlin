package br.com.gdarlan.bytebank.modelo

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : br.com.gdarlan.bytebank.modelo.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override fun bonificacao(): Double {
        return salario + 0.05
    }
}