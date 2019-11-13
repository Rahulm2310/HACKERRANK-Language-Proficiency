import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean lex=true;
        int flag1=0;
     
        if(A.length()>=B.length())
        {
            for(int i=0;i<B.length();i++)
            {
                if(A.charAt(i)!=B.charAt(i))
                {
                    flag1=1;
                    if(A.charAt(i)<B.charAt(i))
                    {
                        lex=false;
                    }
                    else if(A.charAt(i)>B.charAt(i)){
                        lex=true;
                    }
                    break;
                }
            }

            if(flag1==0&&A.length()==B.length())
            {
                lex=false;
            }

            else if(flag1==0)
            {
                lex=true;
            }
        }

        else if(A.length()<B.length())
        {
            for(int i=0;i<A.length();i++)
            {
                if(A.charAt(i)!=B.charAt(i))
                {
                    flag1=1;
                    if(A.charAt(i)<B.charAt(i))
                    {
                        lex=false;
                    }
                    else if(A.charAt(i)>B.charAt(i)){
                        lex=true;
                    }
                    break;
                }
            }
            if(flag1==0)
            {
                lex=false;
            }
        }
        

        
        System.out.println(A.length()+B.length());
        if(lex)
        {
        System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+ B.substring(0,1).toUpperCase()+B.substring(1));
    }
}



