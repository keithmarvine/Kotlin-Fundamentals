fun main() {

    var a = animal()
    a.sound()

    var d = duck()
    d.swim()

    var h = horse()
    h.movement()
}

// Parent class/Base Class/ Super Class
// By default, a class is private ie it can't be accessed by other classes
//Therefore, use the open keyword to make it inheritable
open class animal{
    var isMammal = true


    fun sound (){
        println("Animal is making a sound")
    }

    fun sleep(){
        println("Animal is sleeping")
    }

}


//Child class/Sub Class/ Derived Class
//We borrow by adding a colon and calling the name of the parent class and the brackets

class duck:animal() {

    var hasFeathers = true
    var color = "White"
    var hasbeak = true


    fun swim(){
        println("Duck is swimming")
    }
}

class horse:animal(){

    var hasTail = true
    var isWild = true

    fun movement(){
        println("Horse is galloping")
    }

}