class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override fun bonificacao(): Double {
        println("bonificacao: diretor")
        return super.bonificacao() + this.salario + this.plr
    }

    fun autentica(senha: Int): Boolean {
        return when (this.senha) {
            senha -> {
                true
            }
            else -> false
        }
    }
}