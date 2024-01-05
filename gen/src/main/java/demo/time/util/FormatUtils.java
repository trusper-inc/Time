package demo.time.util;


import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class FormatUtils
{
    public static final DateTimeFormatter dtFmt =
        DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss zz");

    public static String formatTime(ZonedDateTime zdt)
    {
       return dtFmt.format(zdt);
    }
}
