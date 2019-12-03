package lab5.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	private static long MILIS_IN_A_DAY = 86400000;
	public static double yearsBetween(Date recent, Date then) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(recent);
		cal.setTime(then);
		long now = cal.getTimeInMillis();
		long rejestr = cal2.getTimeInMillis();
		long diff = now - rejestr;
		return diff/MILIS_IN_A_DAY;
	}
}
