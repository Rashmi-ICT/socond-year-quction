import java.util.Scanner;

public class circum {
    public static void main(String[] args) {
        System.out.println(" \t\t ~ calculate circumference and area of the circle ~");
        System.out.println("-----------------------------------------------------------------\n");

                Scanner x= new Scanner(System.in);

                System.out.print("Enter the length :");

                double A = x.nextDouble();

                System.out.print("Enter the width :");

                double B = x.nextDouble();

                double  P =2*(A+B);

                System.out.println("perimeter of Rectangle is: " + P);

                double c= A*B;
                System.out.println("CIRU of Rectangle is %.2: " + c);



            }
}


