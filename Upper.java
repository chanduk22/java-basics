/* write a program to find  Upper Triangular Matrix using 2D.

Sample Input:
3
0 0 1
0 2 3
0 0 5

Sample Output:

Upper triangular matrix */


import java.util.Scanner;
public class Upper
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ar[][]=new int[a][a];
        int i,j,n=0;
        for(i=0;i<a;i++)
            for(j=0;j<a;j++)
                ar[i][j]=sc.nextInt();
        for( i=0;i<a;i++)
            for( j=0;j<a;j++)
                if(ar[i][j]!=0)
                  n=0;
              else
                 n=1;  
          if(n==1)
          System.out.println("Upper triangular matrix");
          else
          System.out.println("Not an Upper triangular matrix");
    }
}
