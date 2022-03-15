import java.util.Scanner;

public class DrawV {

    public static void printV(int n){
        for (int r = 1; r <= n; r++){
            for (int c = 1; c <= 2*n-1; c++){
                if (c%(2*n) == r || 2*n-c==r) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }    
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        printV(n);

    }
}
