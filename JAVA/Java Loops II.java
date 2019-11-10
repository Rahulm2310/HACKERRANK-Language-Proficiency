import java.util.*;
import java.io.*;

class Solution
{

    public static void main(String []args)
    {
    
        Scanner in = new Scanner(System.in);
        
        int t=in.nextInt();
        
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String s=new String("");
            int b1=0;
            
            for(double j=0;j<n;j++)
            {
                b1=0;
                
                for(double k=0;k<=j;k++)
                {
                    b1=b1+(b*(int)Math.pow(2.0,k));
                }
                
                s=a+b1+" ";
                
                System.out.print(s);
            }
            
            System.out.println("");

            

        }
        in.close();
    }
}

