package sowmya1;
import java.util.Scanner;
public class PositiveOrNegativeTest {
   
	PositiveOrNegative p1=new PositiveOrNegative();
	 
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the number");
	  int num=scan.nextInt();
	 String result=p1.findPositive( num);
	 System.out.println(result);
	

}
