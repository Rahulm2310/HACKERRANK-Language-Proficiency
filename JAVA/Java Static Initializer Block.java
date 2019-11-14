import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int B;
    static int H;
    static boolean flag=false;

    
static {

    Scanner sc=new Scanner(System.in);
    B=sc.nextInt();
    H=sc.nextInt();

    if(B>0&&H>0)
    {
        flag=true;
    }

    if(flag==false)
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

}
    

