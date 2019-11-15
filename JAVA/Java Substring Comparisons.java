import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        String word = "";
        

        for(int i=0;i<=s.length()-k;i++)
        {
        
                word=s.substring(i,i+k);
                
                if(word.compareTo(smallest)<0)
                {
                    smallest=word;
                }
                
                 if(word.compareTo(largest)>0)
                 {
                     largest=word;
                 }

        }
        
      
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}