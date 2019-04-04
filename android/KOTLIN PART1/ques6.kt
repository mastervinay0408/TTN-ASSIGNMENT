

fun main() {

    var str1 = "hello iam vinay"
    for (items in 0 until str1.length) {
        for (letters in items +1 until str1.length) {
            if (str1[items] != '$') {
                if (str1[items] == str1[letters]) {
                    str1=str1.replace(str1[items], '$')
                    break
                }




            }
        }
    }

    str1=str1.replace("$","")

    println(str1)

}
