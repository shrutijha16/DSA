import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s= new Scanner (System.in);
        int n= s.nextInt();
        int row=1;
         int nst=1;
         int row_val=1;
         int nsp=n-1;
        while(row<=n){
            
            int i=1;
            while(i<=nsp){
                System.out.print(" "+"\t");
                i++;
            }
            int j=1;
            int col_val=row_val;
            while(j<=nst){
                System.out.print(col_val+"\t");
               if(j< (nst+1)/2)
                 col_val=col_val+1;
               else{
                   col_val=col_val-1;
               }
               j++;
            }
            System.out.println();
        nst+=2;
        nsp-=1;
        row_val+=1;

            row+=1;
        }
        
    }
}