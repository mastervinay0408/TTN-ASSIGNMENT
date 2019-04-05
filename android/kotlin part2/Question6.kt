package Exercise2

import java.util.*

fun main(args:Array<String>){

    var list = mutableListOf<Int>()
    list.add(0,10)
    list.add(1,20)
    list.add(2,30)
    list.add(3,40)
    list.add(4,50)
    list.add(5,60)
    println("Initial List Value")
    for(i in list){
        println(i)
    }
    var input = Scanner(System.`in`)
    println("Enter the number")
    var num = input.nextInt()
    list[1] = num

    println("List after changing second element")
    for(i in list){
        println(i)
    }
}