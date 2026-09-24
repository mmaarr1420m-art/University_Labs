import java.util.Scanner;

public class Exercise_02 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the subtotal : ");
        double subTotal = in.nextDouble();
        
        System.out.println();
        
        System.out.print("Enter the tip rate : ");
        double Tip_Rate = in.nextDouble() / 100;
        
         System.out.println();
        
        double subTotalTip = subTotal *  Tip_Rate ;
        double totalResult = subTotalTip + subTotal;
        
        System.out.print("The tip is " + subTotalTip + " and the total is " + totalResult + " SAR" );
        in.close();
    }
}