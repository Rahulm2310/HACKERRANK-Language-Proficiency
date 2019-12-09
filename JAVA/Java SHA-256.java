import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.security.*;



public class Solution {

      
      public static void main(String[] args) throws NoSuchAlgorithmException  {
      
       Scanner sc=new Scanner(System.in);
       String input=sc.next();
       System.out.println(getSHA(input));
       sc.close();
       
    }
      
      

    public static String getSHA(String s)
    {
    
        try{
        
            MessageDigest m=MessageDigest.getInstance("SHA-256");

            byte[] message =m.digest(s.getBytes());

            BigInteger num=new BigInteger(1,message);

            String hash=num.toString(16);
              

            while(hash.length()<64)
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


