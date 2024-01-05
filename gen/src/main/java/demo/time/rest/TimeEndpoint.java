package demo.time.rest;

import demo.time.util.FormatUtils;

import java.time.ZonedDateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/time")
public class TimeEndpoint
{
    @GET
    public String getTime() {
        ZonedDateTime now = ZonedDateTime.now();
        String nowStr = FormatUtils.formatTime(now) + '\n';

        return nowStr;
    }
}
