/*Method- Swapping of two numbers
Write a program to get 2 numbers from the user and swap their values without any loss of data. You can make use of an additional 3rdvariable for swapping. Print the corresponding swapped values of the two numbers as output in the console. 

Input format: 

First input: an integer 

Second input: an integer 

Output format: 

The output will be integers(swapped values)

Sample Input:

20

10

Sample Output:

10

20 */


import java.util.Scanner;
public class Swap3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        change.pop(a,b);
    }
}
class change
{ 
    public static void pop(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

        //write your code
    }
}
