package sowmya1;

import java.util.Scanner;

public class FindFactorial {
       int[] elements=new int[5];
       int[] array=new int[5];
       int i,j;
void getInput()
{
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<=4;i++)
	{
	System.out.println("Enter the number");
	elements[i]=scan.nextInt();
    }
}
void findFact()
{
	
	int fact=1;
	for(int i=0;i<=4;i++)
	{
		
		for( j=1;j<=elements[i];j++)
		{
			
	        fact=fact*j;
	    }
		array[i]=fact;
		 fact=1;
		 System.out.println("The factorial value of array  "+i+ "is" + array[i]);

	   }
	}

     
	

}

