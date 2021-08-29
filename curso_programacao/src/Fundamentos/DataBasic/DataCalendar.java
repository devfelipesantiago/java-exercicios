package Fundamentos.DataBasic;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataCalendar {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2021-08-29T14:30:00Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        int minute = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);

        System.out.println(sdf.format(d));
        System.out.println(minute);
        System.out.println(month);
    }
}
