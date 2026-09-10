package Queue;

public class Queue {
    int[] queue = new int[3];
    int front = 0;
    int rear = 0;

    public void enqueue(int data){
        if(rear == queue.length)
            System.out.println("Queue is full...");
        else {
            queue[rear++] = data;
        }
    }

    public void dequeue(){
        if(isEmpty())
            System.out.println("The queue is empty...");
        else{
            System.out.println("Element dequeue is : "+queue[front]);
            queue[front] = 0;
            front++;
        }
    }

    public void show(){
        if(isEmpty())
            System.out.println("Queue is Empty...");
        else {
            System.out.print("Elements are: ");
            for (int i = front; i < rear; i++)
                System.out.print(queue[i] + " ");
            System.out.println();
        }
    }

    public boolean isEmpty(){
        return rear == front;
    }
}
