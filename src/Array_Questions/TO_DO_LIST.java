package Array_Questions;
import java.util.*;
import java.lang.*;


public class TO_DO_LIST {
    /* package codeChef; // don't place package name! */


    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int t= sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                int[] arr= new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i]=sc.nextInt();
                }
                int c=0;
                for(int i=0; i<n; i++)
                {
                    if(arr[i]>=1000)
                        c++;
                }
                System.out.println(c);
            }
        }
    }


