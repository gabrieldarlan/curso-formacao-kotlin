package br.com.gdarlan.bytebank.modelo

class SistemaInterno {

    fun entra(admin: br.com.gdarlan.bytebank.modelo.Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {

            println("Falha na autenticação")
        }
    }
}