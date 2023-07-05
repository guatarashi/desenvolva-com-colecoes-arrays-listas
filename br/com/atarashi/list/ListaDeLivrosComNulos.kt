package br.com.atarashi.list

fun main() {
    listaLivrosComNulos.imprimeComMarcadores()

    listaDeLivros
        .groupBy { it.editora?: "editora desconhecida" }
        .forEach { (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }

}