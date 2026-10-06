public class Exercise_01 
{
    public static void main(String[] args)
    {
        
    double Number1 =  (Math.random() * (20 + 20)) - 20;
    double Number2 =  (Math.random() * (20 + 20)) - 20;
    
    System.out.println("First number: " + Number1) ;
    System.out.println("Second number: " + Number2) ;
    
    if(Number1 > Number2)
        System.out.println("The larger number is " + Number1) ;
    
    else
        System.out.println("The larger number is " + Number2);
    }
}
