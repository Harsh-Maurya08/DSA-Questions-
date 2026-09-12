package Array;

public class MainOperation {
    public static void main(String[] args) {
        Array arr = new Array();
        arr.add(2);
        arr.show();
        arr.add(4);
        arr.show();
        arr.add(6);
        arr.show();
        arr.insert(0,1);
        arr.show();
        arr.remove();
        arr.show();
        arr.add(6);
        arr.show();
        arr.insert(4,8);
        arr.show();
        arr.remove(3);
        arr.show();
        arr.remove();
        arr.show();
        arr.add(9);
        arr.show();
        arr.insert(4,10);
        arr.show();
        arr.add(7);
        arr.show();
        arr.remove(2);
        arr.show();
        arr.insert(4,2);
        arr.show();
    }
}
