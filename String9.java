/*Palindrome or Not
Write a program to find whether the given string is palindrome or not without using string library functions: 

 INPUT & OUTPUT FORMAT: 

Input consists of 1 string. If the given string is a Palindrome display “palindrome”, else display “Not a Palindrome”.

Sample Input:
liril

Sample Output:
palindrome */


import java.util.*;   
class String9  
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("palindrome");  
      else  
         System.out.println("Not a palindrome");   
   }  
}//Code here
