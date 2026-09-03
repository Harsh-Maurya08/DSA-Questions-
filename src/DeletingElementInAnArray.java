import java.util.Scanner;

public class DeletingElementInAnArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.print("Original Array: ");
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();

        System.out.print("Enter the Element to delete : ");
        int delete = input.nextInt();
        System.out.println();
        int i=0;
        while(true){
            if(arr[i] != delete){
                i++;
            }
            else{
                for(int k=i ; k<arr.length-1 ; k++){
                    arr[k] = arr[i+1];
                    i++;
                }
                arr[arr.length-1] = 0;
                break;
            }
        }
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
}
