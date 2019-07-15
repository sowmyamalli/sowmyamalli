package sowmya1;
import java.util.Scanner;

public class TwoString {
	String name1;
	String name2;
	void setValue()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		name1=scan.nextLine();
		
		System.out.println("Enter the another string");
		name2=scan.nextLine();
		
	}
	void getValue()
	{
		System.out.println(name1+ " " +name2);
	}
	

public static void main (String[]args)
{
	TwoString a1=new TwoString();
	a1.setValue();
	a1.getValue();
}
}
