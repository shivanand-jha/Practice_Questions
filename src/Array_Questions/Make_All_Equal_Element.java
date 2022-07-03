package Array_Questions;

import java.util.Scanner;

public class Make_All_Equal_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] arr= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int max=-1;
            for (int i = 0; i < n; i++) {
                 int c=0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j])
                        c++;
                }
                if(c>max)
                    max=c;
            }
            System.out.println(n-max);
        }
    }
}
