/*Got a Furniture? Resell it..
Python program to calculate Depreciation. Depreciation is a financial word, defined as the reduction of the recorded cost of a fixed asset in a systematic manner until the value of the asset becomes zero or negligible. 

What is Depreciation?

The decrease in value of assets (fair value depreciation)
The allocation of the cost of assets to periods in which the assets are used (depreciation with the matching principle)
Depreciation is a method of reallocating the cost of a tangible asset over its useful lifespan of it being in motion. Businesses depreciate long-term assets for both tax and accounting purposes.
Input format:
First input corresponds to the principle of the furniture.
Second  input represents the percentage of depreciation. 
Third input represents number of years

Sample Input: 
10000
5
5
Sample Output:
7736 */


import java.util.Scanner;
class Furniture
{
	public static void main(String arg[])	
	{
	    Scanner sc=new Scanner(System.in);
         long amount,deppercent,year,afterdep,temp;
	  amount=sc.nextLong();
	 deppercent=sc.nextLong();
	 year=sc.nextLong();
	 temp=amount;
	 for(int i=0;i<year;i++)
	 temp=((100-deppercent)*temp)/100;
	 System.out.println(temp);
	}
}
