package sowmya1;
import java.util.Scanner;
public class CalcularorUseTest {

	public static void main(String[] args) {
		//int a;
		//int b;
		//calculateruse a1=new calculateruse();
		//a1.getValue();
		boolean b1=true;
		while(b1)
		{
		
		
		/*System.out.println("enter the number a");
		a=scan.nextInt();
		System.out.println("enter the  number b");
		b=scan.nextInt();*/
		System.out.println("menu");
		System.out.println("1.Addition");
		System.out.println("2.subraction");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		calculateruse a1=new calculateruse();
		a1.getValue();
		if(choice==1)
		{
			a1.add();
		}
		else if(choice==2)
		{
			a1.sub();
		}
		else
		{
			System.out.println("wrong answer");
		}
		System.out.println("do you want continue(Y/N)");
		char cho=scan.next().charAt(0);
		if(cho=='N')
		{
			b1=false;
		}
		}
	}
}



