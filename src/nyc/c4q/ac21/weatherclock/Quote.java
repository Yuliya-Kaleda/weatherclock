package nyc.c4q.ac21.weatherclock;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by YULIYA KALEDA on 4/7/15.
 */
public class Quote
{
    public static void writeQuote(AnsiTerminal terminal, int n) throws FileNotFoundException
    {
        File f = new File("./src/nyc/c4q/ac21/weatherclock/Quotes");
        Scanner scanner = new Scanner(f);

        // key - integer from 0 to number of quotes, value - quote
        HashMap<Integer, String> quotes = new HashMap<Integer, String>();

        String quote = "";
        while(scanner.hasNextLine())
        {
            quote += scanner.nextLine();

            //split a string file by "!" into separate quotes
            String[] quotesArray = quote.split("!");

            //populate HashMap
            for(int i = 0; i < quotesArray.length; i++)
                quotes.put(i, quotesArray[i]);
        }

        //set the position to print quote
        terminal.moveTo(4, 45);
        terminal.setTextColor(AnsiTerminal.Color.WHITE);
        terminal.write(quotes.get(n) + "!                                                    ");


    }
}