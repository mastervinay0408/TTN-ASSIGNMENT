package Assignment4;

import java.sql.Array;
import java.util.*;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int arr[]=new int[10];
        //int arr[]={10,20,10,30,10,20,40,40,60,70};
        for(int i =0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> numberFrequencyMap = new HashMap<Integer, Integer>();



        for (int c : arr) {
            if (numberFrequencyMap.containsKey(c)) {
                numberFrequencyMap.put(c, numberFrequencyMap.get(c) + 1);
            } else {
                numberFrequencyMap.put(c, 1);
            }
        }


        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(numberFrequencyMap.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> t0, Map.Entry<Integer, Integer> t1) {
                return t1.getValue()-t0.getValue();
            }
        });
        System.out.println(entries);

    }
}