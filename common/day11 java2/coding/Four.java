package assignment2;

public class Four {

    private static Four myObj= new Four();

    private Four(){

    }

    public static Four getInstance(){
        return myObj;
    }

    public void print(){
        System.out.println("It is singleton class!!!");
    }

    public static void main(String args[]){
        Four fr = getInstance();
        fr.print();
    }
}