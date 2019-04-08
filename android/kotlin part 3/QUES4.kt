


fun main() {


    var str1: String = "Vinay "
    var str2: String = "Bansal"
    var str3: String = "Hello "
    println(str3.add(str1, str2))
}
//Extension Function
fun String.add(str1: String, str2: String): String {
    return this + str1 + str2
}
