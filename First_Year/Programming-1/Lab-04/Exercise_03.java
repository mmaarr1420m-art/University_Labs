import java.util.Scanner;

public class Exercise_03 
{
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("*** FCIT Money Exchange Query ***");
        System.out.println();
        System.out.println("1.\t Qatari Riyal to Saudi Riyal");
        System.out.println("2.\t Bahraini Dinar to Saudi Riyal");
        System.out.println("3.\t UAE Dirham to Saudi Riyal");
        System.out.println();
        
        System.out.print("Choose type of conversion : ");
        int conversionType = in.nextInt();
        
        double convertedAmount = 0;
        
        if(conversionType == 1)
        {
            System.out.print("Enter the amount (in QR) : ");
            double amount = in.nextDouble();
            convertedAmount = amount * 1.03;
        }
        else if (conversionType == 2)
        {
             System.out.print("Enter the amount (in BD) : ");
            double amount = in.nextDouble();
            convertedAmount = amount * 9.97;
        }
        else if (conversionType == 3)
        {
             System.out.print("Enter the amount (in UAED) : ");
            double amount = in.nextDouble();
            convertedAmount = amount * 1.021;
        }
           
        System.out.println("The amount entered is equivalent to SAR " + convertedAmount);
        in.close(); 
    }
}
