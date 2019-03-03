package Assignment4;

import java.util.EmptyStackException;

public class Seven {

    private int sizee;
    private int[] sarr;
    private int top;

    public Seven(int sizee) {
        this.sizee = sizee;
        this.sarr = new int[sizee];
        this.top = -1;
    }


    public void push(int element){
        if(this.isStackFull()){
            System.out.println(("Stack is full"));
            this.increaseStackCapacity();
        }
        System.out.println("Add"+element);
        this.sarr[++top] = element;


    }

    public int pop() throws EmptyStackException {
        if(this.isStackEmpty()){
            throw new EmptyStackException();
        }
        int element = this.sarr[top--];
        System.out.println("Removed element: "+element);
        return element;
    }

    public long peek() {
        return sarr[top];
    }

    private void increaseStackCapacity(){

        int[] newStack = new int[this.sizee*3];
        for(int i=0;i<sizee;i++){
            newStack[i] = this.sarr[i];
        }
        this.sarr = newStack;
        this.sizee = this.sizee*3;
    }

    public boolean isStackEmpty() {
        return (top == -1);
    }

    public boolean isStackFull() {
        return (top == sizee - 1);
    }

    public static void main(String[] args) {
        Seven stack = new Seven(2);
        for(int i=1;i<18;i++){
            stack.push(i);
        }
        for(int i=1;i<3;i++){
            try {
                stack.pop();
            } catch (EmptyStackException e) {

                e.printStackTrace();
            }
        }
    }
}