fun main(args: Array<String>) {

    try {
        Class.forName("notaClass")
    } catch (e: ClassNotFoundException) {
        println(e.printStackTrace())
    } finally {
        println("This is finally block")
    }


    var cal:Cal
    try {
          cal=Cal()
    }
    catch (e: ExceptionInInitializerError){
    }
    cal=Cal()

}

class Cal{companion object {
    var notdefine:Int=1/0
}
}




























