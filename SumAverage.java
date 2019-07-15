package sowmya1;
import java.util.Scanner;

public class SumAverage {
	int num1;
	int num2;
	int num3;
	int sum,avrg;
	void getresult()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num1:");
		num1=scan.nextInt();
		System.out.println("Enter the num2:");
		num2=scan.nextInt();
		System.out.println("Enter the num3:");
		num3=scan.nextInt();
		
	}
	void getResultvalue()
		{
		sum=num1+num2+num3;
		avrg=sum/3;
		System.out.println("The sum of three num is"+sum);
		System.out.println("The avrg of three num is"+avrg);
		
		
		
	}
	}
	


