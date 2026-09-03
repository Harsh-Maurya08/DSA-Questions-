import java.util.Scanner;

public class BinarySearchInArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.print("Enter the element to search : ");
        int num = input.nextInt();
        int index = binarySearch(arr,num);
        if(index==-1)
            System.out.println("Element not found");
        else
            System.out.println("The element at index : "+index);
    }

    public static int binarySearch(int[] arr, int num){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[left]==num)
                return left;
            else if(arr[right] == num)
                return right;
            else if(arr[mid]==num)
                return mid;
            else if (num>arr[mid]) {
                left=mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return -1;
    }
}
