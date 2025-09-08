package tutorial

// 목표: 공통된 트을 정의하고, 구체적인 구현은 자식에게 맡기기

abstract class Shape {
    abstract fun area(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun area() = 3.14 * radius * radius
}

class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area() = width * height
}

fun main() {
    val shapes: List<Shape> = listOf(Circle(2.0), Rectangle(3.0, 4.0))
    for (shape in shapes) {
        println("면적: ${shape.area()}")
    }
}

// 핵심: Shape는 설계도 역할만 하고, 구체적인 계산은 자식 클래스에서 구현