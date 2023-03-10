/*String Reverse
Write a program to find the reverse of the given without string using string library functions: 

Input & Output Format:

Input consists of 1 string.

Output consists of reversed string.

Sample Input:
cyfuno

Sample Output:

onufyc */


import java.util.Scanner;
public class String4
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String r=" ";
      int a=s.length();
      for(int i=(a-1);i>=0;i--)
      {
          char c=s.charAt(i);
          r=r+c;
      }
      System.out.println(r);
    }
}
