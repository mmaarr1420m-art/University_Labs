import java.util.Scanner;

public class Exercise_05 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number brtween 0 and 1000: ");
        int number = in.nextInt();
        
        double sum = (number%10) + ((number / 10) % 10) + ((number / 100 ) % 10);
        
        System.out.print("The sum of the digits is " + (int)sum);
        in.close();
    }
}