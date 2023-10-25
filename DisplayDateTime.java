//Write a Java program to display the current date and time in a specific format.

import java.util.*;
import java.text.SimpleDateFormat;

public class DisplayDateTime {
    public static void main(String arg[]){
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));
    };
};
