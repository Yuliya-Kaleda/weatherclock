package nyc.c4q.ac21.weatherclock;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Random;

/**
 * Created by July on 4/5/15.
 */
public class ClockPrinting
{
    public static void clockPrinting(String user, Calendar cal, AnsiTerminal terminal, int numCols, int numRows) throws FileNotFoundException
    {
        String time, coverLetters;

        // 12-hour format
        if(user.equalsIgnoreCase("12"))
        {
            time = DateTime.formatTime(cal, false);
            if(cal.get(Calendar.HOUR_OF_DAY) >= 12) time += " PM";
            else time += " AM";
        }
        //24-hour format

        else
        {
            time = DateTime.formatTimeH(cal);
        }

        //print empty line to cover certain time numbers to create the effect of their appearing one by one
        coverLetters = "                                                                    ";


        //position time numbers
        int yPosition = (numRows / 2) - 10;
        int xPosition = (numCols / 2) - 45;

        //keep track of how many times clock numbers appear
        int count = 0;

        //choose random text colors for time integers
        Random random = new Random();
        int n = random.nextInt(255);
        terminal.setTextColor(n);

        //print each digit of the time
        for(int i = 0; i <= time.length(); i++)
        {
            //update the time every time while printing time integers
            cal = Calendar.getInstance();

            //get seconds to countdown
            int second = 60 - cal.get(Calendar.SECOND);
            String seconds = "" + second;

            //position seconds printing
            //terminal.moveTo(25, 60);
            //terminal.write(seconds+"      ");

            SecondsPrinting.secondPrinting(seconds, terminal);

            //position text printing
            terminal.moveTo(45, 50);
            terminal.setTextColor(160);
            terminal.write("LIVE THE LAST SECONDS OF THE MINUTE TO THE FULLEST!!!");

            // change a quote every minute
            if (seconds.equalsIgnoreCase("60")) {
                Quote.writeQuote(terminal);
            }


            // time numbers will move for only 10 cycles
            if(count != 50)
            {
                //when all integers are printed, print empty line to cover them and continue printing integers again
                if(i == time.length())
                {
                    i = - 1;

                    //set the cursor at the initial position
                    yPosition = (numRows / 2) - 10;
                    xPosition = (numCols / 2) - 45;

                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write(coverLetters+"                                               ");
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write(coverLetters+"                                               ");
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write(coverLetters+"                                               ");
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write(coverLetters+"                                               ");
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write(coverLetters+"                                               ");
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write(coverLetters+"                                               ");
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write(coverLetters+"                                               ");

                    DateTime.pause(1.0);
                    count++;

                    n = random.nextInt(255);
                    terminal.setTextColor(n);
                    continue;
                }

                //set random text color
                terminal.setTextColor(n);

                if(time.charAt(i) == '1')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("      __         " + coverLetters);
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write("  __ (__)        " + coverLetters);
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write(" (__)(__)        " + coverLetters);
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("     (__)        " + coverLetters);
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("     (__)        " + coverLetters);
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("  __ (__) __      " + coverLetters);
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write(" (__)(__)(__)     " + coverLetters);
                    DateTime.pause(0.4);
                }
                else if(time.charAt(i) == '2')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("    __  __       " + coverLetters);
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write(" __(__)(__)__    " + coverLetters);
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("(__)   __ (__)   " + coverLetters);
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("    __(__)       " + coverLetters);
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write(" __(__)          " + coverLetters);
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("(__)  __   __    " + coverLetters);
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("(__) (__) (__)   " + coverLetters);
                    DateTime.pause(0.4);
                }
                else if(time.charAt(i) == '3')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("    __  __       "+ coverLetters);
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write(" __(__)(__)__    "+ coverLetters);
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("(__)   __ (__)   "+ coverLetters);
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("      (__)__     "+ coverLetters);
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("         (__)__  "+ coverLetters);
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write(" __  __  __ (__) "+ coverLetters);
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("(__)(__)(__)(__) "+ coverLetters);
                    DateTime.pause(0.4);
                }
                else if(time.charAt(i) == '4')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("         __      "+ coverLetters);
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write("     __ (__)     "+ coverLetters);
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write(" __ (__)(__)     "+ coverLetters);
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("(__) __ (__) __  "+ coverLetters);
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("(__)(__)(__)(__) "+ coverLetters);
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("        (__)     "+ coverLetters);
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("        (__)     "+ coverLetters);
                    DateTime.pause(0.4);
                }

                else if(time.charAt(i) == '5')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write(" __  __  __      "+ coverLetters);
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write("(__)(__)(__)     "+ coverLetters);
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("(__) __  __      "+ coverLetters);
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("(__)(__)(__)     "+ coverLetters);
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("        (__)     "+ coverLetters);
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write(" __  __ (__)     "+ coverLetters);
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("(__)(__)         "+ coverLetters);
                    DateTime.pause(0.4);
                }

                else if(time.charAt(i) == '6')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("     __  __  __  "+ coverLetters);
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write(" __ (__)(__)(__) "+ coverLetters);
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("(__) __  __      "+ coverLetters);
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("(__)(__)(__) __  "+ coverLetters);
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("(__)        (__) "+ coverLetters);
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("(__) __  __ (__) "+ coverLetters);
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("(__)(__)(__)(__) "+ coverLetters);
                    DateTime.pause(0.4);
                }

                else if(time.charAt(i) == '7')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write(" __   __  __  __ "+ coverLetters);
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write("(__) (__)(__)(__)"+ coverLetters);
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("           __(__)"+ coverLetters);
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("       __ (__)   "+ coverLetters);
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("    __(__)        "+ coverLetters);
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write(" __(__)           "+ coverLetters);
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("(__)              "+ coverLetters);
                    DateTime.pause(0.4);
                }

                else if(time.charAt(i) == '8')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("    __  __  __    "+ coverLetters);
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write(" __(__)(__)(__)__ "+ coverLetters);
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("(__) __    __ (__)"+ coverLetters);
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write(" __ (__)  (__) __ "+ coverLetters);
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("(__)          (__)"+ coverLetters);
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("(__)__  __  __(__)"+ coverLetters);
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("   (__)(__)(__)   "+ coverLetters);
                    DateTime.pause(0.4);
                }
                else if(time.charAt(i) == '9')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("     __  __  __   " + coverLetters);
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write(" __ (__)(__)(__)  " + coverLetters);
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("(__) __  __ (__)  " + coverLetters);
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("(__)(__)(__)(__)  " + coverLetters);
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("          __(__)  " + coverLetters);
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("      __ (__)     " + coverLetters);
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("     (__)         " + coverLetters);
                    DateTime.pause(0.4);

                }
                else if(time.charAt(i) == '0')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("     __  __       "+ coverLetters);
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write(" __ (__)(__) __   "+ coverLetters);
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("(__)        (__)  "+ coverLetters);
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("(__)        (__)  "+ coverLetters);
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("(__)        (__)  "+ coverLetters);
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("(__) __  __ (__)  "+ coverLetters);
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("    (__)(__)      "+ coverLetters);
                    DateTime.pause(0.4);

                }
                else if(time.charAt(i) == ':')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("       __ "+ coverLetters);
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write("      (__)"+ coverLetters);
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("      (__)"+ coverLetters);
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("          "+ coverLetters);
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("       __ "+ coverLetters);
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("      (__)"+ coverLetters);
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("      (__)"+ coverLetters);
                    DateTime.pause(0.4);

                }
                else if(time.charAt(i) == 'P')
                {
                    terminal.moveTo(yPosition + 4, xPosition - 15);
                    terminal.write("PPPPPP");
                    terminal.moveTo(yPosition + 5, xPosition - 15);
                    terminal.write("PPPPPP");
                    terminal.moveTo(yPosition + 6, xPosition - 15);
                    terminal.write("P    ");
                    terminal.moveTo(yPosition + 7, xPosition - 15);
                    terminal.write("P     ");
                    DateTime.pause(0.4);
                }

                else if(time.charAt(i) == 'A')
                {
                    terminal.moveTo(yPosition + 4, xPosition - 15);
                    terminal.write("    A  ");
                    terminal.moveTo(yPosition + 5, xPosition - 15);
                    terminal.write("  A    A");
                    terminal.moveTo(yPosition + 6, xPosition - 15);
                    terminal.write(" A  AA  A ");
                    terminal.moveTo(yPosition + 7, xPosition - 15);
                    terminal.write("A        A");
                    DateTime.pause(0.4);
                }

                else if(time.charAt(i) == 'M')
                {
                    terminal.moveTo(yPosition + 4, xPosition - 20);
                    terminal.write("MM   MM");
                    terminal.moveTo(yPosition + 5, xPosition - 20);
                    terminal.write("M  M  M");
                    terminal.moveTo(yPosition + 6, xPosition - 20);
                    terminal.write("M     M");
                    terminal.moveTo(yPosition + 7, xPosition - 20);
                    terminal.write("M     M");
                    DateTime.pause(0.4);
                }
                xPosition += 18;
            }
             else
                break;
        }
    }
}
