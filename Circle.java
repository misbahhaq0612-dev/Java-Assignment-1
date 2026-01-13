import java.util.Scanner;
public class Circle {
    
    public static void main(String[] args) {
        double rad;
        double cir;
        double area;

        Scanner read= new Scanner(System.in);

       System.out.print("Enter radius of circle ");
       rad= read.nextDouble();

        cir=2*Math.PI*rad;
        area=Math.PI*rad*rad;
        
       System.out.println("Circumference of circle: " + cir);
       System.out.println("Area of circle: " + area);
       read.close(); 

        
    }
}
