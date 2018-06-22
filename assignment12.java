package assignment12;
import java.util.*;
public class assignment12 {
	
	public  <t extends Comparable<t>> void  sort(t []s)
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])<0)
				{
					t temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println(" REQUIRED ::::: ");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
	public static void main(String[] args) {
		
assignment12 as=new assignment12();
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
as.sort(countries);
as.sort(number);

	}

}
