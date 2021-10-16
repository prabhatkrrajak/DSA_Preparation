import java.util.*;

public class moveAllNegativeToBegining{

    static void moveAllNegativeToBegining_func(int arr[]){
        int lf = 0;
        int rt = arr.length - 1;
        while(lf < rt){
            while(lf < arr.length -1 && arr[lf]<0){
                lf++;
            }
            while(rt > 0 && arr[rt]>0){
                rt--;
            }
            if(lf < rt){
                int temp = arr[lf];
                arr[lf] = arr[rt];
                arr[rt] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i =0 ; i<n;i++){
            array[i] = sc.nextInt();
        } 

        moveAllNegativeToBegining_func(array);

        System.out.println("After running func....");
        for(int i =0 ; i<n;i++){
            System.out.print(array[i] + " ");
        }
    }    
}
