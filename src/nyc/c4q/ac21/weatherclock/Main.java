package nyc.c4q.ac21.weatherclock;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;


public class Main
{

    public static void main(String[] args) throws FileNotFoundException
    {

        /**
         *
         * Created by Yuliya Kaleda
         * Clock
         */

        //prompt user to choose a 12 or 24-hour format to display a clock
        Scanner in = new Scanner(System.in);
        System.out.println("Type in 12 or 24 to choose clock format: ");
        String user = in.nextLine();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the format of temperature: F or C");
        String userTemp = scanner.nextLine();


        // Find out the size of the terminal currently.
        final int numCols = TerminalSize.getNumColumns();
        final int numRows = TerminalSize.getNumLines();

        // Create the terminal.
        final AnsiTerminal terminal = new AnsiTerminal();

        // When the program shuts down, reset the terminal to its original state.
        // This code makes sure the terminal is reset even if you kill your
        // program by pressing Control-C.
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            public void run()
            {
                terminal.showCursor();
                terminal.reset();
                terminal.scroll(1);
                terminal.moveTo(numRows, 0);
            }
        });

        // Clear the screen to black.
        terminal.setBackgroundColor(000);
        terminal.clear();

        // Don't show the cursor.
        terminal.hideCursor();

        while(true)
        {
            // Get the current date and time.
            Calendar cal = Calendar.getInstance();

            //Write sunset time
            SunsetSunrise.printSunset(terminal, numCols, numRows);

            //Write sunrise time
            SunsetSunrise.printSunrise(terminal, numCols, numRows);

            //Write quote
            Quote.writeQuote(terminal);


            //position text printing
            terminal.moveTo(43, 50);
            terminal.setTextColor(AnsiTerminal.Color.RED, true);
            terminal.write("LIVE THE LAST SECONDS OF THE MINUTE TO THE FULLEST!!!");

            //Write time
            int numCycles = 4;
            ClockPrinting.clockPrinting(user, terminal, numCols, numRows, numCycles);

            //reset terminal to black clean display
            terminal.clear();

            /**
             *
             * Created by ELVIS BOVES
             */

            //print DST
            int xPosition = 1 + numCols / 2 - 5;

            String dst = DST.dst("");
            terminal.setTextColor(AnsiTerminal.Color.BLUE, false);
            terminal.moveTo(19, xPosition);
            terminal.write(dst);

            //print calendar
            CalendarDone.printMonthCalendar(cal, terminal, 35, 100);

            // print work day
            HashMap<Integer, String> workDays = DateTime.getDayOfWeekNames();
            terminal.setTextColor(AnsiTerminal.Color.RED, false);
            terminal.moveTo(21, xPosition - 1);
            terminal.write("Work Day: " + workDays.get(cal.get(Calendar.DAY_OF_WEEK)));

            // print Holidays
            HashMap<Calendar, String> holidays = Holidays.getHolidays("National holiday");
            terminal.setTextColor(AnsiTerminal.Color.YELLOW);
            terminal.moveTo(23, xPosition - 3);
            terminal.write("National Holiday: " + holidays.get(cal));

            //print the days of the week
            WeekDays.daysPrinting(cal, terminal, numCols, numRows);

            //print C4Q
            C4QCode.c4qCode(terminal,numCols,numRows);

            //print C4Q Calendar
            C4QCode.c4qCalendar(terminal,numCols, numRows);

            DateTime.pause(5.0);
            terminal.clear();


            // created by JANN VIDALS

            // Make request for weather data
            URL url = HTTP.stringToURL("http://api.openweathermap.org/data/2.5/weather?q=New%20York");
            String doc = HTTP.get(url);
            JSONObject obj = (JSONObject) JSONValue.parse(doc);

            //Print bigLetters
            Bigletters.bigLetters(terminal,numCols,numRows);

            // write weather
            String weather = Weather.getWeather(obj);
            terminal.setTextColor(AnsiTerminal.Color.MAGENTA, false);
            terminal.moveTo(18, xPosition + 4);
            terminal.write(" Weather status: " + weather);

            if(weather.contains("rain"))
            {
                Weather.rainyClouds(terminal, numCols, numRows);
            }
            else if(weather.contains("sky") || weather.contains("sun"))
            {
                Weather.sunDraw(terminal, numCols, numRows);
            }

            else if(weather.contains("clouds"))
            {
                Weather.cloudDraw(terminal, numCols, numRows);
            }

            //Write humidity Magenta.JV
            String humidity = Weather.getHum(obj);
            terminal.setTextColor(AnsiTerminal.Color.MAGENTA, false);
            terminal.moveTo(9, xPosition + 4);
            terminal.write(" Humidity: " + humidity);

            //Write pressure in Green.JV
            String pressure = Weather.getPressure(obj);
            terminal.setTextColor(AnsiTerminal.Color.CYAN, false);
            terminal.moveTo(12, xPosition + 4);
            terminal.write(" Pressure: " + pressure);

            //Write temperature in Blue.JV
            String temperature = Weather.getTemp(obj);
            terminal.setTextColor(AnsiTerminal.Color.WHITE, false);
            terminal.moveTo(15, xPosition + 4);
            if(userTemp.equalsIgnoreCase("C"))
            {
                double Celcius = (Double.valueOf(temperature) - 32) * 5 / 9;
                temperature = String.format("%.2f", Celcius);
                temperature += " C ";
                terminal.write(" Temperature: " + temperature);
            }
            else
            {
                terminal.write(" Temperature: " + temperature + " F");
            }


            DateTime.pause(5.0);
            terminal.clear();
            //DateTime.pause(1.0);
        }
    }
}

