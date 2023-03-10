/* In a family, the people are arranged in rows and columns. Male persons in the families are arranged in a row and females are arranged in a column. Find the eldest women in each column. (Write a program to find the maximum element in each column of the matrix.)

Input Format:

The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. 

The remaining integers correspond to the elements in the matrix. 

The elements are read in row-wise order, the first row first, then second row and so on. 

Output Format:

Output consists of an maximum elements in the each column.

Sample Input:
3
3
1 2 9
8 2 1
4 1 1

Sample Output:

8
2
9 */


import java.util.Scanner;
public class Maximum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
                
            }
        }
        for(int i=0;i<a.length;i++)
        {
            int max=a[0][i];
            for(int j=0;j<a[i].length;j++)
            {
                if(a[j][i]>max)
                {
                    max=a[j][i];
                }
            }
            System.out.println(max);
        }
    }
}
