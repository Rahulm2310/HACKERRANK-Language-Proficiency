import java.io.*;
import java.util.*;



public class Solution {

    
    
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        
        int beg=0;
        int end=A.length()-1;
        int flag=0;
        
        
        for(int i=0;i<(A.length())/2;i++ )
        {
            
            
                if(A.charAt(beg)!=A.charAt(end))
                {

                    flag=1;
                    break;

                }
            
            beg++;
            end--;
            
            
        }
        
        
        

        if(flag==1)
        {
            System.out.println("No");
        }
        
        
        
        else
        {
            System.out.println("Yes");
        }
        
        
        
    }
}



