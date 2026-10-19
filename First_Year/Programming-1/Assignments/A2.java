import java.util.Scanner;
public class A2 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Input Information :-
        System.out.print("Enter first station: ");
        int firstStation = in.nextInt();
        
        System.out.print("Enter last station: ");
        int lastStation = in.nextInt();
        
        System.out.println();
         
        /////////////////////////////////////////////////////
         
         String routeDirection = "";
         int routeDistance = 0;
         String routeCode = "";
         
         // Comparing & Print Result
         if(firstStation < lastStation)
         {
             routeDirection = "Ascending";
             routeDistance = lastStation - firstStation;
             routeCode = "A-" + firstStation + "-" + lastStation ;
             
             System.out.println("Route Direction: " + routeDirection);
             System.out.println("Route Distance: " + routeDistance);
             System.out.println("Route Code: " + routeCode);
  
         }
         
         else if(firstStation > lastStation)
         {
             routeDirection = "Descending";
             routeDistance = firstStation - lastStation ;
             routeCode = "D-" + firstStation + "-" + lastStation ;
             
             System.out.println("Route Direction: " + routeDirection);
             System.out.println("Route Distance: " + routeDistance);
             System.out.println("Route Code: " + routeCode);
         }
         
         else
             System.out.println("Invalid Route!");
         
         in.close();
    }
}
