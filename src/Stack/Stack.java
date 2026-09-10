package Stack;

import java.util.Scanner;

public class Stack {
    int MAXSIZE = Size();

    public int Size(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        return MAXSIZE = input.nextInt();
    }

    int[] stack = new int[MAXSIZE];
    int top = 0;

    //Push Method
    public void push(int data){
    if(top>=MAXSIZE)
        System.out.println("Error Message : Stack OverFlow...");
    else
        stack[top++] = data;
    }

    //Pop Method;
    public void pop(){
        if(top == 0) {
            System.out.println("Error Message : Stack UnderFlow...");
        }
        else {
            System.out.println(stack[top - 1] + " is pop out of stack");
            stack[--top] = 0;
        }
    }

    public void show(){
        for (int i : stack)
            System.out.print(i + " ");
        System.out.println();
    }

    public void isElement(int data){
        boolean res = false;
        for(int i : stack){
            if( i == data) {
                res = true;
                break;
            }
        }
        System.out.println("The " + data + " is " +  (res ? "Present in stack": "Not Present in stack"));
    }

    //Giving last value added in stack
    public void peek(){
        System.out.println("Last Element is :"+stack[top-1]);
    }

    public boolean isEmpty(){
        return top == 0;
    }

    //Giving size of stack
    public int size(){
        return MAXSIZE;
    }
}