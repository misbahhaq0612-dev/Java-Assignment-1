import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {  
        double obt;
        double max;
        double per;
        
       Scanner read= new Scanner(System.in);
       System.out.print("Enter Obtained Marks ");
       obt= read.nextDouble();
       System.out.print("Enter Maximum Marks ");
       max= read.nextDouble();
         per=(obt/max)*100;

       System.out.print("Percentage "+ per + "%");
       read.close(); 
      
    
    }
}
