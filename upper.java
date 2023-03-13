/*Calculate the number of upper case letters and lower case letters- L2
Write a program that accepts a sentence and calculate the number of upper case letters and lower case letters.

Suppose the following input is supplied to the program:

Sample input:

Hello world!

Sample output: 

UPPER CASE 1

LOWER CASE 9 */


import java.util.Scanner;
class upper
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int upper=0,lower=0;
    for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
        }
    System.out.println("UPPER CASE "+upper);
    System.out.println("LOWER CASE "+lower);
    }
}
