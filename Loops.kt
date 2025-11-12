// While loop

fun main() {
    // Program 1 : Increment
    var number = 20

    while(number <= 25){
        println("Number : $number")
        number++
    }
    println()
    // Program 2: Decrement
    var mark = 40

    while(mark >=35){
        println("Score: $mark")
        mark--
    }

    println()

//Do...while loop
    var num = 1

    do {
        println("Number is $num")
        num ++
    }
    while (num <= 5)

    println()

// For Loop
    for (letter in 'a'.. 'z'){
        println("Letter: $letter")
    }

    println()

    for (x in 34..100){
        println(x)
    }
 println()

//Break and continue statement
    for (y in 50..60){
        if (y==58){
            continue //(it skips the particular number and moves on)
            //break   (stops at the particular point)

        }
        println("Number: $y")
    }








}