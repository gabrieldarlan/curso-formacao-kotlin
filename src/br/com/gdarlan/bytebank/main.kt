import br.com.gdarlan.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco(
        logradouro = "Rua Nena",
        bairro = "Vila Cretti",
        cep = "0000000"
    )

    val endereco1 = Endereco(
        logradouro = "Rua Nena",
        bairro = "Vila Cretti",
        cep = "0000000"
    )

    println(endereco.equals(endereco1))


    println(endereco)
}
