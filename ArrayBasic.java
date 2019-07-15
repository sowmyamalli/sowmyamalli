package sowmya1;

import java.util.Scanner;

public class ArrayBasic {
	int[] numbers=new int[5];
	Scanner scan=new Scanner (System.in);
	void getInput()
	{
		for(int i=0;i<=4;i++)
		{
		System.out.println("Enter the number");
		numbers[i]=scan.nextInt();
		
	}
	}
	 void sum()
	{
		 int sum=0;
		for(int j=0;j<=4;j++)
		{
		 sum=sum+numbers[j];
	    }
		System.out.println("The sum is"+sum);
	}
	 void average()
	 {
		for(int l=0;l<=4;l++) 
		{
			int sum=0;
			int avg=sum/numbers[l];
		}
		}
	 void count()
	 {
		 int count=0;
		 System.out.println("Enter the number to find ");
		 int num=scan.nextInt();
		 for(int m=0;m<=4;m++)
		 {
			// num=numbers[m];
			 if(num==numbers[m]){
				 count=count+1;
			  }
			 
		 }
		 System.out.println("The number"+num+  "is present in "  +count+  "times");
	 }
	 
	 void findDigit()
	 {
		 int count=0;
		 System.out.println("Enter the number to find ");
		 int num=scan.nextInt();
		 for(int k=0;k<=4;k++)
		 {
			 if(num==numbers[k])
			 {
				 System.out.println("The value found in position"+k);
			 }
		 }
	 }
	 void findMaximam(){
	 int max=0;
	 {
		 for(int i=0;i<=4;i++)
		 {
			 if(numbers[i]>max)
			 {
				max=numbers[i];
			 }
		 }
		 System.out.println("The maximum value is "+max );
	 }
	 }	
		 
		void findMinimum()
		{
			int min=numbers[0];
			for(int i=0;i<=4;i++)
			 {
				 if(numbers[i]<min)
				 {
					min=numbers[i];
				 }
			 }
			 System.out.println("The minimum value is "+min );
		
	 }
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 
	 
	 
	 
	 
	 


