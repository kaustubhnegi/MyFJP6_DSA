import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int  n = scn.nextInt();


        int c=0,sp=2*n-3;
     for(int row=1;row<=n;row++){
         
         // 1. Left Stars
         for(int j=1;j<=row;j++){

             System.out.print(j+"\t");
             c=j;
         }


        // 2. Middle Space
         
         for(int k=sp;k>=1;k--){
             System.out.print("\t");
         }

        // 3. Right Stars

         for(int l=c;l>=1;l--){
             
             if(row==n && l==c)
             continue;
             
             System.out.print(l+"\t");
             
         }

        // 4. Line change
        System.out.println();

       
         sp-=2;


     }

 }
}