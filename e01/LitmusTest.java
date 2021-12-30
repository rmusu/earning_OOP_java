import java.util.Scanner;
import java.lang.Math;

public class LitmusTest {
    //EFFECTS: return the digits of c summed  
    public static int sumDigits(int c){
        int sum = 0, i = 0;
        while(c!=0){
            c /= Math.pow(10,i);
            int reminder = c % 10;
            sum += reminder;
            c -= reminder;
            i++;
        }
        return sum;
    }
    /*REQUIRE: n > 0
    EFFECTS: print all triple of int a,b,c < n where a*b != c but litmus test works */ 
   public static void printTriple(int n){
        for (int a = 1; a < n; a++){
            for (int b = 1; b < n; b++){
                for (int c = 1; c < n; c++){
                    int x = a * b;
                    if (x!=c && x%9==sumDigits(c)%9){
                    System.out.println(a + " " + b + " " + c);
                    } 
                }
            }
        }   
    }    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        scanner.close();
        printTriple(n);
        
    }
    
}
