package assignment12;

import java.util.Scanner;

public class printgeneric {

	
		public  <t extends Comparable<t>> void  print(t []s)
		{
	System.out.println(" REQUIRED   ARRAY::::: ");
			for(int i=0;i<s.length;i++)
				System.out.println(s[i]);
		}
		public static void main(String[] args) {
			
	printgeneric as=new printgeneric();
	Scanner sc=new Scanner(System.in);
	System.out.print("ENTER THE SIZE OF THE ARRAY REQUIRED FOR STRING TYPE ::::: ");
	int size=sc.nextInt();
	System.out.println();
	System.out.print("ENTER THE SIZE OF THE ARRAY REQUIRED FOR INTEGER TYPE ::::: ");
	int sizes=sc.nextInt();
	String countries[]=new String[size] ;
	Integer number[]=new Integer[sizes] ;
	System.out.println("ENTER THE VALUES OF THE ARRAY REQUIRED FOR STRING TYPE ::::: ");
	for(int i=0;i<size;i++)
	{
		countries[i]=sc.next();
	}
	System.out.println("ENTER THE VALUES OF THE ARRAY REQUIRED FOR INTEGER TYPE ::::: ");
	for(int i=0;i<sizes;i++)
	{
		number[i]=sc.nextInt();
	}
	as.print(countries);
	as.print(number);

		}

	}

	


