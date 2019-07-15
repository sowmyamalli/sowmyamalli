package sowmya1;
import java.util.Scanner;
public class calculateruse {
int a,b,c;
void getValue()
{
	System.out.println("Enter the a value");
	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();
	System.out.println("Enter the b value");	
	b=scan.nextInt();
	
}
void add()
{
	c=a+b;
	System.out.println("Addition" +c);
}

void sub()
{
	System.out.println("subraction" +(c));
}
}

