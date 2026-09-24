import java.util.Scanner;

public class Exercise_03 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Number of minutes : ");
        double minutes = in.nextDouble();
        
        System.out.println();
        
        double year = minutes / (365 * 24 * 60);     
        double remainingMinutes = minutes % (365 * 24 * 60);
        double day = remainingMinutes / (24 * 60);
        
        System.out.print(minutes + " is approximately " + (int)year + " years and " + (int)day + " days"  );
        in.close();
    }
}