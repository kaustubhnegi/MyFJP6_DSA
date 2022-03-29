import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int r = scn.nextInt();
        int c = scn.nextInt();

        int arr[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            arr[i][j] = scn.nextInt();


        }


        

        int dir=0;

        int ri=0;
        int ci=0;

        while(true){
            if(ri<0||ri>=r|| ci<0||ci>=c)
            {   if(ri==r)
                ri--;

                if(ci==c)
                ci--;

                if(ri==-1)
                ri++;

                if(ci==-1)
                ci--;
                break;
            }


            if(arr[ri][ci]==1)
                dir =(dir+1)%4;


                if(dir==0)
                ci++;

                else if(dir==1)
                ri++;

                else if(dir==2)
                ci--;

                else
                ri--;
            
     

        }


            System.out.println(ri);
            System.out.println(ci);
    }

}