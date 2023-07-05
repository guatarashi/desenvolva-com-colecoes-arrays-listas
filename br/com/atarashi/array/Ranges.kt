package br.com.atarashi.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    println()

    //
    var numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    println()

    //
    numerosPares = 0.until(100) step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    println()

    //
    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }

    println()

    //
    val intervalo = 1500.0..5000.0
    val salario = 5001.0

    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    //
    val alfabeto = 'a'..'z'
    val letra = 'K'

    println(letra in alfabeto)

    //
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.max()
    println("Maior idade: $maiorIdade")

    //
    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    //
    val media = idades.average()
    println("Média: $media")

    //
    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores: $todosMaiores")

    //
    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    //
    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    //
    val busca = idades.find { it >= 18 }
    println("Busca: $busca")

    //
    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
    salarios[0] = "1500.0".toBigDecimal()
    salarios[1] = "2000.0".toBigDecimal()
    println(salarios.contentToString())

    //
    val salarios2 = bigDecimalArrayOf("1500.55", "2000.0", "5000.00", "10000.00")
    println(salarios2.contentToString())

    //
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios2
        .map { salario ->
            if (salario < "5000".toBigDecimal()) {
                salario + "500".toBigDecimal()
            } else {
                (salario * aumento).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()

    println(salariosComAumento.contentToString())
}
