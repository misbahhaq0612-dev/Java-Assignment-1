import java.util.Scanner;

public class Originalprice {
    public static void main(String[] args) {

        double discountedprice;
        double discountpercent;
        double originalprice;

        Scanner read = new Scanner(System.in);

        System.out.print("Enter discounted selling price: ");
        discountedprice = read.nextDouble();
        System.out.print("Enter discount percentage: ");
        discountpercent = read.nextDouble();

        originalprice = (discountedprice * 100) / (100 - discountpercent);

        System.out.println("Original Selling Price = " + originalprice);
        read.close();
    }
}

