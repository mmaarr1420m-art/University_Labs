import java.util.Scanner;

public class Exercise_04 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter speed and acceleration of the aircraft: "); 
        
        double speed = in.nextDouble(); 
        double acceleration = in.nextDouble();
        
        double length = ( speed * speed ) / (2 * acceleration);
        
        System.out.print("The minimum runway length for this aircraft " + length );  
        in.close();
    }
}