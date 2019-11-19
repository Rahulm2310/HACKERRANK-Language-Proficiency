import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<=n;i++)
        {
            
            for(int j=0;j<n;j++)
            {
                sum=0;
                if(i+j<=n)
                {
                    for(int k=j;k<i+j;k++)
                    {
                        sum+=arr[k];
                    }

                    if(sum<0)
                        count++;
                }
            }
            
        }
        System.out.println(count);
    }
}

