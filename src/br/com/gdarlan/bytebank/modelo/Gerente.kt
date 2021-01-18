package br.com.gdarlan.bytebank.modelo

class Gerente(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int
) : br.com.gdarlan.bytebank.modelo.FuncionarioAdmin(
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha
), br.com.gdarlan.bytebank.modelo.Autenticavel {
    override fun bonificacao(): Double {
        return this.salario
    }
}