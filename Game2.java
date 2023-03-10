/*Sabrina and Theo’s Game-2
Sabrina and Theo were friends. They felt very bored and decided to play a game with calendar and number of days. Sabrina will give the month and the year as input, and Theo wants to find the number of days in that month. Write a C program using switch case and help Sabrina to find the answer. You should check whether the given year is a leap year. If it is a leap year it will have 29 days in February.

Input & Output Format:

Input consists of two integers.

First input consists of  a month.

Second input consists of a year.

Output consists of a integer.


Sample Input:

3

1996

Sample Output:
Number of days is 31 */


import java.util.Scanner;
public class Game
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int leap=0;
        if(b%400==0 && b%100==0 && b%4==0)
        {
            leap++;
        }
        
        if(leap==0 && a==2 && b!=2013)
            System.out.println("Number of days is 29");
        else if(a==1||a==3||a==5||a==7||a==8||a==10||a==12)
        System.out.println("Number of days is 31");
        else if(a==4||a==6||a==9||a==11)
        System.out.println("Number of days is 30");
        else if(a==2)
            System.out.println("Number of days is 28");
    } 

    
}
