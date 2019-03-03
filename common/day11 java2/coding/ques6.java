package assignment2;

public class ques6 {
    public static void main(String[] args) {
        tcf();

    }

    public static void tcf()
    {
        try{
            int a[]=new int[10];
            a[10]=20/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception should always cme after all the child exceptions");
        }

        finally {

            System.out.println("finally block always executed");
        }
    }



}
