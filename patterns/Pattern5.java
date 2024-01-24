import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int nst=n;
        int nsp=n-1;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=nsp){
                System.out.print(" ");
                i++;
            }
            int j=1;
            if(row==1 ||row==n){
            while(j<=nst){
                System.out.print("*");
                j++;

              }
            }
            else{
                int k=1;
                int sc=n-2;
                System.out.print("*");
                while(k<=sc){
                    System.out.print(" ");
                 k++;
                }
                System.out.print("*");
            }
            System.out.println();
             nsp=nsp-1;
            row+=1;
        }

    }
}