



class Person(Firstname : String,LastName : String,age:Int) {

init {
    println("init block")
    println("First name : $Firstname")
    println("Last name : $LastName")
    println("Age : $age")


}
    companion object {
        fun callMe() {
            val Firstname="Vinay"
            val LastName="bansal"
            val age = 20
            println("companion call")
            println("First name  : $Firstname")
            println("Last name  : $LastName")
            println("Age   : $age")

        }
    }
}
    fun main(){
        Person.callMe()
        var person=Person("vinay","bansal",20)


    }


