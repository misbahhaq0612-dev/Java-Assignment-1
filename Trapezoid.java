import java.util.Scanner;
public class Trapezoid {
    
    public static void main (String[]args){
      double k;
      double a;
      double b;
      double h;
      Scanner read= new Scanner(System.in);
      System.out.print("Enter lenght1 of trapezoid ");
      a= read.nextDouble();
      System.out.print("Enter lenght2 of trapezoid ");
      b= read.nextDouble();
      System.out.print("Enter perpendicular distance of trapezoid ");
      h= read.nextDouble();
      k=h*(a+b)/2;
      System.out.print("Area of trapezoid: "+ k);
       read.close();


    }
}
