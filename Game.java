/*Karthi’s Paintings
A wall is of length L and breadth B. Karthi is trying to fit two rectangular paintings in it. He wants to fit these paintings on the wall such that they do not overlap on each other or they should not move outside the area of the wall. He also knows the length and breadth of both the paintings. Help him in finding whether two paintings can fit in to the wall properly or not.

INPUT & OUTPUT FORMAT:

Input consists of 6 integers.

First and second input corresponds to the length and breadth of the wall.

Third and fourth input corresponds to the length and breadth of the first painting.

Fifth and sixth input corresponds to the length and breadth of the second painting.

If both the paintings can be fixed on the wall, display “Karthi can fix both painting” or display “Karthi cannot fix both painting”.


Sample Input:
10
10
5
5
5
5

Sample Output:
Karthi can fix both painting */


import java.util.Scanner;
public class Game
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        int x=(a+b)/2;
        int y=c+d;
        int z=e+f;
        if(z==x && z==y)
        {
            System.out.println("Karthi can fix both painting");
        }
        else
        {
            System.out.println("Karthi cannot fix both painting");
        }
    }
}
