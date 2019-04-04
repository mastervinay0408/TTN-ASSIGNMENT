import java.util.*

fun main(){

    val read = Scanner(System.`in`)
    println("enter the string")
    var str = read.nextLine()
    println("enter the character to find number of its occurrences in the string ")
    val ch = read.next()
    val StrSize : Int = str.length
    str=str.replace(ch,"")
    val StrNewSize : Int = str.length

    println("the frequency og character $ch : ${StrSize-StrNewSize}")

}