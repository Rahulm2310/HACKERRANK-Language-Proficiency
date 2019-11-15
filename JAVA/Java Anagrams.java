import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
       
        List<Character> A=new ArrayList<Character>();
        List<Character> B=new ArrayList<Character>();
        int flag=0;

        if(a.length()==b.length())
        {

            for(int i=0;i<a.length();i++)
            {
                 A.add(a.charAt(i).toLowerCase());

                 B.add(b.charAt(i).toLowerCase());
            }


            for(int k=0;k<A.size();k++)
            {
                if(Collections.frequency(A,A.get(i))!=Collections.frequency(B,A.get(i))){
                    flag=1;
                }
            }

            if(flag==0)
            {
                return true;
            }
            else if(flag==1)
            {
                return false;
            }
        }

        else{
            return false;
        }




    }




  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
