/*
Bautista Rosales Alexis Axel */

 const val ladoA = 5
 const val ladoB = 6
 const val ladoC = 7

fun main() {
    // Genera tres números aleatorios para representar las longitud de los valores

    println("Longitud de los valores:")
    println("Lado A: $ladoA")
    println("Lado B: $ladoB")
    println("Lado C: $ladoC")

    // Verifica el tipo de triángulo
    if (ladoA == ladoB && ladoB == ladoC) {
        println("El triángulo es equilátero.")
    } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
        println("El triángulo es isósceles.")
    } else {
        println("El triángulo es escaleno.")
    }
}
