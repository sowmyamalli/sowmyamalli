package sowmya1;

import java.util.Scanner;

public class PrimeRangeTest {
	 private int n;
	/*public void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		n=scan.nextInt();
		
	}*/
	public void printPrimeOrNot()
	{
		int check=0;
		
		for( int i=2;i<n;i++)
		{
		   if(n%i==0)
		   {
			   check=1; 
			   break;
		   }
	   }
		if(check==0)
		{
			System.out.println(n+" "+" is  prime number");
			
		}else
		{
			System.out.println(n+" "+ "is not a prime number");
		}
	}

	
public static void main(String[] args)
{
	PrimeRangeTest p=new PrimeRangeTest();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter starting range");
	int start=scan.nextInt();
    System.out.println("Enter ending range");
	int end=scan.nextInt();
	for(int range=start;range<end;range++)
	{
		p.printPrimeOrNot();
	}
}
}
