import java.util.*;
public class Main {

    public static void main(String []args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nstars = n;
        int spaces = 0;

        for(int row=1;row<=n;row++){

            // 1. spaces
            for(int sp=1;sp<=spaces;sp++){
                    
                System.out.print("\t");
            }

            // 2. Stars
            for(int st=1;st<=nstars;st++){
                
                if(row<=n/2){
                    
                    if( st==1 || st==nstars || row==1|| row==n)
                    System.out.print("*\t");

                     else
                     System.out.print("\t");
                }
                
                else
                System.out.print("*\t");
            }

            // 3. Next Line
            System.out.println();
            // 4. Prep for next row
            if(row<=n/2){

                spaces += 1;
                nstars -= 2;
            }
            else{

                spaces -= 1;
                nstars += 2;
            }
        }

    }
    
}
