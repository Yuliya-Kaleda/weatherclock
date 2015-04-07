package nyc.c4q.ac21.weatherclock;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.net.URL;
import java.util.Calendar;

/**
 * Created by July on 4/6/15.
 */
public class SunsetSunrise
{
    public static Calendar getSunset()
    {
        URL url = HTTP.stringToURL("http://api.openweathermap.org/data/2.5/weather?q=New%20York,NY");
        String doc = HTTP.get(url);
        JSONObject obj = (JSONObject) JSONValue.parse(doc);

        JSONObject sys = (JSONObject) obj.get("sys");
        if(sys == null)
            return null;
        Long sunsetTimestamp = (Long) sys.get("sunset");
        if(sunsetTimestamp == null)
            return null;
        return DateTime.fromTimestamp(sunsetTimestamp);
    }

    public static Calendar getSunrise()
    {
        URL url = HTTP.stringToURL("http://api.openweathermap.org/data/2.5/weather?q=New%20York,NY");
        String doc = HTTP.get(url);
        JSONObject obj = (JSONObject) JSONValue.parse(doc);

        JSONObject sys = (JSONObject) obj.get("sys");
        if(sys == null) return null;
        Long sunriseTimestamp = (Long) sys.get("sunrise");
        if(sunriseTimestamp == null) return null;
        return DateTime.fromTimestamp(sunriseTimestamp);
    }

    public static void printSunset(AnsiTerminal terminal)
    {
        // Get sunset time for the current day.
        Calendar sunset = getSunset();

        String sunsetTime = DateTime.formatTime( sunset, false );
        terminal.setTextColor(AnsiTerminal.Color.YELLOW, false);
        terminal.moveTo(40, 10);
        terminal.write("SUNSET   " + sunsetTime);
        terminal.moveTo(41, 10);
        terminal.write(" ");
        terminal.moveTo(42, 10);
        terminal.write("            @@@@@          ");
        terminal.moveTo(43, 10);
        terminal.write("         @@@@@@@@@@@         ");
        terminal.moveTo(44, 10);
        terminal.write("~~~~~~~@@@@@@@@@@@@@@@~~~~~~~~~~");
        terminal.moveTo(45, 10);
        terminal.write("~      ~ ~~~ ~~~ ~~ ~~     ~ ");
        terminal.moveTo(46, 10);
        terminal.write("   ~~    ~~ ~~ ~~ ~   ~~  ");
        terminal.moveTo(47, 10);
        terminal.write("   ~       ~ ~~~ ~    ~  ");

    }

    public static void printSunrise(AnsiTerminal terminal)
    {
        // Get sunrise time for the current day.
        Calendar sunrise = getSunrise();

        String sunriseTime = DateTime.formatTime(sunrise, false);
        terminal.setTextColor(AnsiTerminal.Color.YELLOW, false);
        terminal.moveTo(40, 140);
        terminal.write("    SUNRISE   " + sunriseTime);
        terminal.moveTo(41, 140);
        terminal.write("               '        ");
        terminal.moveTo(42, 140);
        terminal.write("             \\ | /     ");
        terminal.moveTo(43, 140);
        terminal.write("        '--.;;;;;;;.--'");
        terminal.moveTo(44, 140);
        terminal.write("       -===;;;;;;;;;===-");
        terminal.moveTo(45, 140);
        terminal.write("        .--';;;;;;;'--.");
        terminal.moveTo(46, 140);
        terminal.write("             / | \\ ");
        terminal.moveTo(47, 140);
        terminal.write("               '     ");

    }
}

