package test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class StaticInt {

    @Test
    public void INT상수필드테스트() throws Exception {
        //given
        Calendar calendar = Calendar.getInstance();

        //when
        calendar.set(2021, Calendar.FEBRUARY, Calendar.SUNDAY);
        System.out.println("[1] value of month ? : " + Calendar.FEBRUARY);
        System.out.println("[1] value of day ? : " + Calendar.SUNDAY);

        calendar.set(2021, Calendar.SUNDAY, Calendar.FEBRUARY);
        System.out.println("[2] value of month ? : " + Calendar.SUNDAY);
        System.out.println("[2] value of day ? : " + Calendar.FEBRUARY);

        //then
    }


    @Test
    public void 상수선택테스트() throws Exception {
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            int plus = 1;       // 월 + plus 될 숫자

            calendar.setTime(date);

            calendar.add(Calendar.MONTH, plus);
            System.out.println("[1] 현재 월에서 +1 됐을까요? : " + calendar.getTime());

            calendar.add(Calendar.WEEK_OF_MONTH, plus);
            System.out.println("[2] 현재 월에서 +1 됐을까요? : " + calendar.getTime());

            calendar.add(Calendar.DAY_OF_MONTH, plus);
            System.out.println("[3] 현재 월에서 +1 됐을까요? : " + calendar.getTime());

            calendar.add(Calendar.DAY_OF_WEEK_IN_MONTH, plus);
            System.out.println("[4] 현재 월에서 +1 됐을까요? : " + calendar.getTime());
    }
}
