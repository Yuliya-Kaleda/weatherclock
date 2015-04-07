package nyc.c4q.ac21.weatherclock;
import java.util.Calendar;

/**
 * Created by July on 4/5/15.
 */
public class ClockPrinting
{
    public static void clockPrinting(String user, Calendar cal, AnsiTerminal terminal, int numCols, int numRows)
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
        coverLetters = "                                                                                                        ";

        terminal.setTextColor(AnsiTerminal.Color.RED);


        int yPosition = (numRows / 2) - 10;
        int xPosition = (numCols / 2) - 40;


        int count = 0;
        for(int i = 0; i <= time.length(); i++)
        {

            // moving time numbers will go only 3 cycles
            if (count!=3) {

                if(i == time.length())
                {
                    count++;
                    DateTime.pause(2.0);
                    i = -1;
                    yPosition = (numRows / 2) - 10;
                    xPosition = (numCols / 2) - 40;
                    terminal.setTextColor(AnsiTerminal.Color.BLACK, false);
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write(coverLetters);
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write(coverLetters);
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write(coverLetters);
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write(coverLetters);
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write(coverLetters);
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write(coverLetters);
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write(coverLetters);
                    DateTime.pause(2.0);
                    terminal.setTextColor(AnsiTerminal.Color.CYAN, true);
                    continue;
                }

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
                    terminal.write("    __  __       ");
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write(" __(__)(__)__    ");
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("(__)   __ (__)   ");
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("      (__)__     ");
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("         (__)__  ");
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write(" __  __  __ (__) ");
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("(__)(__)(__)(__) ");
                    DateTime.pause(0.4);
                }
                else if(time.charAt(i) == '4')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("         __      ");
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write("     __ (__)     ");
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write(" __ (__)(__)     ");
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("(__) __ (__) __  ");
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("(__)(__)(__)(__) ");
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("        (__)     ");
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("        (__)     ");
                    DateTime.pause(0.4);
                }

                else if(time.charAt(i) == '5')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write(" __  __  __      ");
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write("(__)(__)(__)     ");
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("(__) __  __      ");
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("(__)(__)(__)     ");
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("        (__)     ");
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write(" __  __ (__)     ");
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("(__)(__)         ");
                    DateTime.pause(0.4);
                }

                else if(time.charAt(i) == '6')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("     __  __  __  ");
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write(" __ (__)(__)(__) ");
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("(__) __  __      ");
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("(__)(__)(__) __  ");
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("(__)        (__) ");
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("(__) __  __ (__) ");
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("(__)(__)(__)(__) ");
                    DateTime.pause(0.4);
                }

                else if(time.charAt(i) == '7')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write(" __   __  __  __ ");
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write("(__) (__)(__)(__)");
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("           __(__)");
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("       __ (__)   ");
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("    __(__)        ");
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write(" __(__)           ");
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("(__)              ");
                    DateTime.pause(0.4);
                }

                else if(time.charAt(i) == '8')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("    __  __  __    ");
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write(" __(__)(__)(__)__ ");
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("(__) __    __ (__)");
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write(" __ (__)  (__) __ ");
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("(__)          (__)");
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("(__)__  __  __(__)");
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("   (__)(__)(__)   ");
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
                    terminal.write("     __  __       ");
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write(" __ (__)(__) __   ");
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("(__)        (__)  ");
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("(__)        (__)  ");
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("(__)        (__)  ");
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("(__) __  __ (__)  ");
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("    (__)(__)      ");
                    DateTime.pause(0.4);

                }
                else if(time.charAt(i) == ':')
                {
                    terminal.moveTo(yPosition + 1, xPosition);
                    terminal.write("       __ ");
                    terminal.moveTo(yPosition + 2, xPosition);
                    terminal.write("      (__)");
                    terminal.moveTo(yPosition + 3, xPosition);
                    terminal.write("      (__)");
                    terminal.moveTo(yPosition + 4, xPosition);
                    terminal.write("          ");
                    terminal.moveTo(yPosition + 5, xPosition);
                    terminal.write("       __ ");
                    terminal.moveTo(yPosition + 6, xPosition);
                    terminal.write("      (__)");
                    terminal.moveTo(yPosition + 7, xPosition);
                    terminal.write("      (__)");
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