package Exercise2

import java.util.*

fun main(args:Array<String>){
    var input = Scanner(System.`in`)
    var set = HashSet<String>()
    println("Start Entering Elements")
    for(i in 0..5){
        set.add(input.nextLine())
    }

    for(i in set){
        println(i)
    }
}