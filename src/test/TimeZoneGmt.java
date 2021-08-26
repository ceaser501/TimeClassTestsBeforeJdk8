package test;

import org.junit.Test;

import java.util.TimeZone;

import static org.junit.Assert.assertEquals;

public class TimeZoneGmt {

    @Test
    public void 타임존에러테스트() throws Exception {
        TimeZone zone = TimeZone.getTimeZone("Seoul/Asia");
        assertEquals(zone.getID(), "GMT");
    }
}
