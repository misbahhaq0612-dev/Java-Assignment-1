
import java.util.Scanner;
public class Discountprice{
    
    public static void main(String[] args) {
        double csp;
        double dp;
        double da;
        double dsp;

        Scanner read= new Scanner(System.in);

        System.out.print("Enter current selling price ");
        csp= read.nextDouble();
        System.out.print("Enter discount percent ");
        dp= read.nextDouble();
       
         da=csp*dp/100;
         dsp=csp-da;
       
       System.out.println("Price after discount " + dsp);
       
       read.close(); 

        
    }
}
