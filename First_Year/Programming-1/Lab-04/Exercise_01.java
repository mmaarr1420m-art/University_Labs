import java.util.Scanner;

public class Exercise_01 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number (Rock: 0, Paper: 1, Scissors: 2)");
        int userChoice = in.nextInt();
        
        int computerChoice = (int)(Math.random() * 3);
        
        String gameResult = "";
        String computerChoiceName = "";
        
       if (userChoice == 0 && computerChoice == 2)
           gameResult= "You Win :)";

       else if (userChoice == 1 && computerChoice == 0)
           gameResult= "You Win :)";

       else if (userChoice == 2 && computerChoice == 1)
            gameResult= "You Win :)";

       else if (userChoice == 2 && computerChoice == 2)
            gameResult= "Draw :/";

        else if (userChoice == 0 && computerChoice == 0)
            gameResult= "Draw :/";
            
        else if (userChoice == 1 && computerChoice == 1)
            gameResult= "Draw :/";
        
       else
           gameResult= "You lose :(";
           
       switch(computerChoice)
       {
           case 0:
            computerChoiceName= "Rock";
            break;
            
           case 1:
            computerChoiceName= "Paper";
            break;
            
            case 2:
            computerChoiceName= "Scissors";
            break;     
       }
       
       System.out.print("The computer choice was " + computerChoiceName + ", It is " + gameResult);
       in.close();
    }
}
