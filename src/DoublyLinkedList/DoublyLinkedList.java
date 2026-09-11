package DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        if(head == null) {
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            node.prev = tail;
            node.next=null;
            tail = node;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next=head;
        head = node;
    }

    public void insertAt(int index , int data){
        if(index == 0)
            insertAtStart(data);
        else {
            Node node = new Node();
            node.data = data;
            Node n = head;
            for (int i = 0; i < index - 1; i++)
                n = n.next;
            Node n1 = n.next;
            n.next = node;
            node.next = n1;
        }
    }

    public void show(){
        Node node = head;
        System.out.print("Straight Trend : ");
        while(node.next != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void showReverse(){
        Node node = tail;
        System.out.print("Reverse Trend: ");
        while(node.prev != null){
            System.out.print(node.data+" ");
            node = node.prev;
        }
        System.out.println(node.data);
    }

    public void remove(int index){
        if(index == 0)
            head = head.next;
        else {
            Node node = head;
            for (int i = 0; i < index - 1; i++)
                node = node.next;
            if(node.next == tail){
                removeAtLast();
            }
            else {
                Node n1 = node.next;
                Node n2 = n1.next;
                node.next = n1.next;
                n2.prev = node;
            }
        }
    }

    public void removeAtLast(){
        tail = tail.prev;
        tail.next = null;
    }
}