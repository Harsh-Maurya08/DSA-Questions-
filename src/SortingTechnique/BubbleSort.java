package SortingTechnique;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr = {89,9,2,3,1,0,3,34,2,5};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr){
        int step=0;
        int range = arr.length;
        for(int it = 0;it<range-1; it++){
            int i=0;
            for(int j=i+1;j<range-it;j++){
                step++;
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i++]=arr[j];
                    arr[j] =temp;
                }
                else
                    i++;
            }
        }
        System.out.println(step);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
