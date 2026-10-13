import java.util.Scanner;

public class Exercise_04 
{
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
    
            System.out.print("Enter day of the week (as a number): ");
            int weekNumber = in.nextInt();
    
            switch(weekNumber)
            {
            case 1:
                System.out.print("\nIt is Sunday");
                break;
    
            case 2:
                System.out.print("\nIt is Monday");
                break;
    
            case 3:
                System.out.print("\nIt is Tuesday");
                break;
    
            case 4:
                System.out.print("\nIt is Wednesday");
                break;
    
            case 5:
                System.out.print("\nIt is Thursday");
                break;
    
            case 6:
                System.out.print("\nIt is Friday");
                break;
    
            case 7:
                System.out.print("\nIt is Saturday");
                break;
    
            default:
                System.out.print("\nInvalid day number");
            }
            in.close();
        }
}