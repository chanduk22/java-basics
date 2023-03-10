/* write a program to perform matrix subtraction using 2D 

Input Format:

Input consists of 2 integers and 2 matrix.

First input consists of a row.

Second input consists of a column

Third give the elements of the first matrix.

Fourth give the elements of the second matrix.

Output Format:

Output consists of 1 matrix

output consists of a substraction of a matrix



Sample Input:
2
2
1 5
9 4
1 1
1 1

Sample Output:
0 -4
-8 -3 */


import java.util.Scanner;
public class Matsub
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        int c[][]=new int[n][m];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                c[i][j]=b[i][j]-a[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
