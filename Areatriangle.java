import java.util.Scanner;
public class Areatriangle {
    public static void main(String[]args){
        double a;
        double b;
        double c;
        double s;
        double area;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter lenght1 of triangle ");
        a= read.nextDouble();
        System.out.print("Enter lenght2 of triangle ");
        b= read.nextDouble();
        System.out.print("Enter lenght3 of triangle ");
        c= read.nextDouble();
         
        if(a+b>c && a+c>b && b+c>a){
         System.out.println("Triangle is valid");
            s=(a+b+c)/2;
            area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
         System.out.print("Area of triangle is: "+ area);
        }
        else
         System.out.println("Triangle is invalid");
         read.close();
    }
    
}
