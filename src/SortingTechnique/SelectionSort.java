package SortingTechnique;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr = {10,0,24,1,35,36,20,12,17,3};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int range = arr.length-1-i;
            int max = arr[0];
            int k=0;
            for(int j=1;j<=range;j++){
                if(arr[j]>max){
                    max=arr[j];
                    k=j;
                }
            }
            int temp = arr[range];
            arr[range] = max;
            arr[k] = temp;
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
