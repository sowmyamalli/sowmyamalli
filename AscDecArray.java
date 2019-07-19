package arrayExample;

import java.util.Scanner;

public class AscDecArray {
      int[] elements=new int[5];
      int[] asc=new int[5];
      int[] dec=new int[5];
      int i,j,temp;
      public void getInput()
      {
    	  Scanner scan=new Scanner (System.in);
    	  for(i=0;i<5;i++)
    	  {
    		  System.out.println("Enter the number");
    		  elements[i]=scan.nextInt();
    	  }
      }
      public void printOrder()
      {
    	  for(i=0;i<5;i++)
    	  {
    	  asc[i]=elements[i];
    	  dec[i]=elements[i];
    	  }
    	  int i=0;
    	  for(i=0;i<5;i++)
    	  {
    		  for(j=i+1;j<5;j++)
    		  {
    			  if(asc[i]>asc[j])
    		      {
				       temp= asc[i];
    			       asc[i]=asc[j];
    			       asc[j]= temp;
    			  }
    		  }
    	  }
    	  for(i=0;i<5;i++)
    	  {
    		  for(j=i+1;j<5;j++)
    		  {
    			  if(dec[i]<dec[j])
    		      {
				       temp= dec[i];
				       dec[i]=dec[j];
				       dec[j]= temp;
    			  }
    		  }
    	  }
    	  
      }
      public void display()
      {
    	  System.out.println("Acending"+"  "+"Decending" );
    	  for(i=0;i<5;i++)
    	  {
    		  System.out.println(asc[i]+"        "+dec[i]);
    	  }
      }
}
