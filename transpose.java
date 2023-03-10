/* write a program to perform transpose given 2D matrix.

Input & Output Format:

Input consists of one integer and one matrix.

First input consists of a row and a column.

Second give the array elements as a matrix based on their size of row and column.

Output consists of a transposed matrix.

Sample Input:
3

1 2 3

4 5 6

7 8 9

Sample Output:

Transpose matrix is :

1 4 7 

2 5 8 

3 6 9 */


import java.util.Scanner;
public class transpose
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose matrix is :");
           for(i=0;i<n;i++)
        {
            int k;
            for(j=0;j<n;j++)
            {
               k=a[j][i]; 
               System.out.print(k+" ");
            }
             System.out.println();
        }
    }
}
