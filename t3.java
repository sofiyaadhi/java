
/**
 * Write a description of class t3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class t3
{
    int age; //instance variable
    static int qty; //static variable
    public static void main(String[] args){
        
        
        int n1=10; //local variable
        
        //implicit typecasting
    
        double dt=n1;
        System.out.println(dt);
        
        
        //explicit type casting
        
        double db= 10.01;
        int itr= (int)db;
        
        System.out.println(itr); 
        
        //finding min, max, size and bytes
        
        System.out.println(Byte.MAX_VALUE);//returns max
        System.out.println(Byte.MIN_VALUE);//returns min
        System.out.println(Byte.SIZE);//returns bits
        System.out.println(Byte.BYTES);//returns bytes
        
        //escape sequence
        
        System.out.println("hello\nWorld");// new line
        System.out.println("Hamro\tNepal");//tab
        System.out.println("He said \" hi \" ");//quatation
        System.out.println("pareena said \" bro \" ");
        
        //unicode escape
        
        System.out.println("\u2764");
    }
    }
