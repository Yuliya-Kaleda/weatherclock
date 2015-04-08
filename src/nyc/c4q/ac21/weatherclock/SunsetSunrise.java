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

    public static void printSunset(AnsiTerminal terminal, int numCols, int numRows)
    {
        // Get sunset time for the current day.
        Calendar sunset = getSunset();

        int xPosition = numCols;
        int yPosition = numRows;


        String sunsetTime = DateTime.formatTime( sunset, false );
        terminal.setTextColor(AnsiTerminal.Color.YELLOW, false);
        terminal.moveTo(yPosition-78, xPosition-150);
        terminal.write("         SUNSET   " + sunsetTime);
        terminal.moveTo(yPosition-79, xPosition-150);
        terminal.write(" ");
        terminal.moveTo(yPosition-80, xPosition-150);
        terminal.write("            @@@@@          ");
        terminal.moveTo(yPosition-81, xPosition-150);
        terminal.write("         @@@@@@@@@@@         ");
        terminal.moveTo(yPosition-82, xPosition-150);
        terminal.write("~~~~~~~@@@@@@@@@@@@@@@~~~~~~~~~~");
        terminal.moveTo(yPosition-83, xPosition-150);
        terminal.write("~      ~ ~~~ ~~~ ~~ ~~     ~ ");
        terminal.moveTo(yPosition-84, xPosition-150);
        terminal.write("   ~~    ~~ ~~ ~~ ~   ~~  ");
        terminal.moveTo(yPosition-85, xPosition-150);
        terminal.write("   ~       ~ ~~~ ~    ~  ");

    }

    public static void printSunrise(AnsiTerminal terminal, int numCols, int numRows)
    {
        // Get sunrise time for the current day.
        Calendar sunrise = getSunrise();

        int xPosition = numCols;
        int yPosition = numRows;

        String sunriseTime = DateTime.formatTime(sunrise, false);
        terminal.setTextColor(AnsiTerminal.Color.YELLOW, false);
        terminal.moveTo(yPosition-78, xPosition-40);
        terminal.write("      SUNRISE   " + sunriseTime);
        terminal.moveTo(yPosition-79, xPosition-40);
        terminal.write("               '        ");
        terminal.moveTo(yPosition-80, xPosition-40);
        terminal.write("             \\ | /     ");
        terminal.moveTo(yPosition-81, xPosition-40);
        terminal.write("        '--.;;;;;;;.--'");
        terminal.moveTo(yPosition-82, xPosition-40);
        terminal.write("       -===;;;;;;;;;===-");
        terminal.moveTo(yPosition-83, xPosition-40);
        terminal.write("        .--';;;;;;;'--.");
        terminal.moveTo(yPosition-84, xPosition-40);
        terminal.write("             / | \\ ");
        terminal.moveTo(yPosition-85, xPosition-40);
        terminal.write("               '     ");
    }
}

