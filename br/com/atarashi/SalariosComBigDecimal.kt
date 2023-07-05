package br.com.atarashi

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    
    val salarios2 = bigDecimalArrayOf("1500.55", "2000.0", "5000.00", "10000.00")
    println(salarios2.contentToString())

    //
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios2
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    val salariosOrdenados = salariosComAumento.sorted()
    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()

    val media = tresUltimosSalarios.media()
    println(media)

    val media1 = salariosComAumento.sorted().takeLast(3).toTypedArray().media()
    println(media1)

    val mediaMenoresSalarios = salariosComAumento.sorted().take(3).toTypedArray().media()
    println(mediaMenoresSalarios)
}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}