import java.util.Scanner;

public class ChessBoard {

    public static final int NUM_ROW_COL = 8;
    private int n;

    //constructor
    public ChessBoard(int n){
        this.n = n;
    }
    
    //method
    public static char setSymbol(char x, int k, int n){
        if (k % n == 0 && x == '-') x = '#';
        else if (k % n == 0 && x == '#') x = '-';
        return x;
    }

    public void printBoard(int n){
        char x = '-';
        for (int r = 1; r <= n * NUM_ROW_COL; r++){
            for (int c=1; c <= n * NUM_ROW_COL; c++){
                System.out.print(x);
                x = setSymbol(x,c,n);
                }
            System.out.println("");
            x = setSymbol(x,r,n);               
            }
        }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt();
        scanner.close();

        ChessBoard cb = new ChessBoard(n);
        cb.printBoard(cb.n);
    }
}
