object Utility{
    fun add( firstNo : Int, secondNo : Int) : Int{
        return firstNo +secondNo
    }}


fun main(){
    var singleton=Utility
    var a =singleton.add(10,20)
    println("Suma of two numbers is $a")

}
