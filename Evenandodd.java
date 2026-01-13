import java.util.Scanner;
public class Evenandodd{
    public static void main(String[]args){
        double x;
        Scanner read= new Scanner(System.in);
        System.out.print("Enter a number ");
        x= read.nextDouble();

        if(x%2==1)
        {
            System.out.print(x +" is odd ");
        }
        else
             System.out.print( x +" is even ");
            read.close();

    }
}