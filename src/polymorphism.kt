//Polymorphism is simply the many forms of a method.
fun main() {

    var s = Shape()
    s.draw()

    var r = Rectangle()
    r.draw()

    var c = Circle()
    c.draw()
}

open class Shape{

    open fun draw(){
        println("Drawing a shape")
    }
}

class Rectangle: Shape(){

   override fun draw(){
        println("Drawing a rectangle")
    }
}

class Circle: Shape(){

   override fun draw(){
        println("Drawing a circle")
    }
}