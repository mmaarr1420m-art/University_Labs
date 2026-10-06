import java.util.Scanner;

public class Exercise_04
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter tow characters: ");
        char major = in.next().charAt(0);
        char city = in.next().charAt(0);
        
        if(major == 'M')
            System.out.print("Mathematics ");
        else if(major == 'C')
            System.out.print("Computer Science ");
        else if(major == 'I')
            System.out.print("Information Technology ");
        else
            System.out.print("Invalid major ");
        
         if(city == 'J')
            System.out.print("From Jeddah ");
        else if(city == 'M')
            System.out.print("From Meccah ");
        else if(city == 'T')
            System.out.print("From Taif ");
         else if(city == 'R')
            System.out.print("From Riyadh ");
         else if(city == 'O')
            System.out.print("Other ");
         else
            System.out.print("- Invalid city ");

        in.close();
    }
}
