package sowmya1;
import java.util.Scanner;

public class ConcadinateTest {

	public static void main(String args[]) {
		Concadinate c=new Concadinate ();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the name 1:");
		String name1 = scan.nextLine();
		System.out.println("Enter the name 2:");
	    String name2=scan.nextLine();
		String name=c.getValue( name1, name2);
		System.out.println(name);
		System.out.println(args[0]);
	}

}
