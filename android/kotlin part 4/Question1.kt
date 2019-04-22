package Exercise4

fun main(args: Array<String>) {
    val calc = Calculate()
    val myLambda: (Int, Float, Int) -> Float = { p: Int, r: Float, t: Int -> ((p * r * t) / 100) }      // Lambda Function
    calc.calcSimpleInterest(5000,2.5f,3,myLambda)
}

class Calculate {

    fun calcSimpleInterest(principle: Int, rate: Float, time: Int, action: (Int, Float, Int) -> Float) {
        var SI = action(principle, rate, time)
        println("Simple Interest is: $SI")
    }
}