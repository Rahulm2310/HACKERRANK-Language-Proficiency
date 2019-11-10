import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
       
        Scanner sc=new Scanner(System.in);
        String str=new String("");
        int i=0;
        
        while(sc.hasNext())
        {
        
            i++;
            str=sc.nextLine();
            str=i+" "+str;
            System.out.println(str);
            
        }


    }
}

