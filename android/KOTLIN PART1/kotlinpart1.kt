import java.util.*


fun main() {
    val read = Scanner(System.`in`)

    println("enter the String")
    var str1: String = read.nextLine()
    println("enter the substring from which we have to replace")
    val str2: String = read.nextLine()

    println("enter the word to be replaced with")
    val str3 :String = read.nextLine()

    str1= str1.replace(str2, str3)
    println("replaced string $str1")

}