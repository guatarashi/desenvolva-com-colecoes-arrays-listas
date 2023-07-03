package br.com.atarashi

fun main() {
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20

    val maiorIdade = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    } else if (idade2 > idade3 && idade2 > idade4) {
        idade2
    } else if (idade3 > idade4) {
        idade3
    } else {
        idade4
    }

    println("início: $maiorIdade")

    // evoluindo IntArray
    val idadesIntArray = IntArray(4)
    idadesIntArray[0] = 25
    idadesIntArray[1] = 19
    idadesIntArray[2] = 33
    idadesIntArray[3] = 20

    val maiorIdadeIntArray = if (idadesIntArray[0] > idadesIntArray[1] && idadesIntArray[0] > idadesIntArray[2] && idadesIntArray[0] > idadesIntArray[3]) {
        idadesIntArray[0]
    } else if (idadesIntArray[1] > idadesIntArray[2] && idadesIntArray[1] > idadesIntArray[3]) {
        idadesIntArray[1]
    } else if (idadesIntArray[2] > idadesIntArray[3]) {
        idadesIntArray[2]
    } else {
        idadesIntArray[3]
    }

    println("evoluindo IntArray: $maiorIdadeIntArray")

    // evoluindo intArrayOf
    val idadesIntArrayOf: IntArray = intArrayOf(25, 19, 33, 20)

    var maiorIdadeIntArrayOf = Int.MIN_VALUE

    for (idade in idadesIntArrayOf) {
        if (maiorIdadeIntArrayOf < idade) {
            maiorIdadeIntArrayOf = idade
        }
    }

    println("evoluindo maior idade intArrayOf: $maiorIdadeIntArrayOf")

    var menorIDadeIntArrayOf = Int.MAX_VALUE

    for (idade in idadesIntArrayOf) {
        if (idade < menorIDadeIntArrayOf) {
            menorIDadeIntArrayOf = idade
        }
    }

    println("evoluindo menor idade intArrayOf: $menorIDadeIntArrayOf")

    // alterando um elemento
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    val aumento = 1.1

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }

    println("salários: ${salarios.contentToString()}")

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println("salários: ${salarios.contentToString()}")
}