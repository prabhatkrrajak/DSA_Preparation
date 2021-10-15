import java.io.*;
import java.util.*;
public class quick_sort_1st_pivot {

    static void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int arr[], int low, int high){
        int pi = low;
        low +=1;

        while(low<=high){
            while(low<=high && arr[low]<arr[pi]){
                low++;
            }
            while(arr[high]>arr[pi]){
                high--;
            }
            if(low<=high){
                swap(arr,low,high);
            }
        }
        swap(arr,high,pi);
        return high; 

    } 

    static void quickSort(int arr[],int low,int high){
        if (low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }


    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i =0 ; i<n;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Array after sorting....");
        quickSort(array,0,n-1);
        for(int i =0 ; i<n;i++){
            System.out.print(array[i] + " ");
        }
    }
}
