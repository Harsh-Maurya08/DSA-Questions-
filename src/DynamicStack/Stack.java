package DynamicStack;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> stack = new ArrayList<>();
    int top=0;

    //push method
    public void push(int data){
        stack.add(data);
        top++;
    }

    public void pop(){
        if(isEmpty())
            System.out.println("Error Message : Stack UnderFlow...");
        else{
            System.out.println("The pop element is : "+peek());
            top--;
            stack.remove(top);
        }
    }

    //Peek method :: Gives last added element in the array.
    public int peek(){
        return stack.get(top-1);
    }

    //Display all elements
    public void show(){
        for(int i : stack){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //isEmpty Method :: Check Stack is Empty or not (Boolean return Type)
    public boolean isEmpty(){
        return top == 0;
    }
}
