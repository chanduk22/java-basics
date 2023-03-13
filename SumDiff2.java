/*Method-Sum and Difference
Write a program to get 2 numbers from the user and calculate their sum and difference using '+' and '-' operators respectively. Print the corresponding sum and difference of the numbers as output in the console.

 Input format:

First input: an integer 

Second input: an integer 

Output format:

First output will be the sum of two integers

Second output will be the difference of two integers

Sample Input:

55

34

Sample Output:

89

21 */


import java.util.Scanner;
public class SumDiff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Calsi calc=new Calsi();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(calc.add(a,b));
        System.out.println(calc.sub(a,b));
    }
}
class Calsi
{
    public static int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static int sub(int a,int b)
    {
        int sub=a-b;
        return sub;
    }
}
