/* Counting Vowels
Write a program to count the number of vowels in the given string: 

 INPUT & OUTPUT FORMAT:

Input consists of 1 string. 

Output print the number of Vowels.

Sample Input:
cyfuno

Sample Output:

2 */


import java.util.*;
public class String10
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        s=s.toLowerCase();
        int count=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='a'||s.charAt(i)=='e'
                || s.charAt(i)=='i'
                || s.charAt(i)=='o'
                || s.charAt(i)=='u') 
                {
                count++;
                }
        }
        System.out.println(count);
    }
}//Code here
