package new1;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample_01 {

	public static void main(String[] args) 
	{
		//My program
		int Age;
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> queue=new ArrayList<Integer>();
		ArrayList<Integer> queue1=new ArrayList<Integer>();
		ArrayList<Integer> queue2=new ArrayList<Integer>();
		
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Entwr the input");
			Age=scan.nextInt();
			
			if(Age>=10 && Age<=100)
			{
				queue.add(Age);
					
			}	
			else
			{
				System.out.println("Invalid Input Please enter the valid age betwwe 10 to 100 only");
				i--;
			}
						
		}
		
		
		
		System.out.println("Entries are full");
		
		
		 System.out.println("Total Entries are :"+queue.size());
		
		
		
		
		
		for(int j=0;j<10;j++)
		{
			int c=queue.get(j);
		 if(c>=10 && c<=60)	
		 {
			 queue1.add(c);
		 } 
		 else
		 {
			 queue2.add(c);
		 }
			
			
		}
		
		
		
		System.out.println("QUEUE-1 Time:"+(queue1.size()*15)+" mins");
		System.out.println("QUEUE-2 Time:"+(queue2.size()*15)+" mins");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
