import java.io.*;
import java.util.*;

public class kthLargestElement_TreeSet{

    static int kthLargest(int arr[], int k){
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i = 0; i<arr.length ;i++){
            ts.add(arr[i]);
        }
        
        int i = 1;
        while(i<k){
            ts.pollFirst();
            i++;
        }

        return ts.pollFirst();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i =0 ; i<n;i++){
            array[i] = sc.nextInt();
        }   

        int k = sc.nextInt();
        System.out.println("The "+k +"th Largest element is : " + kthLargest(array, k));
    }
}