package nyc.c4q.ac21.weatherclock;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    /**
     * SAMPLE CODE: Displays a very primitive clock.
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a 12 or 24-hour format clock, please: ");
        String user = in.nextLine();

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
        terminal.setBackgroundColor(AnsiTerminal.Color.BLACK);
        terminal.clear();
        // Don't show the cursor.
        terminal.hideCursor();

        while(true)
        {
            // Get the current date and time.
            Calendar cal = Calendar.getInstance();


            //Write Sunset
            SunsetSunrise.printSunset(terminal);

            //Write Sunrise
            SunsetSunrise.printSunrise(terminal);

            //Write quotes
            File f = new File("/Users/July/Desktop/accesscode/weatherclock/src/nyc/c4q/ac21/weatherclock/Quotes");
            Scanner scanner = new Scanner(f);
            HashMap<Integer, String> quotes = new HashMap<Integer, String>();
            String quote = "";
            while(scanner.hasNextLine()) {
                quote += scanner.nextLine();
                String[] quotesArray = quote.split("!");
                for (int i = 0; i<quotesArray.length; i++)
                quotes.put(i,quotesArray[i]);
            }

            Random rand = new Random();
            int n = rand.nextInt(3);
            terminal.moveTo(10, 50);
            terminal.setTextColor(AnsiTerminal.Color.MAGENTA);
            terminal.write(quotes.get(n) + "!");


            //Write time

           ClockPrinting.clockPrinting(user, cal, terminal, numCols, numRows);
           // terminal.clear();

            //for (int k = 0; k<10; k++)
            //SecondsPrinting.secondPrinting(cal, terminal);


            terminal.clear();
            //DateTime.pause(3.);



            // Write the date in gray.
            //            String date = DateTime.formatDate(cal);
            //            terminal.setTextColor(AnsiTerminal.Color.WHITE, false);
            //            terminal.moveTo(5, xPosition);
            //            terminal.write(date);
            //
            //            // Write the day of the week in green on a blue background.
            //            String dayOfWeek = DateTime.getDayOfWeekNames().get(cal.get(Calendar.DAY_OF_WEEK));
            //            terminal.setTextColor(AnsiTerminal.Color.GREEN);
            //            terminal.setBackgroundColor(AnsiTerminal.Color.BLUE);
            //            terminal.moveTo(7, xPosition);
            //            terminal.write("  " + dayOfWeek + "  ");
            //
            //            // Set the background color back to black.
            //            terminal.setBackgroundColor(AnsiTerminal.Color.BLACK);
            //
            //            // Write sunset time in dark yellow.
            //            String sunsetTime = DateTime.formatTime(sunset, false);
            //            terminal.setTextColor(AnsiTerminal.Color.YELLOW, false);
            //            terminal.moveTo(9, xPosition - 2);
            //            terminal.write("sunset at " + sunsetTime);

            // Pause for one second, and do it again.
            //DateTime.pause(1.0);
        }
    }
}

