package Array;

public class Array {
    int size = 5;
    int[] arr = new int[size];
    int pointer = 0;

    //adds element in the array
    public void add(int data){
        if(pointer == arr.length)
            System.out.println("The array is full\nUnable to add more elements");
        else
            arr[pointer++] = data;
    }

    //Removes last element of the array
    public void remove(){
        if(pointer == 0)
            System.out.println("The Array is already Empty.");
        else
            arr[--pointer] = 0;
    }

    //Display all elements of the array
    public void show(){
        System.out.println();
        for(int i : arr)
            System.out.print(i+" ");
    }

    //Adds element at particular index
    public void insert(int index, int data) {
        if (arr.length - 1 == index) {
            arr[arr.length - 1] = data;
            pointer++;
        }
        else{
            for(int i=arr.length-2;i>=index;i--) {
                arr[i+1] = arr[i];
                if(i == index)
                    arr[i] = data;
            }
            pointer++;
        }
    }

    //Removes Element from at particular index
    public void remove(int index){
        if(index == arr.length-1)
            remove();

        else {
            int i = index;
            while(i != arr.length-1){
                arr[i] = arr[i+1];
                i++;
            }
            arr[arr.length-1] = 0;
            pointer--;
        }
    }
}
