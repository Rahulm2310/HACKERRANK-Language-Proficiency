import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList> l=new ArrayList<ArrayList>();
        
        
        for(int i=0;i<n;i++)
        {
            
            int d=sc.nextInt();
            l.add(new ArrayList<Integer>());
            
            for(int j=0;j<d;j++)
            {
                
                int val=sc.nextInt();
                l.get(i).add(val);
            }
            
        }

        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
           
            try{
                
                System.out.println(l.get(x-1).get(y-1));

            }
             catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}

