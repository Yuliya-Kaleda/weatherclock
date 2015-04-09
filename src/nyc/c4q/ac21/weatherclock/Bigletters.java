package nyc.c4q.ac21.weatherclock;
/**
 * Created by July on 4/9/15.
 */
public class Bigletters
{

    public static void bigLetters(AnsiTerminal terminal, int numCols, int numRows)
    {

        int yPosition;
        int xPosition;
        terminal.setTextColor(AnsiTerminal.Color.CYAN);

        yPosition = (numRows / 2) + 10;
        xPosition = (numCols / 2) - 90;
        terminal.moveTo(yPosition + 1, xPosition);
        terminal.setTextColor(AnsiTerminal.Color.CYAN);
        terminal.write("               __    __            __ ");
        terminal.moveTo(yPosition + 2, xPosition);
        terminal.setTextColor(AnsiTerminal.Color.GREEN);
        terminal.write("              /  |  /  |          /  | ");
        terminal.moveTo(yPosition + 3, xPosition);
        terminal.setTextColor(AnsiTerminal.Color.MAGENTA);
        terminal.write("      _______ $$ |  $$ |  ______  $$ |");
        terminal.moveTo(yPosition + 4, xPosition);
        terminal.setTextColor(AnsiTerminal.Color.CYAN);
        terminal.write("    /$$$$$$$/ $$    $$ |/$$$$$$  |$$ |    ");
        terminal.moveTo(yPosition + 5, xPosition);
        terminal.setTextColor(AnsiTerminal.Color.GREEN);
        terminal.write("    $$ |      $$$$$$$$ |$$ |  $$ |$$/     ");
        terminal.moveTo(yPosition + 6, xPosition);
        terminal.setTextColor(AnsiTerminal.Color.MAGENTA);
        terminal.write("    $$ \\_____       $$ |$$ \\__$$ | __  ");
        terminal.moveTo(yPosition + 7, xPosition);
        terminal.setTextColor(AnsiTerminal.Color.CYAN);
        terminal.write("    $$       |      $$ |$$    $$ |/  |");
        terminal.moveTo(yPosition + 8, xPosition);
        terminal.setTextColor(AnsiTerminal.Color.GREEN);
        terminal.write("     $$$$$$$/       $$/  $$$$$$$ |$$/ ");
        terminal.moveTo(yPosition + 9, xPosition);
        terminal.setTextColor(AnsiTerminal.Color.MAGENTA);
        terminal.write("                             $$ |  ");
        terminal.moveTo(yPosition + 10, xPosition);
        terminal.setTextColor(AnsiTerminal.Color.MAGENTA);
        terminal.write("                             $$ |  ");
    }
}