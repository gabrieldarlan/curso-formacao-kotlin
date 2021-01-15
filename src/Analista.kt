class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override fun bonificacao(): Double {
        println("bonificacao analista")
        return super.bonificacao() + this.salario + 0.1
    }
}