package sowmya1;

import java.util.Scanner;

public class FindSquare {
	int length;
	int breath;

public void check()
{
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the length of rectangle");
	length=scan.nextInt();
	System.out.println("Enter the breath of rectangle");
	breath=scan.nextInt();
	if(length==breath)
	{
		System.out.println(" square");
		
	}
	else
	{
		System.out.println("rectangle");
	}
	}
}


	
	




