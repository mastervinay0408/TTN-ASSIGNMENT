public class Question1 {
    public static void main(String[] args) {

        //Write a program to replace a substring inside a string with other string ?


        String str = "roses are red and roses are flower";
        //using "roses are red and roses are flower" as the input

        String str2 = str.replaceAll("es", "XX");
        //replacing 'es' with "ES" in the string

        System.out.println("String before replacement: " + str);
        System.out.println("String before replacement: " + str2);
    }
}
