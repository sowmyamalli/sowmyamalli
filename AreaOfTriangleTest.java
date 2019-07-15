package sowmya1;

import java.util.Scanner;

public class AreaOfTriangleTest {

	public static void main(String[] args) {
		AreaOfTriangle b1=new AreaOfTriangle();
		//b1.AreaTringle();
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter the value on length");
		b1.length=scan.nextInt();
		System.out.println("Enter the value of breath");
		b1.breath=scan.nextInt();
		b1.AreaTringle();
	}

}
