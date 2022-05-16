package hw2

//TODO Task5

infix fun Rectangle.returnFields(otherPoint: Rectangle): Rectangle {
    return Rectangle(point1.plus(otherPoint.point1), point2.plus(otherPoint.point2))
}

fun main() {


    val recA = Rectangle(10, 20)
    val recB = Rectangle(30, 40)
    println(
        "Result of Objects is  ->  ${recA returnFields recB}"
    )

}