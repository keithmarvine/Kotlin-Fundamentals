import java.util.Scanner


fun main() {

    var read = Scanner(System.`in`)

    println("Enter your fullname")

    var fullname = readln()
    println("Fullname : $fullname")

    println()

    println("Enter your age: ")
    var age = read.nextInt()
    println("You are $age years old")

    println()

    println("Enter your weight(kg): ")

    var weight = read.nextDouble()
    println("You are $weight kilograms" )


}