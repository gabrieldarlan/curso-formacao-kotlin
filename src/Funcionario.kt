open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    open fun bonificacao(): Double {
        println("bonificacao funcionario")
        return this.salario * 0.1
    }
}