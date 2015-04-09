package nyc.c4q.ac21.weatherclock;
import java.util.Calendar;

/**
 * Created by ELVIS BOVES on 4/8/15.
 */
public class CalendarDone {


    public static void printMonthCalendar(Calendar date, AnsiTerminal terminal, int yPosition, int xPosition) {
        // Extract year, month, and day for our date.
        int year = date.get(Calendar.YEAR);
        int month = date.get(Calendar.MONTH);
        int day = date.get(Calendar.DAY_OF_MONTH);

        terminal.moveTo(yPosition,xPosition);
        // First, show the month name and year.
        terminal.moveTo(yPosition++, xPosition + 9);
        terminal.write(DateTime.getMonthNames().get(month) + " " + year);
        terminal.moveTo(yPosition++, xPosition);
        terminal.moveTo(yPosition++, xPosition);
        terminal.write("Su  Mo  Tu  We  Th  Fr  Sa");
        // Start the calendar on the first day of the month.
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);
        terminal.moveTo(yPosition++ ,xPosition);

        // We may need to indent the first line, since some of the days
        // in the first week may not belong to this month.
        int indent = cal.get(Calendar.DAY_OF_WEEK) - Calendar.SUNDAY;
        for (int i = 0; i < indent; ++i)
            // We use four spaces for each day, below.

            terminal.write("    ");

        // Now print each day of the month.  Keep going until we hit the next month.
        while (cal.get(Calendar.YEAR) == year && cal.get(Calendar.MONTH) == month) {
            // Print the day of the month.  Make sure to always print exactly
            // two characters.
            int d = cal.get(Calendar.DAY_OF_MONTH);
            if (d < 10) terminal.write(" ");

            if (d == day){
                // Today!  Mark the day.

                terminal.setTextColor(AnsiTerminal.Color.RED);
                terminal.write("" + d);
                terminal.write("*");
                terminal.setTextColor(AnsiTerminal.Color.BLUE);

            }
            else
            {
                // Not today; leave some space.
                terminal.write("" + d);
                terminal.write(" ");

            }
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
                // Saturday: move on to the next line for the next date.
                terminal.moveTo(yPosition++, xPosition);
            else
                // Other days: just leave an extra space.
                terminal.write(" ");

            // On to the next day.
            cal = DateTime.getNextDay(cal);
        }
        terminal.moveTo(yPosition++, xPosition);
        //terminal.scroll(5);
    }

}

