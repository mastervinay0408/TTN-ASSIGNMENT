public class ques3 {
    /*
        WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
    */
    public static void main(String[] args) {
        try {       //producing ClassNotFoundException
            Class.forName("classvinay");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Calc calc = new Calc();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Calc calc = new Calc();     //producing NoClassDefFoundError
        }

    }
}

class Calc {
    static int notDefined = 1 / 0;
}
