package sowmya1;
import java.util.Scanner;
public class SumProdMaxMin {
	int a,b,c,sum,prod,min,max;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		a=scan.nextInt();
		System.out.println("Enter the number");
		b=scan.nextInt();
		System.out.println("Enter the number");
		c=scan.nextInt();
		
	}
	void businessLogic()
	{
		sum=a+b+c;
		prod=a*b*c;
		if((a>b)&&(a>c))
		{
			max=a;
		}
		else if((b>c)&&(b>a))
		{
			max=b;
		}
		else
		{
			max=c;
		}
		}
	void getResult()
	{
		System.out.println("The sum is:" +sum);
		System.out.println("The product is:" +prod);
		System.out.println("The maximum is:" +max);
		//System.out.println("The sum is:" +sum);	
	}
	public static void main(String[] args)
	{
		SumProdMaxMin sp=new SumProdMaxMin();
		sp.getInput();
		sp.businessLogic();
		sp.getResult();
		
	}
	}


