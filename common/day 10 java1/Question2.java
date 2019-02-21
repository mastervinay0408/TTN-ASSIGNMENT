import java.util.*;

public class Question2 {

    public static void main(String[] args) {

        //Write a program to find the number of occurrences of the duplicate words in a string and print them ?
        String str = "Hi I am aman singh and I am studying java";

        List<String> list = Arrays.asList(str.split(" "));      //splitting string into list of words
        Set<String> uniqueWord = new HashSet<>(list);       //Using HashSet since it can't contain duplicate elements
        for (String word : uniqueWord)
            if (Collections.frequency(list, word) > 1)  //printing only duplicate words in the string
                System.out.println("Word: '" + word + "', Frequency: " + Collections.frequency(list, word));
    }
}



