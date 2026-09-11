package DoublyLinkedList;

public class MainOperation {
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.show();
        list.showReverse();
        list.insertAtStart(1);
        list.insertAtStart(-11);

        list.insertAt(1,3);
//        list.remove(4);
        list.show();
    }
}
