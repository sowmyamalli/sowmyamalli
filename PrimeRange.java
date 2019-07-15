package sowmya1;

import java.util.Scanner;

public class PrimeRange {
	int i,n,k,l;
	public void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number1");
		k=scan.nextInt();
		System.out.println("Enter the number2");
		l=scan.nextInt();
	}
	public void CheckPrimeRange()
	{   int i,j;
		
		for( i=k;i<l;i++)
		{
			int check=0;
			for(  j=2;j<i;j++)
			{
			   if(i%j==0)
			   {
				   check=1; 
				   break;
				  
			   }
		   }
			if(check==0)
			{
				System.out.println(i+  "prime number");
				check++;
				
			}else
			{
				System.out.println(i+" not a prime number");
			}
		}
		}
	
	public static void main(String[] args) {
		 PrimeRange p=new  PrimeRange();
		 p.getInput();
		 p.CheckPrimeRange();
	}

}
