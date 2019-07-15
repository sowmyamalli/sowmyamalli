package sowmya1;
import java.util.Scanner;
public class Palindrom {
	int r,n;
	int rev=0;
public	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		n=scan.nextInt();
		
	}
public	void reverse()
{
	
    int temp=n;
	while(n>0)
	{
		 r=n%10;
		 rev=rev*10+r;
		 n=n/10;
    } 
		System.out.println(temp);
    }
public static void main(String[] args)
{
	Palindrom p=new Palindrom();
	p.getInput();
	p.reverse();
	
}
    }


