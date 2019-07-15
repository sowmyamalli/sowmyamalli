package sowmya1;
import java.util.Scanner;
public class CheckFactor 
{
      private int num,i;
public void getInput()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	num=scan.nextInt();
}
public void findFactor()
{
	for(i=1;i<num-1;i++)
	{
		if(num%i==0)
		{
			System.out.println(num +"is divisable by"+i);
		}
		
	}
}
}
