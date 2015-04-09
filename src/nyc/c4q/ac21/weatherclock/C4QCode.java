package nyc.c4q.ac21.weatherclock;
/**
 * Created by ELVIS BOVES on 4/9/15.
 */
public class C4QCode
{

    public static void c4qCode(AnsiTerminal terminal, int numCol, int numRow)
    {
        int yPosition;
        int xPosition;
        terminal.setTextColor(AnsiTerminal.Color.GREEN);

        yPosition =(numRow / 2) + 10;
        xPosition = (numCol / 2) - 90;
        terminal.moveTo(yPosition + 1, xPosition);
        terminal.write("■ ■ ■  ■   ■  ■ ■ ■   ");
        terminal.moveTo(yPosition + 2, xPosition);
        terminal.write("■      ■   ■  ■   ■   ");
        terminal.setTextColor(AnsiTerminal.Color.WHITE);
        terminal.moveTo(yPosition + 3, xPosition);
        terminal.write("■      ■ ■ ■  ■ ■ ■   ");
        terminal.moveTo(yPosition + 4, xPosition);
        terminal.write("■          ■  ■ ■ ■   ");
        terminal.moveTo(yPosition + 5, xPosition);
        terminal.write("■ ■ ■      ■       ■  ");


    }

    public static void c4qCalendar(AnsiTerminal terminal, int numCol, int numRow)
    {
        int yPosition;
        int xPosition;
        terminal.setTextColor(AnsiTerminal.Color.GREEN);

        yPosition =(numRow / 2) + 15;
        xPosition = (numCol / 2) - 90;
        terminal.moveTo(yPosition + 1, xPosition);
        terminal.write("■ ■ ■  ■ ■ ■  ■      ■ ■ ■  ■     ■  ■ ■ ■     ■ ■ ■  ■ ■ ■    ");
        terminal.moveTo(yPosition + 2, xPosition);
        terminal.write("■      ■   ■  ■      ■      ■ ■   ■  ■     ■   ■   ■  ■     ■  ");
        terminal.setTextColor(AnsiTerminal.Color.WHITE);
        terminal.moveTo(yPosition + 3, xPosition);
        terminal.write("■      ■ ■ ■  ■      ■ ■ ■  ■  ■  ■  ■      ■  ■ ■ ■  ■   ■    ");
        terminal.moveTo(yPosition + 4, xPosition);
        terminal.write("■      ■   ■  ■      ■      ■   ■ ■  ■     ■   ■   ■  ■    ■   ");
        terminal.moveTo(yPosition + 5, xPosition);
        terminal.write("■ ■ ■  ■   ■  ■ ■ ■  ■ ■ ■  ■     ■  ■ ■ ■     ■   ■  ■     ■  ");
    }
}