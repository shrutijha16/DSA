import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int nsp=2*n-1;//space in a row
        int nrv=1;// num in a row for mirror pattern
        int row=1;
        int cv=n; //second pattern start row
        while(row<= 2*n+1){
            int i=1;
            int rv=n;
            while(i<=nrv){
                System.out.print(rv+" ");
                rv=rv-1;
                i++;
            }
            int j=1;
            while(j<=nsp){
                System.out.print(" "+" ");
                j++;
            }
            int k=1;
            
            int nv=cv;
            if(row==n+1){
                k=2;
               nv=1;
            }
            while(k<=nrv){
             System.out.print(nv+" ");
             nv=nv+1;
             k++;
            }
            System.out.println();
            if(row<n+1){
                nsp=nsp-2;
                nrv=nrv+1;
                cv=cv-1;
            }
            else{
                 nsp=nsp+2;
                nrv=nrv-1;
                cv=cv+1;
            }
            row+=1;
        }

    }
}