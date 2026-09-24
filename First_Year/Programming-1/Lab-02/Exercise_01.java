import java.util.Scanner;

public class Exercise_01 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number in pounds : ");
        double poundes = in.nextDouble();
        
        double kilogramsResult = poundes * 0.454;
        
        System.out.print(poundes + " poundes is " + kilogramsResult + " kilogram " );
        in.close();
    }
}
