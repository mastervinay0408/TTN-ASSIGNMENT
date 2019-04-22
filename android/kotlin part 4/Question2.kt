package Exercise4

fun main(args:Array<String>){
    var list = ArrayList<Employee>()
    list.add(Employee("Vishal", 23))
    list.add(Employee("Shubham", 31))
    list.add(Employee("Gaurav", 25))
    list.add(Employee("Abhishek", 35))
    list.add(Employee("Rakshit", 30))
    list.add(Employee("Umang", 33))

    var res = list.filter { it.age!! >=30 }.map { it.name }
    println(res)    
}

class Employee(var name: String, var age: Int)
