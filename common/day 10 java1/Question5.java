public class Question5 {
    /*Question 5: Find common elements between two arrays.*/

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 6, 7, 7};
        int[] arr2 = {3, 5, 6};
        for (int i1 : arr1) {
            for (int i : arr2) {
                if (i1 == i) {
                    System.out.println(i1);
                    //Printing all the common element along with every occurrences in both arrays
                }
            }
        }
    }
}
