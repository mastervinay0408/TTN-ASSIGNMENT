public class Question4 {
    /*Question 4: Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters,
    Digits And Other Special Characters In A String*/

    static String string = "Train Runs @ Speed Of 100 km/hour in our Country.";     //let string be the input used

    public static void main(String[] args) {
        characterPercentage(string);
    }

    private static void characterPercentage(String s) {
        int character = s.length();      //obtaining no of characters in the string
        int uppercase = 0;        //uppercase represents count of uppercase characters
        int lowercase = 0;        //lowercase represents count of lowercase characters
        int digits = 0;       //digits represents count of digit characters
        int others = 0;       //others represents count of special characters

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {  //if character is uppercase character
                uppercase++;
            } else if (Character.isLowerCase(ch)) {    //if character is lowercase character
                lowercase++;
            } else if (Character.isDigit(ch)) {    //if character is a digit character
                digits++;
            } else {      //if character is special character
                others++;
            }
        }

        double upperper = (uppercase * 100.0) / character;        //finding percentage of uppercase character
        double lowerper = (lowercase * 100.0) / character;        //finding percentage of lowercase character
        double digitper = (digits * 100.0) / character;       //finding percentage of digits character
        double otherper = (others * 100.0) / character;       //finding percentage of special character
        System.out.println("In the string '" + string + "' the percentage of ");
        System.out.println("uppercase: " + upperper + "%");
        System.out.println("lowercase: " + lowerper + "%");
        System.out.println("digit: " + digitper + "%");
        System.out.println("others: " + otherper + "%");
    }
}
