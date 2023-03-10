/*String Concat
Write a C program to find the concatenation of given two strings using string library functions:

INPUT & OUTPUT FORMAT: 

Input consists of 2 strings.

Output consists of concatenated strings

Sample Input:
cyfuno

technology

Sample Output:

cyfunotechnology */


import java.util.Scanner;
public class String6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        System.out.println(s.concat(t));
    }
}
