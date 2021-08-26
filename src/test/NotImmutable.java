package test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class NotImmutable {

    @Test
    public void 불변테스트() throws Exception {
        //given
        Calendar calendar = Calendar.getInstance();

        //when
        calendar.set(Calendar.MONTH, Calendar.JANUARY);     //[1]
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);    //[2]

        //then
        System.out.println("Calendar.MONTH == FEBRUARY ? : " + calendar.get(Calendar.MONTH));
        Assert.assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
    }
}
