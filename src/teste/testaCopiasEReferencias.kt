import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    //    val numeroX = 10
//    var numeroY = numeroX
//    numeroY++
//    println("numeroX $numeroX")
//    println("numeroY $numeroY")

    val contaJoao = ContaPoupanca("João", 1002)
    var contaMaria = ContaCorrente("Maria", 1003)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaMaria)
    println(contaJoao)
}
