import java.util.*;
import java.io.*;

class problem2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a;
        int b;
        int n;
        int sum;
        for(int i=1;i<=t;i++){
            {   
                a = in.nextInt();
                b = in.nextInt();
                n = in.nextInt();
                sum = a;
                for(int j = 0 ; j< n;j++)
                {
                	sum += (int)Math.pow(2,j)*b;                                
                	System.out.printf("%d ",sum);
                }
                System.out.println();
            }
        }
        in.close();
    }
}