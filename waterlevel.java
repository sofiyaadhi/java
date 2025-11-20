import java.util.Scanner;

/**
 * Write a description of class waterlevel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class waterlevel
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter water level");
        int waterlevel=scan.nextInt();
        String isValid=(waterlevel>=1000)?"warning:water level has reached 1000l or more!!":"normal status";
        System.out.println(isValid);
        
        
    
    
    }
}