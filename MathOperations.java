
/**
 * Write a description of class MathOperations here.
 *
 * @author sofiya
 * @version v112
 */
public class MathOperations
{public static void main(String[] args){
    int a=10;
    int b=20;
    int c=a+b;
    int d=b-a;
    int e=a*b;
    int f=b/a;
    
    //arithmetic
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    
    //relational
    System.out.println(a==b);
    System.out.println(a!=b);
    System.out.println(a>b);
    System.out.println(a<b);
    
    //unary
    System.out.println(++a);//pre
    System.out.println(a++);//post
    System.out.println(--b );
    System.out.println(b-- );
    
    //logical
    int g=40;
    int h=50;
    int i=60;
     if (g>h && g>i)
     System.out.println("g is greatest number");
     else if (i>g || i>h)
     System.out.println("i is greatest number");
    
    
    
    
    //ternary
    int age=18;
       String isvalid= (age >=18 )?"Driving is allowed " :"Driving is not allowed";
       System.out.println(isvalid);




}
}