package test;


import org.junit.Test;


import java.util.Calendar;
import java.util.Date;

public class DifferentDayOfWeek {

    @Test
    public void 일관성없는요일상수() throws Exception {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, Calendar.AUGUST, 1);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("[1] dayOfWeek : " + dayOfWeek);
//        assertEquals(dayOfWeek, is(Calendar.SUNDAY));
//        assertEquals(dayOfWeek, is(1));

        Date theDate = calendar.getTime();
//        assertEquals(theDate.getDay(), is(0));
        System.out.println("[2] dayOfWeek : " + theDate.getDay());
    }
}
