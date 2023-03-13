/*Power of a number
Write a program to find the power of a number. In order to find the power of a number, multiply the number itself up to exponent times.

Example:
Suppose, 5 is the base and 4 is the exponent. In order to find the power of a number, multiply the number itself 4 times, i.e. (5 * 5 * 5 * 5 = 625).

Steps to Find Power of a Number
Read or initialize base and exponent.
Take another variable (power) to store the result and initialize it to 1.
Using the for loop or while loop, multiply the base by power and store the result into power.
Repeat the above step (3) until the exponent becomes 0.
Print the result.
Sample Input-1:
5
3
Sample Output-1:
125 */



import java.util.Scanner;
public class Powerofanumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int base,exp,pow=1,i;
        base=sc.nextInt();
        exp=sc.nextInt();
        for(i=exp;i>0;i--)
        {
            pow=pow*base;
        }
        System.out.println(pow);
    }
}
