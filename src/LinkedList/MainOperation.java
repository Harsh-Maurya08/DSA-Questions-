package LinkedList;

public class MainOperation {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(100);
        list.insertAtStart(15);
        list.insertAtStart(200);
        list.insertAt(2,55);
        list.remove(3);
        list.show();
    }
}
