public class Question9 {
    public static void main(String[] args) {
        //Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
        new Question9();    //executing program using constructor
    }

    private Question9() {   //constructor of class
        System.out.println("All house prices are as follows:");
        for (House house : House.values()) {    //traversing through all the values of enum
            System.out.println(house + " will cost " + house.getPrice() + " rupees.");
        }
    }

}

enum House {        //using enum having 4 elements
    House_3BHK(15000),
    House_2BHK(12000),
    House_1BHK(10000),
    House_1RK(8000);

    private int price;

    House(int p) {  //parameterised constructor of enum
        price = p;
    }

    int getPrice() {    //getter for price
        return price;
    }
}
