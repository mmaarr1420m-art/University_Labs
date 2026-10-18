import java.util.Scanner;

public class Exercise_05 
{
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
       System.out.print("Enter a number: ");
       int number = in.nextInt();
       
       int factorial = 1;
       for (int i = number; i > 0; i--)
       {
           factorial *= i; 
       }
       
       System.out.println("Factorial of " + number + " is " + factorial);
       in.close();
    }
}
