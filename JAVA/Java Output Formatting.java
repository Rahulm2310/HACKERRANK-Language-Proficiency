import java.util.Scanner;

public class Solution {

    public static void main(String[] args) 
    {
    
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            
            
            for(int i=0;i<3;i++)
            {
            
            
                String s1=sc.next();
                int x=sc.nextInt();
                
                for(int t=0;s1.length()<15;t++)
                {
                
                    s1=s1+" ";
                    
                }
                
                String num=String.valueOf(x);
                
                if(num.length()==2)
                {
                
                   num="0"+num; 
                   
                }
                
                else if(num.length()==1)
                {
                
                    num="00"+num;
                }

                System.out.println(s1+num);
                
            }
        
            
            System.out.println("================================");
            

    }
}



