import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int row=1;
        int nst=1;
        int nsp=(n-1)/2;
        while(row<=n){
            int i=1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i++;
            }
            int j=1; 
            while(j<=nst){
                 System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            if(row<(n+1)/2){
                nst+=2;
                nsp-=1;
            }
            else{
                nst-=2;
                nsp+=1;
            }
            row+=1;

        }
    }
}
