import java.util.Scanner;

public class Exercise_03 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
       System.out.print("Enter String 1 ");
       String string1 = in.nextLine();
       
       System.out.print("Enter String 2 ");
       String string2 = in.nextLine();
       
       String prefix = "";
       for(int i = 0; i < string1.length() && i < string2.length() ; i++ )
       {
           if(string1.charAt(i) == string2.charAt(i))
           {
               prefix += string1.charAt(i) ;
           } 
       }
       System.out.println("Longest common prefix " + prefix);
       in.close();
    }
}
