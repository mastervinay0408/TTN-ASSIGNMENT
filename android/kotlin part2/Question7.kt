package Exercise2

import java.util.*

fun main(args:Array<String>){
    var input = Scanner(System.`in`)
    var map = mutableMapOf<Int, String>()
    for(i in 0..9){
        println("Enter $i th element")
        map[i] = "${input.nextLine()}"
    }
    for((k,v) in map){
        println("$k = $v")
    }
}