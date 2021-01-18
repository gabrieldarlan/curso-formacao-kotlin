package br.com.gdarlan.bytebank.modelo

class Diretor(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int,
        val plr: Double
) : br.com.gdarlan.bytebank.modelo.FuncionarioAdmin(
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha
), br.com.gdarlan.bytebank.modelo.Autenticavel {
    override fun bonificacao(): Double {
        return this.salario + this.plr
    }


}