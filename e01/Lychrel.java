import java.util.Scanner;

public class Lychrel{

    /*REQUIRE: x not NULL
    EFFECTS: return the inverse of x eg. 59 -> 95*/
    public static long reverse(long x){
        long y = 0;
        while (x != 0){
            long reminder = x % 10;
            y *= 10;
            y += reminder;
            x = (x - reminder)/10;
        }
        return y;
    }
    /*REQUIRE: x not NULL
    EFFECTS: return true if x is palindrome false otherwise*/
    public static boolean isPalindrome(long x){
        return (x == reverse(x));
    }

    /*REQUIRE: x is not a Lychrel number
    EFFECTS: print the sequence of the sum of x with its inverse util a palindrome number is reached*/
    public static void printSeq(long x){
        System.out.println(x);
        while(!isPalindrome(x)){
            x+=reverse(x);
            System.out.println(x);
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        printSeq(x);
    }





}
