package br.junit.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by allan on 09/09/16.
 */
public class DateUtil {

    public boolean isThisDateValid(String dateToValidate, String dateFromat) {

        if (dateToValidate == null) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
        sdf.setLenient(false);

        try {
            //if not valid, it will throw ParseException
            Date date = sdf.parse(dateToValidate);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * This is an inclusive method: returns true if the date is equal to startDate or endDate.
     *
     * @param startDate The start date.
     * @param endDate   The end date.
     * @return true if the date falls between start date and end date.
     */
    public boolean isDateBetween(final Date startDate,
                                        final Date endDate) {
        // check if end date is later than start date:
        if (startDate.compareTo(endDate) > 0) {
            throw new IllegalArgumentException("Start date cannot be greater than end date!");
        }
        if (startDate.compareTo(endDate) < 0) {
            return true;
        }
        return false;
    }
}
