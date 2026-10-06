import java.util.Scanner;

public class Exercise_02 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter lowercase English letter: ");
        char letter = in.next().charAt(0);
        
       if(letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z')
       {
           if(letter == 'a' || letter == 'A' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U' || letter == 'i' || letter == 'I' || letter == 'e' || letter == 'E' )
           
               System.out.println(letter + " is a vowel");
           
           else
               System.out.println(letter + " is a letter");
       }
       else
        System.out.println(letter + " is not a lowercase letter");
       in.close();
    }
}
