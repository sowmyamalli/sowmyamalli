package sowmya1;

import java.util.Scanner;

public class CheckPositiveOrNegative {
int[] elements=new int[10];
void getInput()
{
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
	System.out.println("Enter the elements");
	elements[i]=scan.nextInt();
}
}
void fintNum()
{
	for(int i=0;i<10;i++){
	if(elements[i]>=0)
	{
		System.out.println("The number" + " "+  elements[i]+" "  +  "is positive and position"+" "+ i );
	}
}
	for(int j=0;j<10;j++)
	{
		if(elements[j]<=0)
	{
		System.out.println("The number"+" "+   elements[j]  +" "+   "is positive and position"+" "+ j );
	}
}
}
}
