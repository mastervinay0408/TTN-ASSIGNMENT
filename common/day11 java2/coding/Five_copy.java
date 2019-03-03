package assignment2;

public class Five_copy {
    private int data;
    Five_copy (Five_copy m){
        data = m.data;
    }
    public Five_copy() {
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        Five_copy m1 = new Five_copy();

        m1.setData(30);

        Five_copy m3 = new Five_copy(m1);

        System.out.println("Object M3: "+ m3.getData());
        System.out.println("Value of M1 copied to M3");

    }
}