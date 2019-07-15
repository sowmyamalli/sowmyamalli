package sowmya1;

import java.util.Scanner;

public class FindSumAverage {

	int num,i,n,sum,average;
	int count=0;
	Scanner scan=new Scanner(System.in);
	public void getInput()
	{
		System.out.println("Enter the number");
		num=scan.nextInt();
	}
	public void getvalue()
	{
		
		for(i=1;i<num;i++)
		{
			sum=sum+num;
			count=count+1;
			average=sum/count;
			System.out.println("sum is"+sum);
			System.out.println("Average is"+average);
		}
		
	
	
		
	}
}
