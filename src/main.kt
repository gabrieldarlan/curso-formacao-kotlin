fun main() {
    println("Bem vindo ao Bytebank")

    val gabriel = Funcionario(
        nome = "Gabriel",
        cpf = "395-620-578-28",
        salario = 1000.0,
    )

    println("nome ${gabriel.nome}")
    println("cpf ${gabriel.cpf}")
    println("salario ${gabriel.salario}")
    println("bonificacao ${gabriel.bonificacao()}")

    val karla = Gerente(
        nome = "Karla",
        cpf = "415-789-632-2",
        salario = 2000.0,
        senha = 123
    )
    println()
    println("nome ${karla.nome}")
    println("cpf ${karla.cpf}")
    println("salario ${karla.salario}")
    println("bonificacao ${karla.bonificacao()}")

    when {
        karla.autentica(1234) -> {
            println("Autenticou com sucesso")
        }
        else -> {
            println("Falha na autenticacao")
        }
    }

}


