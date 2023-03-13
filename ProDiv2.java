/*Method- Product and Division
Write a program to get 2 numbers from the user and calculate their product, quotient and remainder using '*', '/' and '%' operators respectively. Print the corresponding product, quotient and remainder of the numbers as output in the console. 

Input format: 

First input: an integer

Second input: an integer 

Output format: 

The first output will be the product of two integers 

The second output will be the quotient 

The third output will be the remainder

Sample Input:

50

10

Sample Output:

500

5

0 */


import java.util.Scanner;
public class ProDiv
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Calsi calc=new Calsi();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(calc.mul(a,b));
        System.out.println(calc.div(a,b));
        System.out.println(calc.mod(a,b));
    }
}
class Calsi
{
    public static int mul(int a,int b)
    {
        int mul=a*b;
        return mul;
    }
    public static int div(int a,int b)
    {
        int div=a/b;
        return div;
    }
    public static int mod(int a,int b)
    {
        int mod=a%b;
        return mod;
    }
}
