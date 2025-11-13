fun main() {

    var employee1 = Employee()  //Creating an object
    println(employee1.name)

    var employee2 = Employee()
    println(employee2.name)

    var employee3 = Employee()


}

class Employee {
    //Attributes
    var name = "John"
    var position = "Admin"
    var gender = "Male"
    var age = 45

    //Behavior/Method
    fun movement() {
        println("The Employee is moving")

    }

}