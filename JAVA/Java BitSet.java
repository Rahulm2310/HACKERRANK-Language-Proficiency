import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        BitSet b1=new BitSet(n);
        BitSet b2=new BitSet(n);

        b1.clear();
        b2.clear();

        for(int i=0;i<m;i++)
        {
            
            String s=sc.next();
            int x=sc.nextInt();
            int y=sc.nextInt();

            if(s.equals("AND"))
            {
                if(x==1)
                {
                    b1.and(b2);
                }
                else if(x==2)
                {
                    b2.and(b1);
                }
                System.out.println(b1.cardinality()+" "+b2.cardinality());
            }

            if(s.equals("OR"))
            {
                
                if(x==1)
                {
                    b1.or(b2);
                }
                
                else if(x==2)
                {
                    b2.or(b1);
                }
                
                System.out.println(b1.cardinality()+" "+b2.cardinality());

            }

            if(s.equals("XOR"))
            {
                if(x==1)
                {
                    b1.xor(b2);
                }
                else if(x==2)
                {
                    b2.xor(b1);
                }
                
                System.out.println(b1.cardinality()+" "+b2.cardinality());

            }

            if(s.equals("FLIP"))
            {
                if(x==1)
                {
                    b1.flip(y);
                }
                else if(x==2)
                {
                    b2.flip(y);
                }
                
                System.out.println(b1.cardinality()+" "+b2.cardinality());


            }

            if(s.equals("SET"))
            {
                if(x==1)
                {
                    b1.set(y);
                }
                else if(x==2)
                {
                    b2.set(y);
                }
                System.out.println(b1.cardinality()+" "+b2.cardinality());

            }
            
        }

    }
    
}

