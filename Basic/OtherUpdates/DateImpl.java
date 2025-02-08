package Java8.Basic.OtherUpdates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateImpl{
public static void main(String[] args) throws ParseException {
	 Date d = new Date();
	 System.out.println(d);
	 
	 //Convert Date to String
	 SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
	 String format = sdf.format(d);
	 System.out.println(format);
	 
	 SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mmm/yy");
	 String format2 = sdf2.format(d);
	 System.out.println(format2);
	 
	 //Convert String to date
	 
	 SimpleDateFormat sdf3 = new SimpleDateFormat("dd/mm/yy");
	 Date parsedate = sdf3.parse("20/2/2024");
	 System.out.println(parsedate);
}
}
