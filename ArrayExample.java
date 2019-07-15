package sowmya1;
import java.util.Scanner;
public class ArrayExample {
	int i,n;
	Scanner scan=new Scanner(System.in);
	
	public void getInput()
	{
		
		System.out.println("Enter number of values"+n);
		n=scan.nextInt();
		int[] mark=new int[n];
		for(i=0;i<n;i++)
		{
			
			System.out.println("Enter the value");
			mark[i]=scan.nextInt();
		}
		int sum=0;
			for( i = 0;i<n;i++)
			{
				
				 sum = sum+mark[i];
				
			    
			}
			System.out.println(sum);
		}
		
	}

		


