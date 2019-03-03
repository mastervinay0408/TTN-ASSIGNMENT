package assignment2;

class Five implements Cloneable {

    private String obj;

    public Five(String obj) {
        this.obj = obj;
    }

    public String getName() {
        return obj;
    }
    // Overriding clone() method of Object class
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        Five obj1 = new Five("Object in first is copied");
        try {
            Five obj2 = (Five) obj1.clone();
            System.out.println(obj2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}