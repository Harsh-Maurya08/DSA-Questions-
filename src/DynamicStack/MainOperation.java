package DynamicStack;

public class MainOperation {
    public static void main(String[] args){
        Stack stack = new Stack();
        System.out.println("Stack is Empty: "+stack.isEmpty());
        stack.push(3);
        stack.show();
        stack.push(6);
        stack.show();
        stack.push(9);
        System.out.println("Last Added Element is : " + stack.peek());
        stack.show();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(100);
        stack.show();
        System.out.println("Stack is Empty : "+stack.isEmpty());
    }
}
