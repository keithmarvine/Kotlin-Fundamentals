fun main() {
    var dogA = Dog("Kiki","Chihuahua", 3)

    println(dogA.name + " " +  dogA.breed + " " + dogA.age + "Years old")
    var dogB = Dog("Bob","German Shephered", 6 )

    println(dogB.name + " " +  dogB.breed + " " +  dogB.age + "Years old")

    var dogC = Dog("Caleb","Dober", 4)

    println(dogC.name+ " " +  dogC.breed+ " " +   dogC.age + "Years old")


}

class Dog(var name : String, var breed: String, var age: Int){

}