package test;

import org.junit.Test;

import java.sql.Timestamp;
import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TimeStampEquality {

    @Test
    public void timestamp동등성테스트() throws Exception {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());

        assertTrue(date.equals(timestamp)); // true
        assertFalse(timestamp.equals(date)); // false

        System.out.println("=========================");
        System.out.println("[1] 동일한가? : " + date.equals(timestamp));
        System.out.println("[2] 동일한가? : " + timestamp.equals(date));
        System.out.println("=========================");
    }
}
