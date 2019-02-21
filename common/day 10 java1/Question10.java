public class Question10 {
    /*Write a single program for following operation using overloading
    A) Adding 2 integer number
    B) Adding 2 double
    C) multiplying 2 float
    D) multiplying 2 int
    E) concat 2 string
    F) Concat 3 String*/

    public static void main(String[] args) {
        Question10 obj = new Question10();
        System.out.println("Addition of 1 and 2 is " + obj.add(1, 2));
        System.out.println("Addition of 1.25 and 2.78 is " + obj.add(1.25d, 2.78d));
        System.out.println("Multiplication of 1 and 2 is " + obj.multiply(1, 2));
        System.out.println("Multiplication of 1.98 and 2.65 is " + obj.multiply(1.98f, 2.65f));
        System.out.println("Concatination of 'Indian' and 'Continent' is " + obj.strConcat("Indian", "Continent"));
        System.out.println("Concatination of 'India', 'Is' and 'Great' is " + obj.strConcat("India", "Is",
                "Great"));

    }


    Integer add(Integer a, Integer b) {     //adding two integer using overloaded method add()
        return a + b;
    }

    Double add(Double a, Double b) {    //adding two double using overloaded method add()
        return a + b;
    }

    Float multiply(Float a, Float b) {      //multiply two float using overloaded method multiply()
        return a * b;
    }

    Integer multiply(Integer a, Integer b) {    //multiplying two integer using overloaded method multiply()
        return a * b;
    }

    String strConcat(String a, String b) {      //Concat two string using overloaded method strConcat()
        return a.concat(b);
    }

    String strConcat(String a, String b, String c) {        //Concat three string using overloaded method strConcat()
        return a.concat(b.concat(c));
    }


}
