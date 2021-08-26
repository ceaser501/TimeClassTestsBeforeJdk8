package test;

import org.junit.Test;

import java.util.Calendar;

public class MonthStartZero {

    @Test
    public void 월시작0테스트() throws Exception {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2021, 0, 1);            // 2021-01-01
        calendar.set(2021, 1-1, 1);          // 2021-01-01
        calendar.set(2021, Calendar.JANUARY, 1);    // 2021-01-01
    }
}
