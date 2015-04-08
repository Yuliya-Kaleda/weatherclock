package nyc.c4q.ac21.weatherclock;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by July on 4/6/15.
 */
public class SecondsPrinting
{

    public static void secondPrinting(String seconds, AnsiTerminal terminal)
    {

        int yPosition = 35;
        int xPosition = 70;


                for(int i = 0; i <= seconds.length(); i++)
                {

                        if(i == seconds.length())
                        {
                            break;
                        }

                        if(seconds.charAt(i) == '1')
                        {
                            terminal.moveTo(yPosition + 1, xPosition);
                            terminal.write("  #                    ");
                            terminal.moveTo(yPosition + 2, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 3, xPosition);
                            terminal.write(" #                     ");
                            terminal.moveTo(yPosition + 4, xPosition);
                            terminal.write(" #                     ");
                            terminal.moveTo(yPosition + 5, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 6, xPosition);
                        }

                        else if(seconds.charAt(i) == '2')
                        {
                            terminal.moveTo(yPosition + 1, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 2, xPosition);
                            terminal.write("  #                    ");
                            terminal.moveTo(yPosition + 3, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 4, xPosition);
                            terminal.write("#                      ");
                            terminal.moveTo(yPosition + 5, xPosition);
                            terminal.write("###                    ");
                        }
                        else if(seconds.charAt(i) == '3')
                        {
                            terminal.moveTo(yPosition + 1, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 2, xPosition);
                            terminal.write("  #                    ");
                            terminal.moveTo(yPosition + 3, xPosition);
                            terminal.write(" ##                    ");
                            terminal.moveTo(yPosition + 4, xPosition);
                            terminal.write("  #                    ");
                            terminal.moveTo(yPosition + 5, xPosition);
                            terminal.write("###                    ");

                        }
                        else if(seconds.charAt(i) == '4')
                        {
                            terminal.moveTo(yPosition + 1, xPosition);
                            terminal.write("#  #                   ");
                            terminal.moveTo(yPosition + 2, xPosition);
                            terminal.write("#  #                   ");
                            terminal.moveTo(yPosition + 3, xPosition);
                            terminal.write("####                   ");
                            terminal.moveTo(yPosition + 4, xPosition);
                            terminal.write("   #                   ");
                            terminal.moveTo(yPosition + 5, xPosition);
                            terminal.write("   #                   ");
                        }
                        else if(seconds.charAt(i) == '5')
                        {
                            terminal.moveTo(yPosition + 1, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 2, xPosition);
                            terminal.write("#                      ");
                            terminal.moveTo(yPosition + 3, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 4, xPosition);
                            terminal.write("  #                    ");
                            terminal.moveTo(yPosition + 5, xPosition);
                            terminal.write("###                    ");
                        }

                        else if(seconds.charAt(i) == '6')
                        {
                            terminal.moveTo(yPosition + 1, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 2, xPosition);
                            terminal.write("#                      ");
                            terminal.moveTo(yPosition + 3, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 4, xPosition);
                            terminal.write("# #                    ");
                            terminal.moveTo(yPosition + 5, xPosition);
                            terminal.write("###                    ");
                        }

                        else if(seconds.charAt(i) == '7')
                        {
                            terminal.moveTo(yPosition + 1, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 2, xPosition);
                            terminal.write("  #                    ");
                            terminal.moveTo(yPosition + 3, xPosition);
                            terminal.write("  #                    ");
                            terminal.moveTo(yPosition + 4, xPosition);
                            terminal.write("  #                    ");
                            terminal.moveTo(yPosition + 5, xPosition);
                            terminal.write("  #                    ");
                        }

                        else if(seconds.charAt(i) == '8')
                        {
                            terminal.moveTo(yPosition + 1, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 2, xPosition);
                            terminal.write("# #                    ");
                            terminal.moveTo(yPosition + 3, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 4, xPosition);
                            terminal.write("# #                    ");
                            terminal.moveTo(yPosition + 5, xPosition);
                            terminal.write("###                    ");
                        }
                        else if(seconds.charAt(i) == '9')
                        {
                            terminal.moveTo(yPosition + 1, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 2, xPosition);
                            terminal.write("# #                    ");
                            terminal.moveTo(yPosition + 3, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 4, xPosition);
                            terminal.write("  #                    ");
                            terminal.moveTo(yPosition + 5, xPosition);
                            terminal.write("###                    ");

                        }
                        else if(seconds.charAt(i) == '0')
                        {
                            terminal.moveTo(yPosition + 1, xPosition);
                            terminal.write("###                    ");
                            terminal.moveTo(yPosition + 2, xPosition);
                            terminal.write("# #                    ");
                            terminal.moveTo(yPosition + 3, xPosition);
                            terminal.write("# #                    ");
                            terminal.moveTo(yPosition + 4, xPosition);
                            terminal.write("# #                    ");
                            terminal.moveTo(yPosition + 5, xPosition);
                            terminal.write("###                    ");
                        }
                        xPosition += 7;
                    }

                    }
                }