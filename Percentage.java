import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {  
        double obm;
        double max;
        double per;
       Scanner read= new Scanner(System.in);
       System.out.print("Enter Obtained Marks ");
       obm= read.nextDouble();
       System.out.print("Enter Maximum Marks ");
       max= read.nextDouble();
       per=(obm/max)*100;
       System.out.print("Percentage "+ per + "%");
       read.close(); 
      
    
    }
}
