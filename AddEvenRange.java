package sowmya1;
import java.util.Scanner;
public class AddEvenRange {
	int num;
	int i,j;
	void findodd()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=scan.nextInt();
	}
	void findResult()
	{
		System.out.println("The even number are");
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
					{	
				
				System.out.println(i);
					}
		}
	}
	void FindOddResult()
	{
		System.out.println("The odd number are");
		for(j=1;j<=num;j++)
		{
			if(j%2!=0)
			{
				
				System.out.println(j);
			}
			}
		}
	}
	


