import java.io.*;
import java.util.*;

public class quick_sort{

    static void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int arr[], int low, int high){
        int pivot = arr[high];

        int i = low - 1;

        for(int j = low ; j <= high-1 ; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    } 

    static void quickSort(int arr[],int low,int high){
        if (low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }


    }
    
    
    public static void main (String args[]){ 
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