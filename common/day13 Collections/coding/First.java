package Assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class First {
    public static void main(String[] args) {


        float sum = 0f;
        ArrayList<Float> li = new ArrayList<>();
        li.add(1.5f);
        li.add(5f);
        li.add(4f);
        li.add(6f);

        System.out.println(li);
        Iterator<Float> it=li.iterator();
        while(it.hasNext())
        {
            sum+=it.next();
        }
        System.out.println(sum);
    }
}