/*Sum of Zig-Zag Pattern
Write a program to find the sum of Zig-Zag pattern:

INPUT & OUTPUT FORMAT: 

Input consists of 2 integers and 1 2D-array. Integers correspond to the size of rows and columns.

Output consists of the sum of zig zag pattern


Sample Input:
3
3
1 2 3
4 5 6
7 8 9

Sample Output:
35 */


import java.util.Scanner;
public class Zigzag
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int ar[][]=new int[a][b];
        int i,j;
        for(i=0;i<a;i++)
            for(j=0;j<b;j++)
                ar[i][j]=sc.nextInt();
        int sum=0;
        for(i=0;i<a;i++)
           for(j=0;j<b;j++)
           {
               if(i==0 && j<b || i==1 && j==(b-2) || i==(a-1) && j<b)
               sum=sum+ar[i][j];
           }
           System.out.println(sum);
    }
}//code here
