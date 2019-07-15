package sowmya1;
import java.util.Scanner;
public class ReverseOrder {
	int num;
	int i;
	void getResult()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
	}
	void getReverse()
	{ 
		for(i=num;i>=1;i--)
		{
			System.out.println(i);
	}
	}

}
