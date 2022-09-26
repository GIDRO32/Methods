import java.util.Scanner;
public class Main
{
    public static String getUserInput(String prompt)
    {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().trim().toLowerCase();
    }
    public static void printTime(int hour, int minute)
    {
        if(hour < 10)
        {
            System.out.print("0" + hour);
            System.out.print(":");
            System.out.println(minute);
        }
        else if(minute < 10)
        {
            System.out.print(hour);
            System.out.print(":");
            System.out.println("0" + minute);
        }
        else
        {
            System.out.print(hour);
            System.out.print(":");
            System.out.println(minute);
        }
    }
    public static boolean toContinue()
    {
        String userInput = getUserInput("Do you want to continue? (Y/N)\n");
        return userInput.equalsIgnoreCase("Y");
    }

    public static void main(String[] args)
    {
        do
        {
            Scanner key = new Scanner(System.in);
            int hour = 0;
            int minute = 0;
            System.out.println("What time is it? type hours");
            hour = key.nextInt();
            System.out.println("And minutes");
            minute = key.nextInt();
            printTime(hour, minute);
        }
        while(toContinue());
    }
}