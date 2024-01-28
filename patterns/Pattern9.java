import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int nsp =n-1; // num of spacein a row
        int nrv=1; //num of elemwnts in a row
        int rs=1; //row start
        int row=1;
        int ms=-1; //midlle space in a row
        while(row<=2*n-1){
            int i=1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i++;
            }
            int j=1;
            int cs=rs;
            while(j<=nrv){
             System.out.print(cs+" ");
             cs=cs-1;
             j++;
            }
            int m=1;
             while(m<=ms){
                System.out.print(" "+" ");
                m++;
            }
            
         int k=1;
         if(row==1 ||row==n){
                k=2;
            }
            int p=1;
            while(k<=nrv){
             System.out.print(p+" ");
             p++;
             k++;
            }
            System.out.println();
           if(row< (n+1)/2){
               nsp=nsp-2;
               nrv=nrv+1;
               rs+=1;
               ms+=2;
           } 
           else{
               nsp=nsp+2;
               nrv=nrv-1;
               rs-=1;
               ms-=2;
           }
            row+=1;
        }

    }
}