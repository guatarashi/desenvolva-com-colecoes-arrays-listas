package br.com.atarashi.list

data class PrateleiraList(
    val genero: String,
    val livros: List<Livro>
) {

    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}