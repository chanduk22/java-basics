/*Method- Profit or Loss
A fruitseller buys a dozen mango at Rs.X. He sells 1 mango at Rs.Y. Write a program to determine the profit or loss in Rs. for the fruitseller.

 Input and Output Format:

Input consists of 2 floating point numbers which correspond to X and Y.

Refer sample input and output for formatting specifications. .

 Sample Input1:

60.0

4

Sample Output1:

Enter the price of a dozen mangoes

Enter the price at which 1 mango is being sold

Loss : Rs.12.00

Sample Input 2:

60.0

6

Sample Output 2:

Enter the price of a dozen mangoes

Enter the price at which 1 mango is being sold

Profit : Rs.12.00

Sample Input 3:

60.0

5

Sample Output 3:

Enter the price of a dozen mangoes

Enter the price at which 1 mango is being sold

No profit nor loss */


import java.util.Scanner;
public class Profit2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of a dozen mangoes");
        float x=sc.nextFloat();
        System.out.println("Enter the price at which 1 mango is being sold");
        float y=sc.nextFloat();
        pro.demo(x,y);
    }
}
class pro
{
    public static void demo(float x,float y)
    {
        float profit,loss;
        float c;
        c=y*12;
        if(c>x)
        {
            profit=c-x;
            System.out.printf("Profit : Rs.%.2f",profit);
        }
        else if(c<x)
        {
            loss=x-c;
            System.out.printf("Loss : Rs.%.2f",loss);
        }
        else
        {
            System.out.println("No profit nor loss");
        }
    }
}
       
