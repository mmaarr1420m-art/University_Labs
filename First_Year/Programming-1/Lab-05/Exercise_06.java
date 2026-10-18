import java.util.Scanner;

public class Exercise_06 
{
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        for(int i = 1; i <= number; i++)
        {
            System.out.println(7 * i);
        }  
        in.close();
    }
}
