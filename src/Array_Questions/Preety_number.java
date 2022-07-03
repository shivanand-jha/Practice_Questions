package Array_Questions;
import java.util.*;
import java.lang.*;

public class Preety_number {
    /* package codeChef; // don't place package name! */



    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int t= sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                int m=sc.nextInt();
                int c=0;
                for(int i=n; i<=m; i++)
                {
                    if(i%2==0 && i%3==0 && i%9==0)
                        c++;
                }
                System.out.println(c);
            }
        }
    }


