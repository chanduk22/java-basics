/*Lets play Cricket
Python Program to calculate the batting average.

Sample input: 

enter the number of matches played

150

enter the number innings batted

36

enter number of times notout

32

enter runs scored

1000

Sample Output


batting average=250.0 */


import java.util.Scanner;
public class Cricket
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of matches played");
        int m=sc.nextInt();
        System.out.println("enter the number innings batted");
        int i=sc.nextInt();
        System.out.println("enter number of times notout");
        int n=sc.nextInt();
        System.out.println("enter runs scored");
        int r=sc.nextInt();
        float a=r/(i-n);
        System.out.printf("batting average=%.1f",a);
    }
}
