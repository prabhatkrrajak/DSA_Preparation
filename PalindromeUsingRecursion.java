import java.util.Scanner;

public class PalindromeUsingRecursion {
    public static boolean isPalin(String s ,int l,int r){
        if(l>=r)
            return true;
        if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
            return false;
        
        return isPalin(s,l+1,r-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word-----");
        String s = in.nextLine();
        if(isPalin(s,0,s.length()-1)){
            System.out.println("Yes it is palindrome");
        }
        else{
            System.out.println("No it is not a palindrome");
        }
        in.close();

    }
}
