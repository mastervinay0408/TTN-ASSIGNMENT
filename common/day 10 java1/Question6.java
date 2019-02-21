public class Question6 {
    //Question 6: There is an array with every element repeated twice except one. Find that element

    public static void main(String[] args) {
        int[] array = {5, 6, 5, 6, 8, 9, 8};      //element 5,6,8 are repeated but element 9 is not repeated
        System.out.println("The element that occurs once is: " + findSingle(array));
    }

    private static int findSingle(int[] a) {
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            res = res ^ a[i];
            /*  using xor operator to xor all the element present in the array ie. 5^6^5^6^8^9^8=9 since only one of
            the elements occurred once */
            //on applying xor operator, it returns 0 for same operands eg. 5^5=0 and 5^6=3
        }
        return res;
    }
}
