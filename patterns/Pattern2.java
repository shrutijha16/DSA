import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int row=1;
        int nst=(n+1)/2;
        int nsp=-1;
        
        while (row <= n) {
            int i = 1;
            
            while (i <= nst) {
                System.out.print("*"+"\t");
                i++;
               
            }
            int j = 1;
            while (j <= nsp) {
                System.out.print(" "+"\t");
                j++;
             
            }
           int  k = 1;
           if(row==1 || row==n)
              k=2;
            while (k <= nst) {
                System.out.print("*"+"\t");
                k++;
            }

            System.out.println();

            if (row < n / 2 + 1) {
                nsp += 2;
                nst -= 1;
            } else {
                nsp -= 2;
                nst += 1;
            }

            row++;
        }
    }

}