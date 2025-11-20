import java.util.Scanner;

/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2
{public static void main(String[] args){
Scanner scan=new Scanner(System.in); 

System.out.println("enter the grades");
         int grades = scan.nextInt();
         
         String assign= (grades >=40 )? "Pass\tCan go to higher" : "Fail \n cannot go to higher grade";
       System.out.println(assign);




}
 }