/*Bautista Rosales Alexis Axel */
const val x1=4f
const val y1=3f
const val x2=-3f
const val y2=-2f

fun main() {
    
    var pen =0f
    
    println("Resolver el valor de la pendiente, tomando en cuenta que: P1(4,3), P2(-3,-2) ")
    
    pen= (y2-y1)/(x2-x1)
    
    println("La respuesta es $pen")
}
