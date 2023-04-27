package jp.co.aforce.sample;
import java.util.Calendar;
import java.util.Date;

public class SampleDate {
	public static void main(String args[]) {
		/*Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(2001, 8, 26);
		Date birthday = calendar.getTime();
		System.out.println(birthday);*/
		
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		System.out.println(today);
		calendar.set(2001, 8 ,26);
		Date birthday = calendar.getTime();
		System.out.println(birthday);
		
		calendar.clear();
		calendar.set(2020, 0, 2, 10, 20, 30);
		Date date = calendar.getTime();
		System.out.println(date);
		int year = calendar.get(calendar.YEAR);
		System.out.println(calendar.get(calendar.YEAR));
		
		calendar.add(calendar.HOUR_OF_DAY,-5);
		System.out.println(calendar.getTime());
		
		
	
		/*Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		Date today = calendar.getTime();
		System.out.println(today);*/
		
		
		/*Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(2001, 9, 26, 11, 33, 50);
		int hour0fDay = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour0fDay);
		int day0fWeek = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(day0fWeek);
		System.out.println(calendar.get(Calendar.YEAR));*/
		
		
		/*Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(1984, 11, 26, 11, 33, 50);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.SECOND, 00);
		System.out.println(calendar.getTime());*/
		
		
		/*Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH,3);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.MONTH,-6);
		System.out.println(calendar.getTime());*/
		
		
		/*Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println("日本の時間は" + calendar.get(Calendar.HOUR_OF_DAY) + "時です");
		calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		System.out.println(calendar.getTime());
		System.out.println("ロサンゼルスの時間は" + calendar.get(Calendar.HOUR_OF_DAY) + "時です");*/
		
		
		/*Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MMMM/dd(EEEE) HH:mm:ss", new Locale("en","US"));
		String formattedDate = format.format(calendar.getTime());
		System.out.println(formattedDate);*/
		
		
		
	}
}
