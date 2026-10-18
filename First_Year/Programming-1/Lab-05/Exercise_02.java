import java.util.Scanner;

public class Exercise_02 
{
    public static void main(String[] args)
    {
  
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        int sum = 0;
        int i = 1;
        
        do
        {
            if(number % i == 0)
                sum+=i;
            
            i++;
            
        }while(i < number);
        
        if(sum == number)
           System.out.println(number + " is a perfect number");
       else
           System.out.println(number + " is not a perfect number"); 

       in.close();
    }
}
