/*Bautista Rosales Alexis Axel */

fun main() {
    print("Ingresa tu edad: ")
    val age = readLine()?.toInt()

    when (age) {
        0 -> println("Eres un recién nacido")
        1 -> println("Tienes un año de edad")
        in 2..5 -> println("Estás muy niñ@")
        in 6..11 -> println("Ya eres un niñ@ grande")
        in 12..14 -> println("Eres un preadolescente")
        in 15..17 -> println("Ya eres un adolescente sin dudarlo")
        in 18..25 -> println("Eres un adulto aunque lo niegues")
        else -> {
            println("Edad invalida")
        }
    }
}
