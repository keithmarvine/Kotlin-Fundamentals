import java.util.Scanner

fun main() {

    var scan = Scanner(System.`in`)

    println("Enter day(1,2, 3, 4 or 5)")

    var day = scan.nextInt()

    var result = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"

        else -> "Invalid day of the week"
    }

    println("Today is $result")

}