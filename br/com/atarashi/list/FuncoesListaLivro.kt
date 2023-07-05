package br.com.atarashi.list

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
//        .filter { it != null }
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("#### Lista de Livros #### \n$textoFormatado")
}