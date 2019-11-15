import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        
        if(s.length()==0||s.trim().equals(""))
        {
            System.out.println("0");
        }
        
        else if(s.length()<400000)
        {
            String arr[]=s.trim().split("[ !,?._'@]+");
            System.out.println(arr.length);
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        }
        
        scan.close();
        
    }
}

