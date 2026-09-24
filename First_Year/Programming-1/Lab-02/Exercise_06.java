import java.util.Scanner;

public class Exercise_06 
{
    public static void main(String[] arge)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter your full name : ");
        String name = in.nextLine();
        
        System.out.print("Sex : ");
        char sex = in.next().charAt(0);
        
        System.out.println("A reservation has been made for the following huest : ");
        System.out.println(name + "(" + sex + ")");
        in.close();
    }
}