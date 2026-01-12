import java.util.Scanner;
public class Watts {
    public static void main (String[]args){
     double watt;
     double amp;
     double volt;
     Scanner read = new Scanner(System.in);
     System.out.print("Enter voltage: ");
     volt= read. nextDouble();
     System.out.print("Enter ampere: ");
     amp= read. nextDouble();
     watt= volt*amp;
     System.out.print("Watts: "+ watt);
     read.close();

    }
    
}
