package assignment12;
import java.util.*;

class game 
{
	int age;
	String name;
	public game(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	//as  we know system.out.println has a string class  argument 
	//so have a inbuilt function toString so we override  it;
	public String toString()
	{
		return this.age+" "+this.name;
	}
}
	//we have inbuilt function of collections class as
	//public void sort(List list, comparatorclass c);
	class sortage implements Comparator <game>
	{
		public int compare(game a,game b)
		{
		return a.age-b.age;
	      }
	}
	class sortname implements Comparator <game>
	{
		public int compare(game a,game b)
		{
		return a.name.compareTo(b.name);//string comapre function comapreTo
	      }
	}
	


public class map
{
	public static void main(String []args)
	{
		ArrayList<game> g=new ArrayList<game>();
		g.add(new game(12,"rohan"));
		g.add(new game(14,"shivank"));
		g.add(new game(20,"reema"));
		g.add(new game(78,"ramkishan"));
		System.out.println("PRINTING THE UNSORTED ORDER  ");
		for(game w:g)
			System.out.println(w);
		System.out.println("PRINTING THE SORTED ORDER USIND AGE  ");
		Collections.sort(g, new sortage());
		
		for(game x:g)
			System.out.println(x);
		Collections.sort(g, new sortname());
		System.out.println("PRINTING THE SORTED ORDER USIND NAME  ");
		for(game y:g)
			System.out.println(y);
	}
}
