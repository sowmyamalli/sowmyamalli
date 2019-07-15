package sowmya1;
import java.util.Scanner;
public class FindDigit {
	int num;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
	}
	void display()
	{
		if((num>=10)  && (num<=99))
		{
			System.out.println("2 digit");
		}
		else if((num>=100)  &&  (num<=999))
		{
			System.out.println("3 digit");
		}
		else if((num>=1000)  &&  (num<=9999))
		{
			System.out.println("4 digit");
		}
		else
		{
			System.out.println("invalid");
		}
		}
	public static void main(String args[])
	{
		FindDigit f=new FindDigit();
		f.getInput();
		f.display();
	}
	}
