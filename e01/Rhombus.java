import java.util.Scanner;

public class Rhombus {

    public static void drawRhombus(int n){
     
        for (int r = 0; r < 2*n+1; r++){
            for (int c = 0; c < 2*n+1; c++){
                
                if(r<= n && c >= n-r && c <= n+r || 
                r > n && c >= n-2*n%r && c <= 2*n%r+n)

                    System.out.print("*");
                else 

                    System.out.print(" ");
                
            } 
            System.out.println("");
        }
        
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        drawRhombus(n);
    } 
}
