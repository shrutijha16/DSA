import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s= new Scanner (System.in);
        int n= s.nextInt();
       
         int row = 0;
        while (row < n) {
            int value = 1;
            // Print values for the current row
            int col = 0;
            while (col <= row) {
                System.out.print(value + "\t");
                value = value * (row - col) / (col + 1);
                col++;
            }

            System.out.println();

            row++;
        }
    }
}