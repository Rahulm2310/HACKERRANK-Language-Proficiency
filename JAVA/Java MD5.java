import java.io.*;
import java.util.*;
import java.security.*;
import java.math.BigInteger; 



public class Solution {

    
    public static void main(String[] args) throws NoSuchAlgorithmException  {
        
       Scanner sc=new Scanner(System.in);
       String input=sc.next();
       System.out.println(getMD5(input));
        
    }

    
    
    public static String getMD5(String s)
    {
    
        try{
        
            MessageDigest m=MessageDigest.getInstance("MD5");

            byte[] message =m.digest(s.getBytes());

            BigInteger num=new BigInteger(1,message);

            String hash=num.toString(16);

            while(hash.length()<32)
            {
                hash="0"+hash;
            }

            return hash;
            
        }

        catch(NoSuchAlgorithmException e)
        {
            throw new RuntimeException(e);
        }
        
        
        
    } 
}

