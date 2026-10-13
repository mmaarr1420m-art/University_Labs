import java.util.Scanner;

public class Exercise_02
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter weight of package (in Kg): ");
        double weight = in.nextDouble();

        double totalCost = 0;

        if (0 < weight && weight <= 1)
            totalCost = 1.15 * 30 * weight;

        else if (1 < weight && weight <= 3)
            totalCost = 1.15 * 50 * weight;

        else if (3 < weight && weight <= 10)
            totalCost = 1.15 * 70 * weight;

        else if (10 < weight && weight <= 20)
            totalCost = 1.15 * 100 * weight;

        System.out.printf("Total cost for shopping (including VAT): SAR %.2f" , totalCost);
        in.close();
    }
}


