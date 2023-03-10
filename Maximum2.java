/*Heidi is the Maths professor in Arts college and provided mark sheet to students. In this class room, students are arranged in the form of rows and columns. Heidi needs to find the highest mark in each rows. Help him to find out.

INPUT FORMAT:

The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. 

The remaining integers correspond to the elements in the matrix. 

The elements are read in row-wise order, the first row first, then second row and so on. 

OUTPUT FORMAT:

Output consists of the maximum element in all the rows.

Sample Input:
3

3

1 2 3

4 5 6

7 8 9

Sample Output:

3

6

9 */


import java.util.Scanner;
public class Maximum2
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
            int max=a[i][0];
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
