package sowmya1;

import java.util.Scanner;

public class DiscountAmountSalesPrice {
	//String productNmae;
	int productprice;
	int discountrate;
	int discountamount;
	int salesprice;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the value of product price:");
		productprice=scan.nextInt();
		System.out.println("Enter the discountrate: ");
		discountrate=scan.nextInt();
		//discountamount=productprice*discountrate;
		//discountrate=(r/100);
		//System.out.println(" The discount amount is"+discountamount);
	}
	
	void findRate()
	{
		discountamount=productprice*discountrate/100;
		salesprice=productprice-discountamount;
		//System.out.println("The salesprice is:"+salesprice);
	}
	void DisplayOutput()
	{
		System.out.println("The discountamount is:"+discountamount);
		System.out.println("The salesprice is:"+salesprice);
	}
	}
	

