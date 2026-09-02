package SortingTechnique;

public class InsertionSort {
    static void main(String[] args) {
        int[] arr = {11,5,4,2,9,10,0,1};

        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j--];
            }
            arr[j+1]=key;
        }

        for(int i : arr)
            System.out.print(i+" ");
    }
}
