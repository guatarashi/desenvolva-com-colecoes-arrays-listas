package br.com.atarashi.list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    // dessa forma as ordenações são feitas conforme o esperado
//    prateleira.organizarPorAutor().imprimeComMarcadores()
//    prateleira.organizarPorAnoPublicacao().imprimeComMarcadores()

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()


    // já neste caso a ordenação é o igual para as duas variáveis, porque o MutableList é mutável e permite o uso da função sortBy que reorganiza
    // os elementos da coleção que a invocou de acordo com o critério
    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()

    val prateleiraList = PrateleiraList(genero = "Literatura", livros = listaDeLivros)

    val porAutorList = prateleiraList.organizarPorAutor()
    val porAnoPublicacaoList = prateleiraList.organizarPorAnoPublicacao()

    // agora quando é usado List a ordenação é feita pela função sortedBy que cria uma nova coleção sem interferir no objeto que invoca a função
    porAutorList.imprimeComMarcadores()
    porAnoPublicacaoList.imprimeComMarcadores()
}