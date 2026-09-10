package Queue;

public class MainOperation {
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.show();
        queue.dequeue();
        queue.show();
        queue.enqueue(20);
        queue.show();
        queue.dequeue();
        queue.show();
    }
}