import java.util.Scanner;

public class Exercise_03 
{
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int number = in.nextInt();
        double division = number / 2.0;
        
        if(division % 2 == 0)
            System.out.println("YES");
        else
             System.out.println("NO");
        in.close();
    }
}
