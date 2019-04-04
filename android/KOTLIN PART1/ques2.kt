
import java.util.*


fun main(){
    val read = Scanner(System.`in`)
    val str : String = read.nextLine()
    val arrayOfString = str.split(" ")
    val chars = HashMap<String,Int>()
    for(items in arrayOfString){
        if(items !in chars){

            chars[items]=1
        }
        else
            chars[items]= chars[items]!! + 1
    }

    println("the duplicate items frequencies are")
    for(items in chars.keys)
        println("$items :  ${chars[items]}")
}