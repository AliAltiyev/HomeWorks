package hw2

// TODO TASK 2
open class Rectangle(val point1: Int, val point2: Int) {

    init {
        println(Math.random().times(137).toInt())
    }


    override fun toString(): String {
        return "$point1 , $point2"
    }
}

class Sub(point1: Int, point2: Int) : Rectangle(point1, point2)

//TODO TASK4
class Util(rectangle: Rectangle, point1: Int, point2: Int) : Rectangle(point1, point2) {
    fun returnFields(point1: Int, point2: Int): Int {
        return point1.plus(point2)
    }

}


fun main() {
    Rectangle(11, 22)
    Rectangle(44, 33)
}