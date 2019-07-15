package sowmya1;
import java.util.Scanner;

public class DisplyBwRange {
	int number;
	int i;
	void getValue()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		number =scan.nextInt();
		
	}
	void getResult()
	{ 
		for(i=5;i<=number;i++)
		{
			System.out.println(i);
	}
	}

}
