import modelo.Analista
import modelo.CalculadoraBonificacao
import modelo.Diretor
import modelo.Gerente

fun testaFuncionarios() {
    val gabriel = Analista(
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

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-45",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println()
    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificacao ${gui.bonificacao()}")
    println("plr ${gui.plr}")

    when {
        gui.autentica(4000) -> {
            println("Autenticou com sucesso")
        }
        else -> {
            println("Falha na autenticacao")
        }
    }


    val maria = Analista(
        nome = "Maria",
        cpf = "123.456.789-89",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(gabriel)
    calculadora.registra(karla)
    calculadora.registra(gui)
    calculadora.registra(maria)
    println("total bonificação: ${calculadora.total}")
}


