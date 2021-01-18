import br.com.gdarlan.bytebank.modelo.Cliente
import br.com.gdarlan.bytebank.modelo.ContaCorrente
import br.com.gdarlan.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    //    val numeroX = 10
//    var numeroY = numeroX
//    numeroY++
//    println("numeroX $numeroX")
//    println("numeroY $numeroY")

    val contaJoao = ContaPoupanca(
        Cliente(
            nome = "Gabriel",
            cpf = "395.456.741-36",
            senha = 1001
        ), 1002
    )
    val contaMaria = ContaCorrente(
        Cliente(
            nome = "Karla",
            cpf = "456.789.456-96",
            senha = 1001
        ), 1003
    )

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaMaria)
    println(contaJoao)
}
