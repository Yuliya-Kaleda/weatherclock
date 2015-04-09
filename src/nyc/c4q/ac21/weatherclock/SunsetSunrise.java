package nyc.c4q.ac21.weatherclock;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.net.URL;
import java.util.Calendar;

/**
 * Created by YULIYA KALEDA on 4/6/15.
 * print sunset and sunrise time using JSON online data
 */
public class SunsetSunrise
{

    public static Calendar getSunset()
    {
        //get a JSON Object
        URL url = HTTP.stringToURL("http://api.openweathermap.org/data/2.5/weather?q=New%20York");
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
        //get a JSON Object
        URL url = HTTP.stringToURL("http://api.openweathermap.org/data/2.5/weather?q=New%20York");
        String doc = HTTP.get(url);
        JSONObject obj = (JSONObject) JSONValue.parse(doc);

        JSONObject sys = (JSONObject) obj.get("sys");
        if(sys == null) return null;
        Long sunriseTimestamp = (Long) sys.get("sunrise");
        if(sunriseTimestamp == null) return null;
        return DateTime.fromTimestamp(sunriseTimestamp);
    }

    public static void printSunset(Calendar sunset, AnsiTerminal terminal, int numCols, int numRows)
    {

        String sunsetTime = DateTime.formatTime( sunset, false );
        terminal.setTextColor(AnsiTerminal.Color.YELLOW, false);
        terminal.moveTo(numRows-78, numCols-150);
        terminal.write("         SUNSET   " + sunsetTime);
        terminal.moveTo(numRows-79, numCols-150);
        terminal.write(" ");
        terminal.moveTo(numRows-80, numCols-150);
        terminal.write("            @@@@@          ");
        terminal.moveTo(numRows-81, numCols-150);
        terminal.write("         @@@@@@@@@@@         ");
        terminal.moveTo(numRows-82, numCols-150);
        terminal.write("~~~~~~~@@@@@@@@@@@@@@@~~~~~~~~~~");
        terminal.moveTo(numRows-83, numCols-150);
        terminal.write("~      ~ ~~~ ~~~ ~~ ~~     ~ ");
        terminal.moveTo(numRows-84, numCols-150);
        terminal.write("   ~~    ~~ ~~ ~~ ~   ~~  ");
        terminal.moveTo(numRows-85, numCols-150);
        terminal.write("   ~       ~ ~~~ ~    ~  ");

    }


    public static void printSunrise(Calendar sunrise, AnsiTerminal terminal, int numCols, int numRows)
    {

        String sunriseTime = DateTime.formatTime(sunrise, false);
        terminal.setTextColor(AnsiTerminal.Color.YELLOW, false);
        terminal.moveTo(numRows-78, numCols-40);
        terminal.write("      SUNRISE   " + sunriseTime);
        terminal.moveTo(numRows-79, numCols-40);
        terminal.write("               '        ");
        terminal.moveTo(numRows-80, numCols-40);
        terminal.write("             \\ | /     ");
        terminal.moveTo(numRows-81, numCols-40);
        terminal.write("        '--.;;;;;;;.--'");
        terminal.moveTo(numRows-82, numCols-40);
        terminal.write("       -===;;;;;;;;;===-");
        terminal.moveTo(numRows-83, numCols-40);
        terminal.write("        .--';;;;;;;'--.");
        terminal.moveTo(numRows-84, numCols-40);
        terminal.write("             / | \\ ");
        terminal.moveTo(numRows-85, numCols-40);
        terminal.write("               '     ");
    }
}

