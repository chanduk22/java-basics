/* Lower Triangular Matrix
write a program to find Lower Triangular Matrix using 2D.

Sample Input:
3
1 0 0
4 5 0
1 0 0

Sample Output:
Lower triangular matrix */


import java.util.*;
public class Lower
{
    public static void main(String args[])
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
                if(ar[i][j]==0)
                  n=0;
              else
                 n=1;  
          if(n==0)
          System.out.println("Lower triangular matrix");
          else
          System.out.println("Not a Lower triangular matrix");
    }
}///code here
