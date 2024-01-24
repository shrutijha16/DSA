import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      Scanner s = new Scanner(System.in);
		      int n = s.nextInt();
		      int nsp = n - 1;
		      int nst = 1;
		      int row = 1;

		      while (row <= 2 * n - 1) {
		          // Print spaces
		          int i = 1;
		          while (i <= nsp) {
		              System.out.print(" "+" ");
		              i ++;
		          }

		          // Print stars/numbers
		          int j = 1;
		          while (j <= nst) {
		              System.out.print("*"+ " "); // You can change this to the desired character/number
		              j++;
		          }

		          // Move to the next line
		          System.out.println();

		          // Update variables for the next row
		          if (row < n) {
		              nsp = nsp - 1;
		              nst = nst + 1;
		          } else {
		              nsp = nsp + 1;
		              nst = nst - 1;
		          }

		          row++;
		      }
	}

}
