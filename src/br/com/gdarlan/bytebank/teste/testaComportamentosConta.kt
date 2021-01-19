import br.com.gdarlan.bytebank.modelo.Cliente
import br.com.gdarlan.bytebank.modelo.ContaCorrente
import br.com.gdarlan.bytebank.modelo.ContaPoupanca
import br.com.gdarlan.bytebank.modelo.Endereco

fun testaConta() {
    val contaGabriel = ContaCorrente(
        titular = Cliente(
            nome = "Gabriel",
            cpf = "123.456.789-78",
            senha = 1000,
            endereco = Endereco(
                logradouro = "Rua Nena"
            )
        ),
        numero = 1000,
    )
    contaGabriel.deposita(200.0)

    val contaKarla = ContaPoupanca(
        numero = 1001, titular = Cliente(
            nome = "Karla",
            cpf = "456.789.123-45",
            senha = 1001
        )
    )
    contaKarla.deposita(300.0)

    println(contaKarla.titular)
    println(contaKarla.numero)
    println(contaKarla.saldo)
    println()
    println(contaGabriel.titular)
    println(contaGabriel.numero)
    println(contaGabriel.saldo)
    println("Endereço: ${contaGabriel.titular.endereco.logradouro}")

    println("Depositando na conta do Gabriel")
    contaGabriel.deposita(50.0)
    println(contaGabriel.saldo)

    println("Depositando na conta do karla")
    contaKarla.deposita(70.0)
    println(contaKarla.saldo)

    println("Sacando da conta Gabriel")
    contaGabriel.saca(250.0)
    println(contaGabriel.saldo)

    println("Sacando da conta Karla")
    contaKarla.saca(100.0)
    println(contaKarla.saldo)

    println("saque em excesso na conta do Gabriel")
    contaGabriel.saca(100.0)
    println(contaGabriel.saldo)

    println("saque em excesso na conta da Karla")
    contaKarla.saca(500.0)
    println(contaKarla.saldo)

    println("Transferência da conta da Karla para o Gabriel")
    if (contaKarla.transfere(300.0, contaGabriel)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }

    println(contaGabriel.saldo)
    println(contaKarla.saldo)
}
