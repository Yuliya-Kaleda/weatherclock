package nyc.c4q.ac21.weatherclock;
import java.util.Calendar;

/**
 * Created by ELVIS BOVES on 4/7/15.
 */
public class WeekDays {

    public static void daysPrinting(Calendar cal, AnsiTerminal terminal, int numCols, int numRows)
    {
        int dayOfWeek = (cal.get(Calendar.DAY_OF_WEEK));
        //        Random randomColors = new Random();
        //        int n = randomColors.nextInt(255);
        terminal.setTextColor(AnsiTerminal.Color.BLUE);
        int monthOfYears = (cal.get(Calendar.DAY_OF_MONTH));
        int yPosition;
        int xPosition;

        if(dayOfWeek == Calendar.SUNDAY)
        {
            yPosition =(numRows / 2) - 15;
            xPosition = (numCols / 2) - 20;
            terminal.moveTo(yPosition + 1, xPosition);
            terminal.write("■ ■ ■  ■   ■  ■     ■  ■ ■ ■    ■ ■ ■  ■     ■ ");
            terminal.moveTo(yPosition + 2, xPosition);
            terminal.write("■      ■   ■  ■ ■   ■  ■    ■   ■   ■   ■   ■  ");
            terminal.moveTo(yPosition + 3, xPosition);
            terminal.write("■ ■ ■  ■   ■  ■  ■  ■  ■     ■  ■ ■ ■    ■ ■   ");
            terminal.moveTo(yPosition + 4, xPosition);
            terminal.write("    ■  ■   ■  ■   ■ ■  ■    ■   ■   ■     ■    ");
            terminal.moveTo(yPosition + 5, xPosition);
            terminal.write("■ ■ ■  ■ ■ ■  ■     ■  ■ ■ ■    ■   ■     ■    ");
            //terminal.write("NOOOOOOO TOMORROW IS MONDAY!!! "); //CRYING PERSON
        }
        else if(dayOfWeek == Calendar.MONDAY)
        {

            yPosition =(numRows / 2) - 15;
            xPosition = (numCols / 2) - 23 ;
            terminal.moveTo(yPosition + 1, xPosition);
            terminal.write("■         ■  ■ ■ ■  ■     ■  ■ ■ ■    ■ ■ ■  ■     ■ ");
            terminal.moveTo(yPosition + 2, xPosition);
            terminal.write("■ ■     ■ ■  ■   ■  ■ ■   ■  ■    ■   ■   ■   ■   ■  ");
            terminal.moveTo(yPosition + 3, xPosition);
            terminal.write("■  ■   ■  ■  ■   ■  ■  ■  ■  ■     ■  ■ ■ ■    ■ ■   ");
            terminal.moveTo(yPosition + 4, xPosition);
            terminal.write("■   ■ ■   ■  ■   ■  ■   ■ ■  ■    ■   ■   ■     ■    ");
            terminal.moveTo(yPosition + 5, xPosition);
            terminal.write("■    ■    ■  ■ ■ ■  ■     ■  ■ ■ ■    ■   ■     ■    ");
            terminal.write("MONDAY WHYY???? YOU SHOULD TAKE A VACATION"); //CRYING PERSON
        }
        else if(dayOfWeek == Calendar.TUESDAY)
        {
            yPosition =(numRows / 2) - 15;
            xPosition = (numCols / 2) - 24;
            terminal.moveTo(yPosition + 1, xPosition);
            terminal.write("■ ■ ■ ■  ■   ■  ■ ■ ■  ■ ■ ■  ■ ■ ■    ■ ■ ■  ■     ■ ");
            terminal.moveTo(yPosition + 2, xPosition);
            terminal.write("   ■     ■   ■  ■      ■      ■    ■   ■   ■   ■   ■  ");
            terminal.moveTo(yPosition + 3, xPosition);
            terminal.write("   ■     ■   ■  ■ ■ ■  ■ ■ ■  ■     ■  ■ ■ ■    ■ ■   ");
            terminal.moveTo(yPosition + 4, xPosition);
            terminal.write("   ■     ■   ■  ■          ■  ■    ■   ■   ■     ■    ");
            terminal.moveTo(yPosition + 5, xPosition);
            terminal.write("   ■     ■ ■ ■  ■ ■ ■  ■ ■ ■  ■ ■ ■    ■   ■     ■    ");
        }
        else if(dayOfWeek == Calendar.WEDNESDAY)
        {
            yPosition =(numRows / 2) - 15;
            xPosition = (numCols / 2)- 36;
            terminal.moveTo(yPosition + 1, xPosition);
            terminal.write("■    ■    ■  ■ ■ ■  ■ ■ ■     ■     ■  ■ ■ ■  ■ ■ ■  ■ ■ ■     ■ ■ ■  ■     ■ ");
            terminal.moveTo(yPosition + 2, xPosition);
            terminal.write("■   ■ ■   ■  ■      ■     ■   ■ ■   ■  ■      ■      ■     ■   ■   ■   ■   ■  ");
            terminal.moveTo(yPosition + 3, xPosition);
            terminal.write("■  ■   ■  ■  ■ ■ ■  ■      ■  ■  ■  ■  ■ ■ ■  ■ ■ ■  ■      ■  ■ ■ ■    ■ ■   ");
            terminal.moveTo(yPosition + 4, xPosition);
            terminal.write("■ ■     ■ ■  ■      ■     ■   ■   ■ ■  ■          ■  ■     ■   ■   ■     ■    ");
            terminal.moveTo(yPosition + 5, xPosition);
            terminal.write("■         ■  ■ ■ ■  ■ ■ ■     ■     ■  ■ ■ ■  ■ ■ ■  ■ ■ ■     ■   ■     ■    ");
            terminal.moveTo(yPosition + 6, xPosition);
            //terminal.write("NOOOOOOO TOMORROW IS MONDAY!!! "); //CRYING PERSON
        }
        else if(dayOfWeek == Calendar.THURSDAY)
        {
            yPosition =(numRows / 2) - 15;
            xPosition = (numCols / 2)- 30;
            terminal.moveTo(yPosition + 1, xPosition);
            terminal.write("■ ■ ■ ■  ■       ■   ■  ■ ■ ■    ■ ■ ■  ■ ■ ■    ■ ■ ■  ■     ■ ");
            terminal.moveTo(yPosition + 2, xPosition);
            terminal.write("   ■     ■       ■   ■  ■     ■  ■      ■    ■   ■   ■   ■   ■  ");
            terminal.moveTo(yPosition + 3, xPosition);
            terminal.write("   ■     ■ ■ ■   ■   ■  ■   ■    ■ ■ ■  ■     ■  ■ ■ ■    ■ ■   ");
            terminal.moveTo(yPosition + 4, xPosition);
            terminal.write("   ■     ■    ■  ■   ■  ■    ■       ■  ■    ■   ■   ■     ■    ");
            terminal.moveTo(yPosition + 5, xPosition);
            terminal.write("   ■     ■    ■  ■ ■ ■  ■     ■  ■ ■ ■  ■ ■ ■    ■   ■     ■    ");
            terminal.write("YEAHH TODAY IS DEMO DAY");
        }
        else if(dayOfWeek == Calendar.FRIDAY)
        {

            yPosition =(numRows / 2) - 15;
            xPosition = (numCols / 2)- 20;
            terminal.moveTo(yPosition + 1, xPosition);
            terminal.write("■ ■ ■  ■ ■ ■   ■ ■ ■  ■ ■ ■     ■ ■ ■  ■     ■ ");
            terminal.moveTo(yPosition + 2, xPosition);
            terminal.write("■      ■    ■    ■    ■     ■   ■   ■   ■   ■  ");
            terminal.moveTo(yPosition + 3, xPosition);
            terminal.write("■ ■    ■  ■      ■    ■      ■  ■ ■ ■    ■ ■   ");
            terminal.moveTo(yPosition + 4, xPosition);
            terminal.write("■      ■   ■     ■    ■     ■   ■   ■     ■    ");
            terminal.moveTo(yPosition + 5, xPosition);
            terminal.write("■      ■    ■  ■ ■ ■  ■ ■ ■     ■   ■     ■    ");
            terminal.write("FRIDAY IS THAT YOU "); //HAPPY PERSON
        }
        else
        {
            yPosition =(numRows / 2) - 15;
            xPosition = (numCols / 2)- 30;
            terminal.moveTo(yPosition + 1, xPosition);
            terminal.write("■ ■ ■  ■ ■ ■  ■ ■ ■ ■  ■   ■  ■ ■ ■    ■ ■ ■     ■ ■ ■  ■     ■ ");
            terminal.moveTo(yPosition + 2, xPosition);
            terminal.write("■      ■   ■     ■     ■   ■  ■     ■  ■     ■   ■   ■   ■   ■  ");
            terminal.moveTo(yPosition + 3, xPosition);
            terminal.write("■ ■ ■  ■ ■ ■     ■     ■   ■  ■   ■    ■      ■  ■ ■ ■    ■ ■   ");
            terminal.moveTo(yPosition + 4, xPosition);
            terminal.write("    ■  ■   ■     ■     ■   ■  ■    ■   ■     ■   ■   ■     ■    ");
            terminal.moveTo(yPosition + 5, xPosition);
            terminal.write("■ ■ ■  ■   ■     ■     ■ ■ ■  ■     ■  ■ ■ ■     ■   ■     ■    ");

        }
    }
}
