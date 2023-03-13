/*Methods-sum of digits
Write a program to find the sum of digits in a given number. Program to find the sum of digits of the given number is discussed here. 
For example, let the input number be 719. The sum of digits of 719 = 7 + 1 + 9 = 17
Input & Output Format:

Input consists of one integer.

Output consists of sum of digits.

Sample Input:

719

Sample Output:

17 */


import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Digit d=new Digit();
        int a=sc.nextInt();
        System.out.println(d.add(a));
    }
}
class Digit
{
    public static int add(int a)
    {
        int sum=0,r;
        while(a>0)
        {
            r=a%10;
            sum=sum+r;
            a=a/10;
        }
        return sum;
    }
}
