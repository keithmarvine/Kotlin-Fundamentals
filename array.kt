fun main() {
   // an array is a way to store multiple values of the same type together in one variable.

    //Creating Arrays

    // Using arrayOf

    val numbers = arrayOf(1, 2, 3, 4)
    val names = arrayOf("Alice", "Bob", "Charlie")


//    numbers[0] → 1
//
//    names[1] → "Bob"
//
//    Using Array constructor

    val squares = Array(5) { i -> i * i } // 0, 1, 4, 9, 16

//
//    Array(5) → creates 5 elements
//
//    { i -> i * i } → defines the value for each index i
//
//    Accessing and Changing Values
    val fruits = arrayOf("Apple", "Banana", "Cherry")

    println(fruits[0]) // Apple

    fruits[1] = "Blueberry" // Change Banana to Blueberry

    println(fruits[1]) // Blueberry

//    Useful Array Functions
//
//    size → number of elements
//
//    first() → first element
//
//    last() → last element
//
//    contains(value) → checks if value exists
//
//    indexOf(value) → gives index of a value

    val nums = arrayOf(10, 20, 30)
    println(nums.size) // 3
    println(nums.contains(20)) // true
    println(nums.indexOf(30)) // 2

//    Special Arrays for Primitives
//
//    Kotlin has specialized arrays for efficiency:
//
//    IntArray, DoubleArray, BooleanArray, etc.

    val intNums = IntArray(3) { it * 2 } // 0, 2, 4



//    An array stores multiple values of the same type.
//
//    Use arrayOf or Array(size){} to create one.
//
//    Access values with [index] and modify them the same way.


}