import java.util.Scanner

fun main() {

    var scan = Scanner(System.`in`)


    println("Enter First Number: ")

    var a = scan.nextDouble()

    println("Enter Operator: eg +, -, *, /")


    var operator = readln()




    println("Enter Second Number: ")

    var b = scan.nextDouble()

    var result = when(operator) {

        "+" -> (a+b)
        "-" -> (a-b)
        "*" -> (a*b)
        "/" -> (a/b)

        else -> "Invalid Operation. Please try again!"
    }
    println("Your answer is $result")
}