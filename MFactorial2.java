/*Method-Factorial
Write a program to determine whether n is a factorial number or not. A factorial number is a number that is a factorial of another number.

Input Format:

Input consists of a single integer which corresponds to n.

Output Format:

Output consists of a string - “yes” or “no”

Sample Input 1

6

Sample Output 1

yes

Sample Input 2

12

Sample Output 2

no */


import java.util.Scanner;
public class Factorial2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Facto fac=new Facto();
        int n=sc.nextInt();
        fac.add(n);
    }
}
class Facto
{
    public static void add(int n)
    {
        int fact=1,i=1;
        while(fact<n)
        {
        i=i+1;
        fact=fact*i;
        }
        if(n==fact)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
