import java.util.Scanner;

public class PowersetOfStringUsingRecursion {
    public static void powerSet(String s, int i , String cur){
        if(i == s.length()){
            System.out.println(cur);
            return;
        }
        powerSet(s, i+1, cur+s.charAt(i));
        powerSet(s, i+1, cur);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String------");
        String s = in.nextLine();
        powerSet(s, 0, "");
        in.close();
    }
}
