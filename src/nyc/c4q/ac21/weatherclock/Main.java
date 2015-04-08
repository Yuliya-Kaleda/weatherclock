package nyc.c4q.ac21.weatherclock;


import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws FileNotFoundException
    {
        //prompt user to choose a 12 or 24-hour format to display a clock
        Scanner in = new Scanner(System.in);
        System.out.println("Type in 12 or 24 to choose clock format: ");
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

            //Write sunset time
            SunsetSunrise.printSunset(terminal, numCols, numRows );

            //Write sunrise time
            SunsetSunrise.printSunrise(terminal, numCols, numRows );

            //Write quote
            Quote.writeQuote(terminal);

            //Write time
           ClockPrinting.clockPrinting(user, cal, terminal, numCols, numRows);

            //reset terminal to black clean display
            terminal.clear();

            // Pause for one second, and do it again.
            DateTime.pause(1.0);
        }
    }
}

