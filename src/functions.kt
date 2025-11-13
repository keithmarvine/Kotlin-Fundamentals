// A piece of code used to perform a specific task

//1. Inbuilt/Standard functions

fun main() {
    var result = Math.sqrt(144.0)
    println("The squareroot of 144 is $result")

    var number = Math.round(56.89)

    println("The output is $number")

    day()
    student("Mark",24,"MIT")
    student("Jane",20,"Fullstack")

    println()

    add(45,90)

    println()

    dog("Tito", "German Shepherd", 2)
    dog("Asanted", "Greyhound", 3)
    dog("Nwito", "Matt", 5)

}
// 2. User-defined Functions

fun day (){
    println("Today is Wednesday!")
}

//Parameters(Variables) and arguments(values assigned to variables)
fun student (name: String, age: Int, course: String) {
    println("Name: $name, Age: $age, Course: $course")
}

fun add (num1: Int, num2: Int) {
    println(num1+num2)
}

fun dog(name: String, breed: String, age: Int){
    println(name + " " + breed + " "+ age)
}
