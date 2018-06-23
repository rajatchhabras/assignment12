package assignment12;
import java.util.*;
import java.io.IOException;
import java.text.*;
public class date {

	public static void main(String[] args) throws IOException, ParseException {
		public static void main(String[] args) throws IOException, ParseException {
		Scanner sc=new Scanner(System.in);
		String d=sc.nextLine();
		Date ddd=new Date(d);
		DateFormat df6 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
		String sr=df6.format(ddd);
		System.out.println(sr);

	}

}
