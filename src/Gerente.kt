class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override fun bonificacao(): Double {
        return this.salario
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