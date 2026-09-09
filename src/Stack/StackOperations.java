package Stack;

public class StackOperations {
    public static void main(String[] args){
        Stack stack = new Stack();
        System.out.println("Stack is Empty: "+stack.isEmpty());
        stack.push(5);
        stack.show();
        stack.push(10);
        stack.show();
        stack.push(15);
        stack.show();
        stack.pop();
        System.out.println("Stack is empty : "+stack.isEmpty());
        stack.peek();
        stack.isElement(10);
        stack.push(20);
        stack.show();
        stack.push(25);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Stack is Empty : "+stack.isEmpty());
        System.out.println("Size is :"+stack.size());
    }
}
