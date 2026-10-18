import java.util.Scanner;

public class Exercise_01 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first number ");
        int number1 = in.nextInt();
        System.out.print("Enter second number ");
        int number2 = in.nextInt();
        
        if (number1 > number2)
        {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        int sum = 0;
        for(int i = number1; i <= number2; i++)
        {
            sum += i;
        }
        
        System.out.println("The sum is = " + sum); 
        in.close(); 
    }
}
