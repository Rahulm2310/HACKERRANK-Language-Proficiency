import java.io.*;
import java.util.*;
import java.math.BigInteger;



public class Solution {

    
    
    public static void main(String[] args)
   {
        
        
        
        Scanner sc=new Scanner(System.in);
        
        String a=sc.nextLine();
        String b=sc.nextLine();
        
        
        BigInteger a1=new BigInteger(a);
        BigInteger b1=new BigInteger(b);
        

        System.out.println(a1.add(b1));
        System.out.println(a1.multiply(b1));

        

    }
}

