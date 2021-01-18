package modelo

import modelo.Autenticavel
import modelo.FuncionarioAdmin

class Gerente(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int
) : FuncionarioAdmin(
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha
), Autenticavel {
    override fun bonificacao(): Double {
        return this.salario
    }
}