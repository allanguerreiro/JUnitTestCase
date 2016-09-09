package br.junit.commons;

import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by allan on 09/09/16.
 */
public class DateUtilTest {
    private DateUtil dateUtil;

    @Before
    public void init() {
        dateUtil = new DateUtil();
    }

    @Test
    public void testDateIsNull() {
        assertFalse(dateUtil.isThisDateValid(null, "dd/MM/yyyy"));
    }

    @Test
    public void testDayIsInvalid() {
        assertFalse(dateUtil.isThisDateValid("32/02/2012", "dd/MM/yyyy"));
    }

    @Test
    public void testMonthIsInvalid() {
        assertFalse(dateUtil.isThisDateValid("31/20/2012", "dd/MM/yyyy"));
    }

    @Test
    public void testYearIsInvalid() {
        assertFalse(dateUtil.isThisDateValid("31/20/19991", "dd/MM/yyyy"));
    }

    @Test
    public void testDateFormatIsInvalid() {
        assertFalse(dateUtil.isThisDateValid("2012/02/20", "dd/MM/yyyy"));
    }

    @Test
    public void testDateFeb29_2012() {
        assertTrue(dateUtil.isThisDateValid("29/02/2012", "dd/MM/yyyy"));
    }

    @Test
    public void testDateFeb29_2011() {
        assertFalse(dateUtil.isThisDateValid("29/02/2011", "dd/MM/yyyy"));
    }

    @Test
    public void testDateFeb28() {
        assertTrue(dateUtil.isThisDateValid("28/02/2011", "dd/MM/yyyy"));
    }

    @Test
    public void testDateIsValid_1() {
        assertTrue(dateUtil.isThisDateValid("31/01/2012", "dd/MM/yyyy"));
    }

    @Test
    public void testDateIsValid_2() {
        assertTrue(dateUtil.isThisDateValid("30/04/2012", "dd/MM/yyyy"));
    }

    @Test
    public void testDateIsValid_3() {
        assertTrue(dateUtil.isThisDateValid("31/05/2012", "dd/MM/yyyy"));
    }

    @Test
    public void shouldStartDateIsGreaterThanEndDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date startDate, endDate;
        startDate = new Date();
        endDate = new Date();
        try {
            startDate = sdf.parse("27/02/2012");
            endDate = sdf.parse("28/02/2013");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assertTrue(dateUtil.isDateBetween(startDate, endDate));
    }

}