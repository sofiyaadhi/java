import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Write a description of class rickshawfare here.
 *
 * @author sofiya
 * @version v12
 */
public class rickshawfare
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Enter distance travelled (in km): ");
        double distance = scan.nextDouble();

        System.out.print("Enter travel time (in minutes): ");
        double time = scan.nextDouble();

        System.out.print("Is the customer a local? (yes/no): ");
        String isLocalScan = scan.next().toLowerCase();

        System.out.print("Is it night-time travel? (yes/no): ");
        String isNightScan = scan.next().toLowerCase();

        double baseFare = 50;
        double perKm = 18;    
        double perMin = 1.5;   

      
        double totalFare = baseFare + (distance * perKm) + (time * perMin);

        boolean isLocal = isLocalScan.equals("yes");
        double discount = (isLocal && distance > 8) ? totalFare * 0.15 : 0;

        boolean isNight = isNightScan.equals("yes");
        double nightCharge = isNight ? totalFare * 0.25 : 0;

      
        double finalFare = totalFare - discount + nightCharge;

        System.out.println("\n---------------------------------------");
        System.out.println("          Rickshaw Fare Total         ");
        System.out.println("---------------------------------------");
        System.out.println("Base Fare:            Rs. " + df.format(baseFare));
        System.out.println("Distance Charge:      Rs. " + df.format(distance * perKm));
        System.out.println("Time Charge:          Rs. " + df.format(time * perMin));
        System.out.println("Local Discount:       - Rs. " + df.format(discount));
        System.out.println("Night-time Surcharge: + Rs. " + df.format(nightCharge));
        System.out.println("---------------------------------------");
        System.out.println(" Final Fare:         Rs. " + df.format(finalFare));
        System.out.println("---------------------------------------");
    }
}
    
    
    
    
  
