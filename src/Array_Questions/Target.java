package Array_Questions;
import java.util.*;
import java.lang.*;

public class Target {
    /* package codeChef; // don't place package name! */



    /* Name of the class has to be "Main" only if the class is public. */


        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);


            int[] arr= new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0; i<4; i++)
            {
                if(arr[i]>=10)
                    c++;
            }
            System.out.println(c);
        }
    }


