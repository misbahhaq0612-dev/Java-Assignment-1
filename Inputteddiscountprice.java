import java.util.Scanner;
public class Inputteddiscountprice{
    
    public static void main(String[] args) {
        double csp;
        double dp;
        double da;
        double dsp;
        Scanner read= new Scanner(System.in);
        System.out.print("Enter current selling price ");
       csp= read.nextDouble();
        System.out.print("Enter discount price ");
       dp= read.nextDouble();
         da=csp*dp/100;
         dsp=csp-da;
       
       System.out.println("Price after discunt " + dsp);
       
       read.close(); 

        
    }
}


