package com.example.ejercicio_13_m5

import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil

fun main(){
    var resultado = suma(5.5,6.4F)
    println(resultado)
    var redondeo = redondeo(param1=7.6)
    println(redondeo)
    var muestraResultado = muestraResultado(8.57)
    println(muestraResultado)
}

fun suma(param1: Double, param2: Float): Double = param1 + param2

fun redondeo(param1: Double) = ceil(param1)

fun muestraResultado(numero:Double):String{
    val format:NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("EUR"))
    println(format.format(numero))
    return format.format(numero)
}