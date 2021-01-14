fun testaCopiasEReferencias() {
    //    val numeroX = 10
//    var numeroY = numeroX
//    numeroY++
//    println("numeroX $numeroX")
//    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = Conta()
    contaMaria.titular = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaMaria)
    println(contaJoao)
}
