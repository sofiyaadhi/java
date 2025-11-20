import java.util.Scanner;

/**
 * Write a description of class ausadipasal here.
 *
 * @author sofiya
 * @version 15
 */
public class ausadipasal
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in); 
        
        System.out.println("enter medicine price");
        int price=scan.nextInt();
        
        
         System.out.println("enter  medicine name");
         String name=scan.nextLine();
         
         System.out.println("enter quantity in grams");
         int quantity = scan.nextInt();
         
         
         System.out.println(name + " price " + price + " price for each " + quantity + "gram");
         
         
         
         
    }
}