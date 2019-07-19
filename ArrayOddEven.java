package sowmya1;

import java.util.Scanner;

public class ArrayOddEven {
       int[] elements=new int[5];
       int[] odd=new int[5];
       int[] even=new int[5];
       int n,i,j,k;
       public void getInput()
       {
    	   Scanner scan=new Scanner(System.in);
    	   for( int i=0;i<5;i++)
    	   {
    	   System.out.println("Enter the elements");
    	   elements[i]=scan.nextInt();
    	   }
       }
       public void findOddOrEven()
       {
    	   for(  i=0;i<5;i++)
    		{
    		   if(elements[i]%2==0)
    			{
    				even[i]=elements[i];
    				
    		    }
    			else 
    			{
    				odd[i]=elements[i];
    			
    			}
    		   }
    		}   
       
       public void check()
       {
    	   System.out.println("odd number are");
    	   for(i=0;i<5;i++)
    	   {
    		   if(odd[i]!=0 )
    		   {
    			   System.out.println(odd[i]);
    		   }
    	   }
    	   System.out.println("even numbers are");
    	   for(j=0;j<5;j++)
    	   {
    		   if(even[j]!=0 )
    		   {
    			    System.out.println(even[j]);
    		   }
    	   }
       }

       /*public void display()
       {
    	   for( int i=0;i<5;i++)
    	   {
    	   System.out.println(odd[i]+"  "+even[i]);
    	   }
       }*/
    	   
       } 

