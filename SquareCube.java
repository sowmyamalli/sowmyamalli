package sowmya1;
import java.util.Scanner;
import java.lang.Math;

public class SquareCube {
	int num;
	double result,result1;
	void getValue()
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
	}
	void getResult()
	{
		result=(num*num);
		System.out.println("square"+result);
		result1=(num*num*num);
		System.out.println("cube"+result1);
		
	}

}
