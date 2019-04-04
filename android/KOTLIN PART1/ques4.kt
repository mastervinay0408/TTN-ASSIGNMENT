import java.util.*




fun main(){
    val read = Scanner(System.`in`)
    println("enter the string to  find the percentage")
    val str : String = read.nextLine()
    var uppercase = 0        //uppercase represents count of uppercase characters
    var lowercase = 0        //lowercase represents count of lowercase characters
    var digits = 0       //digits represents count of digit characters
    var others = 0
    var size=str.length

    for(letters in str){
        if (Character.isUpperCase(letters)) {  //if character is uppercase character
            uppercase++
        }
         else if (Character.isLowerCase(letters)) {    //if character is lowercase character
        lowercase++;
        }
        else if (Character.isDigit(letters)) {    //if character is a digit character
        digits++;
        }
        else {      //if character is special character
        others++;
        }
    }



    val upperper = (uppercase * 100.0) / size
    val lowerper = (lowercase * 100.0) / size
    val digitper = (digits * 100.0) / size
    val otherper = (others * 100.0) / size


    println("In the string the percentage of ")
    println("uppercase: $upperper");
    println("lowercase: $lowerper");
    println("digits: $digitper");
    println("others: $otherper");

}

