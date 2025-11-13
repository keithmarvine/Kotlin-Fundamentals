fun main() {
    // Arrays are used to store multiple values in a single variable.

   // To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:

    var artist = arrayOf("John Mayer", "Taylor Swift", "Bruno Mars", "Dan Seals")

   // To access an array element we refer to the index number, inside square brackets.


    println(artist[0])

    println()

   // To change the value of a specific element, refer to the index number:
    artist[0] = "Iggy Azalea"
    println(artist[0])

    println()

    // To find out how many elements an array have, use the size property:

    println(artist.size)

    println()

    // You can use the in operator to check if an element exists in an array:

    if ("Taylor Swift" in artist) {
        println("Is an artist!")
    } else {
        println("Is not an artist.")
    }

    println()
    // Looping through an Array:

    for (x in artist) {
        println(x)
    }

}