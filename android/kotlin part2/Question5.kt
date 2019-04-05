package Exercise2

import java.util.*

fun main(args: Array<String>){
    gradeCalculator()
}

fun gradeCalculator() {

    println("Enter your Marks")
    var input = Scanner(System.`in`)
    var marks = input.nextInt()
    if (marks>=0 && marks<=100){
        when(marks){
           in 50..60 -> println("Good")
            in 61..70 -> println("Very Good")
            in 71..80 -> println("Excellent")
            in 81..100 -> println("Rockstar")
            else -> println("Failed")
        }
    }
}
