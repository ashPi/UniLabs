import java.util.Scanner;

public class CalculatingWeekDay 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter day: ");
    int day = in.nextInt();
    System.out.println("");
    System.out.print("Enter month: ");
    int month = in.nextInt();
    System.out.println("");
    System.out.print("Enter year: ");
    int year = in.nextInt();
    in.close();
    System.out.println("");
    int shiftedYear = year;
    if(month <= 2 ) shiftedYear--;
    int y1 = shiftedYear / 100;
    int y2 = shiftedYear % 100;
    int shiftedMonth = month - 2;
    if(shiftedMonth <= 0) shiftedMonth+= 12;
    int weekDayNumber = (int)((day + Math.floor(2.6 * shiftedMonth - 0.2) + y2 + Math.floor(y1 / 4) + 
                               Math.floor(y2 / 4) - 2 * y1) % 7);
    System.out.printf("%2d-%2d-%4d was a ", day, month, year);
    if(weekDayNumber == 0) System.out.println("Sunday");
    if(weekDayNumber == 1) System.out.println("Monday");
    if(weekDayNumber == 2) System.out.println("Tuesday");
    if(weekDayNumber == 3) System.out.println("Wednesday");
    if(weekDayNumber == 4) System.out.println("Thursday");
    if(weekDayNumber == 5) System.out.println("Friday");
    if(weekDayNumber == 6) System.out.println("Saturday");
  }
}