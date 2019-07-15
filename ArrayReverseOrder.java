package sowmya1;

import java.util.Scanner;

public class ArrayReverseOrder {
int[] number=new int[10];
int[] reverse=new int[10];
void getInput()
{
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<=9;i++)
	{
		System.out.println("Enter the number");
		number[i]=scan.nextInt();
	}	
}
void displayReverse()
{
	//int i = 0;
	for( int j=9;j>=0;j--)
	{
	    reverse[j]=number[j];
	    System.out.println("reverse is"+reverse[j]);
		
	}
	
}
}
