import java.util.*;
import java.io.*;


class problem3{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-Math.pow(2,63) && x<=(Math.pow(2,63) -1))
                {
                    if(x>=-Math.pow(2,31) && x<=Math.pow(2,31) -1)
                    {
                        if(x>=-32768 && x<=32767){
                            if(x>=-128 && x<=127){
                                System.out.println("* byte");
                            }
                            System.out.println("* short");    
                        }
                        System.out.println("* int");
                    }
                    System.out.println("* long");
                }
                
                //Complete the code;
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}




