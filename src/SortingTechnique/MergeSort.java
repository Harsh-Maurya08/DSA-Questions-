package SortingTechnique;

public class MergeSort {
    public static void main (String[] args){
        int[] arr = {5,2,59,1,0,3};

        //Printing original array:
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();

        mergeSort(arr,0,arr.length-1);

        //After sorting array:
        for(int n : arr){
            System.out.print(n + " ");
        }
    }

    public static void mergeSort(int[] arr , int l , int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void merge(int[] arr,int l ,int mid ,int r){
        int s1 = mid-l+1;
        int s2 = r-mid;
        int[] lArr = new int[s1];
        int[] rArr = new int[s2];

        for(int x=0;x<s1;x++){
            lArr[x] = arr[l+x];
        }

        for(int x=0;x<s2;x++){
            rArr[x] = arr[mid+1+x];
        }

        int i=0;
        int j=0;
        int k=l;
        while(i<s1 && j<s2){
            if(lArr[i] <= rArr[j])
                arr[k++] = lArr[i++];

            else
                arr[k++] = rArr[j++];
        }

        while(i<s1){
            arr[k++] = lArr[i++];
        }

        while(j<s2){
            arr[k++] = rArr[j++];
        }
    }
}
