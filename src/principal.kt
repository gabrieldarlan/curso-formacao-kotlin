fun main() {
    println("Bem vindo ao Bytebank")

    var i = 0
    while (i <= 5) {
        val titular: String = "Gabriel $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }
//    for (i in 5 downTo 1) {
//        if (i == 4) {
//            continue
//        }
//        val titular: String = "Gabriel $i"
//        val numeroConta: Int = 1000 + i
//        var saldo: Double = i + 10.0
//
//        println("titular $titular")
//        println("número da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//    }
    // ou pode ser dessa forma!
//    for (i in 1.rangeTo(3)){
//        println(i)
//    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}
