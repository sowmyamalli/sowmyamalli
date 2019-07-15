 package sowmya1;
import java.util.Scanner;
public class Prime {
int n;
public void getInput()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	n=scan.nextInt();
	
}
public void printPrimeOrNot()
{
	int check=0;
	
	for( int i=2;i<n;i++)
	{
	   if(n%2==0)
	   {
		   check=1; 
		   break;
	   }
   }
	if(check==0)
	{
		System.out.println(n+" "+" is  prime number");
		
	}else
	{
		System.out.println(n+" "+ "is not a prime number");
	}
}

}
