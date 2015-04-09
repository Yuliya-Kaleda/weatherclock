package nyc.c4q.ac21.weatherclock;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Created by JANN VIDALS.
 */
public class Weather
{

    public static void rainyClouds(AnsiTerminal terminal, int numCols, int numRows)
    {
        int yPosition = (numRows / 2) - 10;
        int xPosition = (numCols / 2) - 45;

        terminal.moveTo(yPosition + 10, xPosition + 20);
        terminal.write("    ooooooooooo");
        terminal.moveTo(yPosition + 11, xPosition+20);
        terminal.write("  ooooooooooooooo");
        terminal.moveTo(yPosition + 12, xPosition+20);
        terminal.write("ooooooooooooooooooo");
        terminal.moveTo(yPosition + 13, xPosition+ 20);
        terminal.write("");
        terminal.moveTo(yPosition + 14, xPosition+ 20);
        terminal.write("  \\    \\    \\    \\");
        terminal.moveTo(yPosition + 15, xPosition+ 20);
        terminal.write("   \\    \\    \\    \\ ");
        terminal.moveTo(yPosition + 16, xPosition+ 20);
    }

    public static void cloudDraw(AnsiTerminal terminal, int numCols, int numRows)
    {
        int yPosition = (numRows / 2) - 10;
        int xPosition = (numCols / 2) - 45;

        terminal.moveTo(yPosition + 10, xPosition + 20);
        terminal.write("      ooooooooo    ");
        terminal.moveTo(yPosition + 11, xPosition+20);
        terminal.write("   ooooooooooooooo ");
        terminal.moveTo(yPosition + 12, xPosition+20);
        terminal.write("oooooooooooooooooooooo ");
        terminal.moveTo(yPosition + 13, xPosition+ 20);
        terminal.write("  ooooooooooooooo     ");
        terminal.moveTo(yPosition + 14, xPosition+ 20);
        terminal.write("                       ");
        terminal.moveTo(yPosition + 15, xPosition+ 20);
        terminal.write("                     ");
        terminal.moveTo(yPosition + 16, xPosition+ 20);

    }

    public static void sunDraw(AnsiTerminal terminal, int numCols, int numRows)
    {
        int yPosition = (numRows / 2) - 10;
        int xPosition = (numCols / 2) - 45;

        terminal.moveTo(yPosition + 10, xPosition+ 20);
        terminal.write("   \\  + ||  + ///   ");
        terminal.moveTo(yPosition + 11, xPosition+ 20);
        terminal.write("       aaaaaaaaa        ");
        terminal.moveTo(yPosition + 12, xPosition+ 20);
        terminal.write("     aaaaaaaaaaaaaaa    ");
        terminal.moveTo(yPosition + 13, xPosition+ 20);
        terminal.write("=== aaaaaaaaaaaaaaaaa === ");
        terminal.moveTo(yPosition + 14, xPosition+ 20);
        terminal.write("     aaaaaaaaaaaaaaa ");
        terminal.moveTo(yPosition + 15, xPosition+ 20);
        terminal.write("       aaaaaaaaaaa   ");
        terminal.moveTo(yPosition + 16, xPosition+ 20);
        terminal.write("  //  +   || +    \\  ");
        terminal.moveTo(yPosition + 17, xPosition+ 20);
    }

    public static String getWeather (JSONObject obj)
    {
        JSONArray weatherArray = (JSONArray) obj.get("weather");
        JSONObject weatherObj = (JSONObject) weatherArray.get(0);

        if(weatherObj == null)
        {
            return null;
        }
        String weather = (String) weatherObj.get("description");
        if(weather == null)
        {
            return null;
        }
        return weather;
    }
    public static String getHum (JSONObject obj)
    {
        JSONObject humidityObj = (JSONObject) obj.get("main");


        if(humidityObj == null)
        {
            return null;
        }
        Long humidity = (Long) humidityObj.get("humidity");
        if(humidity == null)
        {
            return null;
        }
        return humidity.toString();

    }

    public static String getPressure (JSONObject obj)
    {
        JSONObject pressureObj = (JSONObject) obj.get("main");


        if(pressureObj == null)
        {
            return null;
        }
        Double pressure = (Double) pressureObj.get("pressure");
        if(pressure == null)
        {
            return null;
        }
        String pressureDouble = String.format("%.2f", (0.02952998751 * pressure));
        return pressureDouble;


    }

    //Get temp
    public static String getTemp (JSONObject obj)
    {
        JSONObject tempObj = (JSONObject) obj.get("main");


        if(tempObj == null)
        {
            return null;
        }
        Double temperature = (((Double) tempObj.get("temp") - 273.15)) * 1.8000 + 32;
        if(temperature == null)
        {
            return null;
        }
        String temperatureDouble = String.format("%.2f", temperature);
        return temperatureDouble;

    }

}


