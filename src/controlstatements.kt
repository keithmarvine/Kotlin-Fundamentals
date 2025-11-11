import java.util.Scanner

fun main() {

    var scan= Scanner(System.`in`)


    println("Enter your age: ")

    var age = scan.nextInt()

    if (age>=18)  {
        println("You are eligible to vote!")
    }
    else if(age == 18) {
        println(("Are you a registered voter?"))
    }
    else {
        println("You are underage!")
    }


    }


