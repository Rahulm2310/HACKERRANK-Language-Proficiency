import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args)
    {
        
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<Integer>();
        
        
        for(int i=0;i<n;i++)
        {
                  l.add(sc.nextInt());
        }
        

        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
                    String str=sc.nextLine();

                    if(str.equals("Insert"))
                    {
                        int x=sc.nextInt();
                        int y=sc.nextInt();
                        l.add(x,y);
                    }

                    else if(str.equals("Delete"))
                    {
                        int z=sc.nextInt();
                        l.remove(z);
                    }
            
            
        }
        

        for(int i=0;i<l.size();i++)
        {
                    System.out.print(l.get(i)+" ");
        }

        
    }
    
}

