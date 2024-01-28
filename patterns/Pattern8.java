import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int nsp=0; //num of space in a row
        int row=1;
        int nrv= 2*n+1; //num of elements in a row
        int rv=n;    //row start num
        while(row<= 2*n+1){
             int j=1;
            while(j<=nsp){
                System.out.print(" "+" ");
                j++;
            }
        if(row<=n+1){
            int i=1;
            int uv=rv;
            while(i<=nrv){
              System.out.print(uv+" ");
              if(i<(nrv+1)/2){
                uv-=1;
              }
               else{
                    uv+=1;
                     }
                
             i++;
            }
        }
         else{  
            int k=1;
            int pv=rv;
            while(k<=nrv){
                System.out.print(pv+" ");
              if(k<(nrv+1)/2){
                pv-=1;
              }
               else{
                    pv+=1;
                     }
                
             k++;
            }
         }
            System.out.println();
            if(row<n+1){
                nrv=nrv-2;
                nsp=nsp+1;
                rv=rv-1;

            }else{
                 nrv=nrv+2;
                nsp=nsp-1;
                rv=rv+1;
            }
            row+=1;

        }

    }
}